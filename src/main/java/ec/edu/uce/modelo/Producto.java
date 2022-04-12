package ec.edu.uce.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name="producto")
public class Producto {
	
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_mod")
	@SequenceGenerator(name = "seq_mod", sequenceName = "seq_mod", allocationSize = 1)
	@Id
	@Column(name="prod_id")
	private Integer id;
	@Column(name="prod_nombre")
	private String nombre;
	@Column(name="prod_codigo_barras_maestro")
	private String codigoBarrasMaestro;
	@Column(name="prod_stock")
	private Integer stock;
	@Column(name="prod_categoria")
	private String categoria;
	@OneToMany(mappedBy = "productoR",cascade=CascadeType.ALL)//De donde sale????
	private List<Registro> registroP;
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
	public String getCodigoBarrasMaestro() {
		return codigoBarrasMaestro;
	}
	public void setCodigoBarrasMaestro(String codigoBarrasMaestro) {
		this.codigoBarrasMaestro = codigoBarrasMaestro;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public List<Registro> getRegistroP() {
		return registroP;
	}
	public void setRegistroP(List<Registro> registroP) {
		this.registroP = registroP;
	}

	
	
	

}
