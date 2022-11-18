package co.edu.ucentral.common.tcliente.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="t_cliente")
public class Tcliente implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message="No puede ser vacio")
	@Size(min=5, max=30, message="Carateres min 5 y max 30")
	private String documento;
	
	@NotEmpty(message="No puede ser vacio")
	@Size(min=5, max=30, message="Carateres min 5 y max 30")
	private String nombre;
	
	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getDocumento() {
		return documento;
	}



	public void setDocumento(String documento) {
		this.documento = documento;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
