package com.oscarrdrgz.universidad.servicios.implementaciones;

import com.oscarrdrgz.universidad.modelo.entidades.Persona;
import com.oscarrdrgz.universidad.modelo.entidades.enumeradores.TipoEmpleado;
import com.oscarrdrgz.universidad.repositorio.EmpleadoRepository;
import com.oscarrdrgz.universidad.repositorio.PersonaRepository;
import com.oscarrdrgz.universidad.servicios.contratos.EmpleadoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmpleadoDAOImpl extends PersonaDAOImpl implements EmpleadoDAO {
@Autowired
    public EmpleadoDAOImpl(@Qualifier("empleadoRepository") PersonaRepository repository) {
        super(repository);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Persona> findEmpleadoByTipo(TipoEmpleado tipoEmpleado) {
        return ((EmpleadoRepository)repository).findEmpleadosByTipoEmpleado(tipoEmpleado);
    }

}
