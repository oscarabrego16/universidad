package com.oscarrdrgz.universidad.repositorio;

import com.oscarrdrgz.universidad.modelo.entidades.Empleado;
import com.oscarrdrgz.universidad.modelo.entidades.Persona;
import com.oscarrdrgz.universidad.modelo.entidades.Profesor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static com.oscarrdrgz.universidad.datos.DatosDummy.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
class PersonaRepositoryTest {

    @Autowired
    @Qualifier("repositorioAlumnos")
    PersonaRepository alumnoRepository;

    @Autowired
    @Qualifier("empleadoRepository")
    PersonaRepository empleadoRepository;

    @Autowired
    @Qualifier("profesorRepository")
    PersonaRepository profesorRepository;

    @Test
    void buscarPorNombreYApellido() {
        //Given
        Persona save = empleadoRepository.save(empleado01());

        //When
        Optional<Persona> expected = empleadoRepository.buscarPorNombreYApellido(empleado01().getNombre(),empleado01().getApellido());
        //then
        assertThat(expected.get()).isInstanceOf(Empleado.class);
        assertThat(expected.get()).isEqualTo(save);

    }

    @Test
    void buscarPorDni() {
        //given
        Persona save = profesorRepository.save(profesor01());
        //when
        Optional<Persona> expected = profesorRepository.buscarPorDni(profesor01().getDni());
        //then
        assertThat(expected.get()).isInstanceOf(Profesor.class);
        assertThat(expected.get()).isEqualTo(save);
        assertThat(expected.get().getDni()).isEqualTo(save.getDni());
    }

    @Test
    void buscarPorApellido() {
        //given
        Iterable<Persona> personas = alumnoRepository.saveAll(
                Arrays.asList(alumno01(),
                        alumno02(),
                        alumno03())
        );
        //when
        String apellido = "Benitez";
        List<Persona> expected = (List<Persona>) alumnoRepository.buscarPorApellido(apellido);
        //then
        assertThat(expected.size()==2).isTrue();
    }
}