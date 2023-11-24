package com.oscarrdrgz.universidad.servicios.contratos;

import com.oscarrdrgz.universidad.modelo.entidades.Pabellon;

import java.time.LocalDateTime;
import java.util.Optional;

public interface PabellonDAO extends GenericoDAO<Pabellon> {
    Iterable<Pabellon> findPabellonesPorLocalidad(String localidad);
    Optional<Pabellon> findPabellonByNombreIgnoreCase(String nombre);
    Iterable<Pabellon> findPabellonsByFechaAltaBetween(LocalDateTime desde, LocalDateTime hasta);
}
