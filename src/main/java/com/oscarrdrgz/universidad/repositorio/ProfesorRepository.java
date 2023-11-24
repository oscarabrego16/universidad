package com.oscarrdrgz.universidad.repositorio;

import com.oscarrdrgz.universidad.modelo.entidades.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepository extends PersonaRepository{
    @Query("select p from Profesor  p join fetch p.carreras c where c.nombre = ?1")
    Iterable<Persona> findProfesoresByCarrera(String carrera);
}
