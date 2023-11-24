package com.oscarrdrgz.universidad.repositorio;

import com.oscarrdrgz.universidad.modelo.entidades.Persona;
import com.oscarrdrgz.universidad.modelo.entidades.enumeradores.TipoEmpleado;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends PersonaRepository{
    @Query("select e from Empleado e where e.tipoEmpleado=?1")
    Iterable<Persona> findEmpleadosByTipoEmpleado(TipoEmpleado tipoEmpleado);
}
