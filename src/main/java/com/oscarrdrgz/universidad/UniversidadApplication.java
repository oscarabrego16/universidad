package com.oscarrdrgz.universidad;

import com.oscarrdrgz.universidad.modelo.entidades.Alumno;
import com.oscarrdrgz.universidad.modelo.entidades.Direccion;
import com.oscarrdrgz.universidad.modelo.entidades.Persona;
import com.oscarrdrgz.universidad.servicios.contratos.AlumnoDAO;
import com.oscarrdrgz.universidad.servicios.contratos.PersonaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class UniversidadApplication {
/*
    @Autowired
    private PersonaDAO service;
*/
@Autowired
private AlumnoDAO servicio;
public static void main(String[] args) {
    String[] beanDefinitionNames =
            SpringApplication.run(UniversidadApplication.class, args).getBeanDefinitionNames();
}/*
    public CommandLineRunner runner() {
        return args -> {
            Direccion direccion = new Direccion("calle lomina", "123","9400","","","Abril");
            Persona alumno = new Alumno(null, "Juan", "Palacios", "684736834", direccion);
            Persona save = servicio.save(alumno);
            System.out.println(save.toString());

            List<Persona> alumnos = (List<Persona>) servicio.findAll();
            alumnos.forEach(System.out::println);
        };
    }*/
    /*
    @Bean
    public CommandLineRunner runner(){
        return  args -> {
            Direccion direccion = new Direccion("Calle prueba","11","1143","La Libe","24","Mauricios");
            Persona alumno = new Alumno(null,"Oscar", "Rodriguez","0263839-2",direccion);
            Persona save = service.save(alumno);

            System.out.println(save.toString());
            Iterable<Persona> alumnos = service.findAll();
            alumnos.forEach(System.out::println);
        };

    }
    */


}
