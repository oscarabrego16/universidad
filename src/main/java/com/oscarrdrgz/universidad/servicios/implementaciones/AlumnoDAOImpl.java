package com.oscarrdrgz.universidad.servicios.implementaciones;

import com.oscarrdrgz.universidad.modelo.entidades.Aula;
import com.oscarrdrgz.universidad.modelo.entidades.Persona;
import com.oscarrdrgz.universidad.modelo.entidades.enumeradores.Pizarron;
import com.oscarrdrgz.universidad.repositorio.AlumnoRepository;
import com.oscarrdrgz.universidad.repositorio.PersonaRepository;
import com.oscarrdrgz.universidad.servicios.contratos.AlumnoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class AlumnoDAOImpl extends PersonaDAOImpl implements AlumnoDAO {
@Autowired
    public AlumnoDAOImpl(@Qualifier("repositorioAlumnos") PersonaRepository repository) {
        super(repository);
    }


    @Override
    @Transactional(readOnly = true)
    public Iterable<Persona> buscarAlumnosPorNombreCarrera(String nombre) {
        return ((AlumnoRepository)repository).buscarAlumnosPorNombreCarrera(nombre);
    }

}
