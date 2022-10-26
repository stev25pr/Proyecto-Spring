package co.edu.ucentral.common.tproducto.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import co.edu.ucentral.common.envio.model.Envio;



@Entity
@Table(name="t_producto")
public class Tproducto implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="id_envio")
	private Envio envio;
	
	private String nombre;
	private String descripcion;
	private double peso;
	private double volumen;
	//Se utiliza para gurdar el precio que tiene enviar 
	//este producto con todas las tarifas que esten activas
	private double valor;
	
	
	
	
	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public Envio getEnvio() {
		return envio;
	}




	public void setEnvio(Envio envio) {
		this.envio = envio;
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




	public double getPeso() {
		return peso;
	}




	public void setPeso(double peso) {
		this.peso = peso;
	}




	public double getVolumen() {
		return volumen;
	}




	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}




	public double getValor() {
		return valor;
	}




	public void setValor(double valor) {
		this.valor = valor;
	}




	private static final long serialVersionUID = 1L;
	
}
