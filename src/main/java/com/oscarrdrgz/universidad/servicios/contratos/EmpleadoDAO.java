package com.oscarrdrgz.universidad.servicios.contratos;

import com.oscarrdrgz.universidad.modelo.entidades.Persona;
import com.oscarrdrgz.universidad.modelo.entidades.enumeradores.TipoEmpleado;

public interface EmpleadoDAO extends PersonaDAO{
    Iterable<Persona> findEmpleadoByTipo(TipoEmpleado tipoEmpleado);
}
