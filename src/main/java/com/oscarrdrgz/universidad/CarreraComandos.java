package com.oscarrdrgz.universidad;

import com.oscarrdrgz.universidad.modelo.entidades.Carrera;
import com.oscarrdrgz.universidad.servicios.contratos.CarreraDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class CarreraComandos implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

    }
/*

    @Autowired
    private CarreraDAO servicio;

    @Override
    public void run(String... args) throws Exception {

        Carrera ingSistemas= new Carrera(null,"Ingenieria en sistemas",60,5);
        Carrera ingIndustrial= new Carrera(null,"Ingenieria Industrial",55,5);
        Carrera ingAlimentos= new Carrera(null,"Ingenieria en Alimentos",50,5);
        Carrera ingElectronica= new Carrera(null,"Ingenieria electronica",45,5);
        Carrera licSistemas= new Carrera(null,"Licenciatura en sistemas",40,5);
        Carrera licTurismo= new Carrera(null,"Lic Turismo",35,5);
        Carrera licYoga= new Carrera(null,"Lic  Yoga",30,5);
        Carrera licRecursos= new Carrera(null,"Lic RRHH",25,5);
        servicio.save(ingSistemas);
        servicio.save(ingIndustrial);
        servicio.save(ingAlimentos);
        servicio.save(ingElectronica);
        servicio.save(licSistemas);
        servicio.save(licTurismo);
        servicio.save(licYoga);
        servicio.save(licRecursos);



        List<Carrera> carreras =(List<Carrera> ) servicio.findCarrerasByNombreContains("Sistemas");
        carreras.forEach(System.out::println);

        List<Carrera> carrerasIgnoreCase1= (List<Carrera>)servicio.findCarrerasByNombreContainsIgnoreCase("Sistemas");
        List<Carrera> carrerasIgnoreCase2= (List<Carrera>)servicio.findCarrerasByNombreContainsIgnoreCase("SISTEMAS");
        carrerasIgnoreCase1.forEach(System.out::println);
        carrerasIgnoreCase2.forEach(System.out::println);

        List<Carrera> carrerasPorAnio = (List<Carrera>) servicio.findCarrerasByCantidadAniosAfter(3);
        carrerasPorAnio.forEach(System.out::println);


    */
    }


