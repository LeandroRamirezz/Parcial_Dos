package co.edu.usco.pw.springboot_crud01.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "asignaturas")
public class Asignatura {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Size(max = 30, message = "El nombre no debe superar los 30 caracteres de longitud.")
    private String nombre;

    @Size(max = 100, message = "La descripción no debe superar los 100 caracteres.")
    private String descripcion;

    private int salon;
    private String horario;

    @ManyToOne
    @JoinColumn(name = "docente_id")
    private Docente docenteEncargado;

    public Asignatura() {
        super();
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getSalon() {
		return salon;
	}

	public void setSalon(int salon) {
		this.salon = salon;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Docente getDocenteEncargado() {
		return docenteEncargado;
	}

	public void setDocenteEncargado(Docente docenteEncargado) {
		this.docenteEncargado = docenteEncargado;
	}

    
}