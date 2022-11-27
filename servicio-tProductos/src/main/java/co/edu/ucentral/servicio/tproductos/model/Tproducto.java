package co.edu.ucentral.servicio.tproductos.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import co.edu.ucentral.common.envio.model.Envio;
import co.edu.ucentral.common.tarifa.model.Tarifas;


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
	private float peso;
	
	@NotNull(message="NO puede ser nulo")
	@Positive(message="No puede ser negativo")
	private float volumen;
	
	@NotNull(message="NO puede ser nulo")
	@Positive(message="No puede ser negativo")
	private float trasnporte; /// Poner una lista de opciones y cada una se envia un valor diferente
	
	@NotNull(message="NO puede ser nulo")
	@Positive(message="No puede ser negativo")
	private float fragilidad;///Poner una lista de opciones y cada una se envia un valor diferente
	
	//Se utiliza para gurdar el precio que tiene enviar 
	//este producto con todas las tarifas que esten activas
	@NotNull(message="NO puede ser nulo")
	@Positive(message="No puede ser negativo")
	private float valor;
	
	@ManyToOne
	@JoinColumn(name ="tarifa_id")
	private Tarifas tarifa;
	
	@JsonIgnoreProperties(value= {"t_producto"})
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="envio_id")
	private Envio envio;
	
	
	
	
	//-----------Relaciones---------------------//
	
	/*@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "mercancia_id")
	private TipoMercancia mercancia;
	
	
	public TipoMercancia getMercancia() {
		return mercancia;
	}


	public void setMercancia(TipoMercancia mercancia) {
		this.mercancia = mercancia;
	}*/


	//-----------------------------------------//

	

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

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getVolumen() {
		return volumen;
	}

	public void setVolumen(float volumen) {
		this.volumen = volumen;
	}

	public float getTrasnporte() {
		return trasnporte;
	}

	public void setTrasnporte(float trasnporte) {
		this.trasnporte = trasnporte;
	}

	public float getFragilidad() {
		return fragilidad;
	}

	public void setFragilidad(float fragilidad) {
		this.fragilidad = fragilidad;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public Tarifas getTarifa() {
		return tarifa;
	}

	public void setTarifa(Tarifas tarifa) {
		this.tarifa = tarifa;
	}

	public Envio getEnvio() {
		return envio;
	}

	public void setEnvio(Envio envio) {
		this.envio = envio;
	}
	
	private static final long serialVersionUID = 1L;
	
}
