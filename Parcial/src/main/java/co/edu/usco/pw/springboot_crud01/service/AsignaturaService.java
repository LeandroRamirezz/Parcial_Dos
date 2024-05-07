package co.edu.usco.pw.springboot_crud01.service;

import java.util.List;

import co.edu.usco.pw.springboot_crud01.model.Asignatura;

public interface AsignaturaService {

    List<Asignatura> getAllAsignaturas();
    Asignatura getAsignaturaById(long id);
    Asignatura saveAsignatura(Asignatura asignatura);
    Asignatura updateAsignatura(Asignatura asignatura);
    void deleteAsignatura(long id);
}