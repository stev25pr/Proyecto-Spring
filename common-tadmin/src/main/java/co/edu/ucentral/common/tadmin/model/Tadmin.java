package co.edu.ucentral.common.tadmin.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="t_admin")
public class Tadmin implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message="No puede ser vacio")
	@Size(min=5, max=30, message="Carateres min 5 y max 30")
	private String nombre;
	
	@NotEmpty(message="No puede ser vacio")
	@Size(min=5, max=30, message="Carateres min 5 y max 30")
	private String correo;
	
	@NotEmpty(message="No puede ser vacio")
	@Size(min=5, max=30, message="Carateres min 5 y max 30")
	private String contrasena;
	
	
		
	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	private static final long serialVersionUID = 1L;
}
