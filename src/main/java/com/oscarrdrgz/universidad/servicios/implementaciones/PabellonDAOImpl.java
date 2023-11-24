package com.oscarrdrgz.universidad.servicios.implementaciones;

import com.oscarrdrgz.universidad.modelo.entidades.Pabellon;
import com.oscarrdrgz.universidad.repositorio.PabellonRepository;
import com.oscarrdrgz.universidad.servicios.contratos.PabellonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class PabellonDAOImpl extends GenericoDAOImpl<Pabellon, PabellonRepository> implements PabellonDAO {

    @Autowired
    public PabellonDAOImpl(PabellonRepository repository) {
        super(repository);
    }

    @Override
    public Iterable<Pabellon> findPabellonesPorLocalidad(String localidad) {
        return repository.findPabellonsByDireccion_Localidad(localidad);
    }

    @Override
    public Optional<Pabellon> findPabellonByNombreIgnoreCase(String nombre) {
        return repository.findPabellonByNombreIgnoreCase(nombre);
    }

    @Override
    public Iterable<Pabellon> findPabellonsByFechaAltaBetween(LocalDateTime desde, LocalDateTime hasta) {
        return repository.findPabellonsByFechaAltaBetween(desde,hasta);
    }
}
