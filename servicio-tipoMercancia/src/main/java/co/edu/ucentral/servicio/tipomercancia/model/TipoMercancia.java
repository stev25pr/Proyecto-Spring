package co.edu.ucentral.servicio.tipomercancia.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Entity
@Table(name="tipo_mercancia")
public class TipoMercancia implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message="No puede ser vacio")
	@Size(min=5, max=30, message="Carateres min 5 y max 30")
	private String nombre;
	
	@NotEmpty(message="No puede ser vacio")
	@Size(min=5, max=30, message="Carateres min 5 y max 30")
	private String descripcion;
	
	@NotNull(message="No puede ser nulo")
	@Positive(message="No pude ser negativo")
	private Float precio;
	
	
	
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



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public Float getPrecio() {
		return precio;
	}



	public void setPrecio(Float precio) {
		this.precio = precio;
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
