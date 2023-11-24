package com.oscarrdrgz.universidad.servicios.contratos;

import com.oscarrdrgz.universidad.modelo.entidades.Persona;

public interface ProfesorDAO extends PersonaDAO{
    Iterable<Persona> findProfesoresByCarrera(String nombre);
}
