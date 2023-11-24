package com.oscarrdrgz.universidad.repositorio;

import com.oscarrdrgz.universidad.modelo.entidades.Aula;
import com.oscarrdrgz.universidad.modelo.entidades.enumeradores.Pizarron;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface AulaRepository extends CrudRepository<Aula, Integer> {
    Iterable<Aula> findAulasByPizarron(Pizarron pizarron);
    Iterable<Aula> findAulasByPabellon_Nombre(String nombre);
    Optional<Aula> findAulaByNroAula(Integer nroAula);
}
