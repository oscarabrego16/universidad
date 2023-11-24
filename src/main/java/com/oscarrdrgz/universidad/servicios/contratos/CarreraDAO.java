package com.oscarrdrgz.universidad.servicios.contratos;

import com.oscarrdrgz.universidad.modelo.entidades.Carrera;

public interface CarreraDAO extends GenericoDAO<Carrera>{
    Iterable<Carrera> findCarrerasByNombreContains(String nombre);
    Iterable<Carrera> findCarrerasByNombreContainsIgnoreCase(String nombre);
    Iterable<Carrera> findCarrerasByCantidadAniosAfter(Integer anios);


}
