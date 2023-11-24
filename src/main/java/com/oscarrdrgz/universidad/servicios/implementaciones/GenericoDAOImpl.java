package com.oscarrdrgz.universidad.servicios.implementaciones;

import com.oscarrdrgz.universidad.servicios.contratos.GenericoDAO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public class GenericoDAOImpl <E,R extends CrudRepository<E, Integer>> implements GenericoDAO<E> {

    protected final R repository;

    public GenericoDAOImpl(R repository) {
        this.repository = repository;
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<E> findById(Integer id) {
        return repository.findById(id);
    }
    @Transactional
    @Override
    public E save(E entidad) {
        return repository.save(entidad);
    }
    @Transactional(readOnly = true)
    @Override
    public Iterable<E> findAll() {
        return repository.findAll();
    }
    @Transactional
    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
