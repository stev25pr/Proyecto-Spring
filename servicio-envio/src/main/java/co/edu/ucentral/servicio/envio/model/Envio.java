package co.edu.ucentral.servicio.envio.model;

import java.io.Serializable;
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
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import co.edu.ucentral.common.tproducto.model.Tproducto;



@Entity
@Table(name="envio")
public class Envio implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotEmpty(message="No puede ser vacio")
	@Size(min=5, max=30, message="Carateres min 5 y max 30")
	private String estado;
	@NotEmpty(message="No puede ser vacio")
	@Size(min=5, max=30, message="Carateres min 5 y max 30")
	private String direccionRecibido;
	@NotEmpty(message="No puede ser vacio")
	@Size(min=5, max=30, message="Carateres min 5 y max 30")
	private String direccionEntrega;
	
	
	@JsonIgnoreProperties(value= {"envio"}, allowSetters=true)
	@OneToMany(mappedBy ="envio", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Tproducto> tProductos;
	
	public Envio() {
		this.tProductos = new ArrayList<Tproducto>();
		//Suma de todos los precios 
		/*for(int i=0,i<this.tProductos.size(),i=i+1) {
			float total = this.tProductos.precio();
	
		}*/
	}
		
	public List<Tproducto> gettProductos() {
		return tProductos;
	}
	
	public void settProductos(List<Tproducto> tProductos) {
		this.tProductos = tProductos;
	}
	
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
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}