package com.oscarrdrgz.universidad.servicios.implementaciones;

import com.oscarrdrgz.universidad.modelo.entidades.Aula;
import com.oscarrdrgz.universidad.modelo.entidades.enumeradores.Pizarron;
import com.oscarrdrgz.universidad.repositorio.AulaRepository;
import com.oscarrdrgz.universidad.servicios.contratos.AulaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AulaDAOImpl extends GenericoDAOImpl<Aula, AulaRepository>  implements AulaDAO {

@Autowired
    public AulaDAOImpl(AulaRepository repository) {
        super(repository);
    }

    @Override
    public Iterable<Aula> findAulasByPizarron(Pizarron pizarron) {
        return repository.findAulasByPizarron(pizarron);
    }

    @Override
    public Iterable<Aula> findAulasByPabellonNombre(String nombre) {
        return repository.findAulasByPabellon_Nombre(nombre);
    }

    @Override
    public Optional<Aula> findAulaByNroAula(Integer nroAula) {
        return repository.findAulaByNroAula(nroAula);
    }
}
