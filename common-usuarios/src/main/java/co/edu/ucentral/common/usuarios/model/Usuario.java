package co.edu.ucentral.common.usuarios.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;



@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true, length = 40)
	private String username;
	private String passwords;
	private Boolean enableds;
	private String nombre;
	private String apellido; 
	@Column(unique = true)
	private String email;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name="usuario_roles", joinColumns=@JoinColumn(name="usuario_id"),inverseJoinColumns = @JoinColumn(name="role_id"), 
	uniqueConstraints= {@UniqueConstraint(columnNames= {"usuario_id","role_id"}) })
	private List<Role> roles;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return passwords;
	}

	public void setPassword(String password) {
		this.passwords = password;
	}

	public Boolean getEnabled() {
		return enableds;
	}

	public void setEnabled(Boolean enabled) {
		this.enableds = enabled;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	
	
	
}
