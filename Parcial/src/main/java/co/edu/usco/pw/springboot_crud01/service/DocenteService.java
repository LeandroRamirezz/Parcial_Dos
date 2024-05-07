package co.edu.usco.pw.springboot_crud01.service;

import java.util.List;

import co.edu.usco.pw.springboot_crud01.model.Docente;

public interface DocenteService {

    List<Docente> getAllDocentes();
    Docente getDocenteById(long id);
    Docente saveDocente(Docente docente);
    Docente updateDocente(Docente docente);
    void deleteDocente(long id);
}