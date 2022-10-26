package co.edu.ucentral.common.tlugares.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="t_lugares")
public class Tlugares implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre_lugar;
	private String valor_recibido;
	private String valor_envio;
	
	


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre_lugar() {
		return nombre_lugar;
	}


	public void setNombre_lugar(String nombre_lugar) {
		this.nombre_lugar = nombre_lugar;
	}


	public String getValor_recibido() {
		return valor_recibido;
	}


	public void setValor_recibido(String valor_recibido) {
		this.valor_recibido = valor_recibido;
	}


	public String getValor_envio() {
		return valor_envio;
	}


	public void setValor_envio(String valor_envio) {
		this.valor_envio = valor_envio;
	}


	private static final long serialVersionUID = 1L;
}
