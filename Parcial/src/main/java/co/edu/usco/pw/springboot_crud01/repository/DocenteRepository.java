package co.edu.usco.pw.springboot_crud01.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import co.edu.usco.pw.springboot_crud01.model.Docente;

@Repository
public interface DocenteRepository extends JpaRepository<Docente, Long> {

	
}