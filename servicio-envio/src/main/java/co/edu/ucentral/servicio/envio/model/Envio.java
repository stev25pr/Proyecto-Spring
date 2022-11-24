package co.edu.ucentral.servicio.envio.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import co.edu.ucentral.common.tproducto.model.Tproducto;

@Entity
@Table(name = "envio")
public class Envio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String origen;
	
	private String destino;
	
	private String direccion;
	
	@JsonIgnoreProperties(value= {"envio"}, allowSetters=true)
	@OneToMany(mappedBy ="envio", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Tproducto> tProductos;
	
	public Envio() {
		this.tProductos = new ArrayList<Tproducto>();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
