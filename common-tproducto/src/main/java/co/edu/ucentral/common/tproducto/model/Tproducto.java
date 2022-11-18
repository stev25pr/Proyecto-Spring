package co.edu.ucentral.common.tproducto.model;

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
@Table(name="t_producto")
public class Tproducto implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	
	@NotEmpty(message="No puede ser vacio")
	@Size(min=5, max=30, message="Carateres min 5 y max 30")
	private String nombre;
	
	@NotEmpty(message="No puede ser vacio")
	@Size(min=5, max=30, message="Carateres min 5 y max 30")
	private String descripcion;
	
	@NotNull(message="NO puede ser nulo")
	@Positive(message="No puede ser negativo")
	private double peso;
	
	@NotNull(message="NO puede ser nulo")
	@Positive(message="No puede ser negativo")
	private double volumen;
	
	//Se utiliza para gurdar el precio que tiene enviar 
	//este producto con todas las tarifas que esten activas
	@NotNull(message="NO puede ser nulo")
	@Positive(message="No puede ser negativo")
	private double valor;
	
	
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