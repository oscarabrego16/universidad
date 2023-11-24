package com.oscarrdrgz.universidad;

import com.oscarrdrgz.universidad.modelo.entidades.Alumno;
import com.oscarrdrgz.universidad.modelo.entidades.Carrera;
import com.oscarrdrgz.universidad.modelo.entidades.Direccion;
import com.oscarrdrgz.universidad.modelo.entidades.Persona;
import com.oscarrdrgz.universidad.repositorio.AlumnoRepository;
import com.oscarrdrgz.universidad.servicios.contratos.AlumnoDAO;
import com.oscarrdrgz.universidad.servicios.contratos.CarreraDAO;
import com.oscarrdrgz.universidad.servicios.contratos.PersonaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AlumnosCommand implements CommandLineRunner {

    @Autowired
    @Qualifier("alumnoDAOImpl")
    private PersonaDAO personaDAO;

    @Autowired
    private CarreraDAO carreraDAO;

    @Override
    public void run(String... args) throws Exception {

        Alumno alumno1 = new Alumno(null,"Oscar", "Abrego","059283-2", new Direccion());


        /*Optional<Carrera> ingSistemas = carreraDAO.findById(2);

        Iterable<Persona> alumnos = personaDAO.findAll();
        alumnos.forEach(alumno -> ((Alumno) alumno).setCarrera(ingSistemas.get()));
        alumnos.forEach(alumno -> personaDAO.save(alumno));*/
/*

        Optional<Persona> alumno_1 = personaDAO.findById(1);
        Optional<Persona> personaNomApe= personaDAO.buscarPorNombreYApellido(
                alumno_1.get().getNombre(), alumno_1.get().getApellido());
        System.out.println(personaNomApe.toString());

        Optional<Persona> personaDni = personaDAO.buscarPorDni(alumno_1.get().getDni());
        System.out.println(personaDni.toString());

        Iterable<Persona> personasApellido = personaDAO.buscarPersonaPorApellido(alumno_1.get().getApellido());
        personasApellido.forEach(System.out::println);
*/

    }
}
