package com.oscarrdrgz.universidad.repositorio;

import com.oscarrdrgz.universidad.modelo.entidades.Alumno;
import com.oscarrdrgz.universidad.modelo.entidades.Carrera;
import com.oscarrdrgz.universidad.modelo.entidades.Persona;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Arrays;
import java.util.List;

import static com.oscarrdrgz.universidad.datos.DatosDummy.*;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class AlumnoRepositoryTest {

    @Autowired
    @Qualifier("repositorioAlumnos")
    PersonaRepository alumnoRepository;
    @Autowired
    CarreraRepository carreraRepository;


    @Test
    void buscarAlumnosPorNombreCarrera() {
        Iterable<Persona> personas = alumnoRepository.saveAll(
                Arrays.asList
                        (
                                alumno01(),
                                alumno02(),
                                alumno03()
                )
        );
        Carrera save = carreraRepository.save(carrera01(false));
        personas.forEach(alumno->((Alumno)alumno).setCarrera(save));
        alumnoRepository.saveAll(personas);

        //when
        String carreraNombre = "Ingenieria en Sistemas";
        List<Persona> expected = (List<Persona>) ((AlumnoRepository)alumnoRepository).buscarAlumnosPorNombreCarrera(carreraNombre);
    }

    void buscarAlumnosPorNombreCarrerasSinValores(){

    }
}