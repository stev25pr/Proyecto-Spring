package co.edu.ucentral.common.envio.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import co.edu.ucentral.common.tadmin.model.Tadmin;
import co.edu.ucentral.common.tcliente.model.Tcliente;
import co.edu.ucentral.common.tlugares.model.Tlugares;

@Entity
@Table(name="envio")
public class Envio implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String estado;
	private String direccionRecibido;
	private String direccionEntrega;
	
	
	
	
	

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



	


	public String getDireccionRecibido() {
		return direccionRecibido;
	}



	public void setDireccionRecibido(String direccionRecibido) {
		this.direccionRecibido = direccionRecibido;
	}



	public String getDireccionEntrega() {
		return direccionEntrega;
	}



	public void setDireccionEntrega(String direccionEntrega) {
		this.direccionEntrega = direccionEntrega;
	}






	private static final long serialVersionUID = 1L;
}
