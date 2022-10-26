package co.edu.ucentral.servicio.transporte.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transporte")
public class Transporte implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre_transporte;
	private Float precio;
	
	

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNombre_transporte() {
		return nombre_transporte;
	}



	public void setNombre_transporte(String nombre_transporte) {
		this.nombre_transporte = nombre_transporte;
	}



	public Float getPrecio() {
		return precio;
	}



	public void setPrecio(Float precio) {
		this.precio = precio;
	}



	private static final long serialVersionUID = 1L;
}
