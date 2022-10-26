package co.edu.ucentral.common.tarifa.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tarifas")
public class Tarifas implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private double peso;
	private double volumen;
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
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



	private static final long serialVersionUID = 1L;
}
