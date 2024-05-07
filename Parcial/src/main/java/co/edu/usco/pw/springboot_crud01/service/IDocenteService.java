package co.edu.usco.pw.springboot_crud01.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.usco.pw.springboot_crud01.model.Docente;
import co.edu.usco.pw.springboot_crud01.repository.DocenteRepository;

@Service
public class IDocenteService implements DocenteService {

    @Autowired
    private DocenteRepository docenteRepository;

    @Override
    public List<Docente> getAllDocentes() {
        return docenteRepository.findAll();
    }

    @Override
    public Docente getDocenteById(long id) {
        return docenteRepository.findById(id).orElse(null);
    }

    @Override
    public Docente saveDocente(Docente docente) {
        return docenteRepository.save(docente);
    }

    @Override
    public Docente updateDocente(Docente docente) {
        return docenteRepository.save(docente);
    }

    @Override
    public void deleteDocente(long id) {
        docenteRepository.deleteById(id);
    }
}