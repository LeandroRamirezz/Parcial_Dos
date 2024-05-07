package co.edu.usco.pw.springboot_crud01.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.usco.pw.springboot_crud01.model.Asignatura;
import co.edu.usco.pw.springboot_crud01.repository.AsignaturaRepository;

@Service
public class IAsignaturaService implements AsignaturaService {

    @Autowired
    private AsignaturaRepository asignaturaRepository;

    @Override
    public List<Asignatura> getAllAsignaturas() {
        return asignaturaRepository.findAll();
    }

    @Override
    public Asignatura getAsignaturaById(long id) {
        return asignaturaRepository.findById(id).orElse(null);
    }

    @Override
    public Asignatura saveAsignatura(Asignatura asignatura) {
        return asignaturaRepository.save(asignatura);
    }

    @Override
    public Asignatura updateAsignatura(Asignatura asignatura) {
        return asignaturaRepository.save(asignatura);
    }

    @Override
    public void deleteAsignatura(long id) {
        asignaturaRepository.deleteById(id);
    }
}