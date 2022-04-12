package ec.edu.uce.modelo;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="bodega")
public class Bodega {
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_bodega")
	@SequenceGenerator(name = "seq_bodega", sequenceName = "seq_bodega", allocationSize = 1)
	@Id
	@Column(name="bode_id")
	private Integer id;
	@Column(name="bode_nombre")
	private String nombre;
	@Column(name="bode_numero")
	private BigDecimal numero;
	@Column(name="bode_direccion")
	private String direccion;
	@Column(name="bode_telefonos")
	private String telefonos;
	@OneToMany(mappedBy = "bodegaR",cascade=CascadeType.ALL)//De donde sale????
	private List<Registro> registroB;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public BigDecimal getNumero() {
		return numero;
	}
	public void setNumero(BigDecimal numero) {
		this.numero = numero;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefonos() {
		return telefonos;
	}
	public void setTelefonos(String telefonos) {
		this.telefonos = telefonos;
	}
	public List<Registro> getRegistroB() {
		return registroB;
	}
	public void setRegistroB(List<Registro> registroB) {
		this.registroB = registroB;
	}

}
