package ec.edu.uce.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="registro")
public class Registro {
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_registro")
	@SequenceGenerator(name = "seq_registro", sequenceName = "seq_registro", allocationSize = 1)
	@Id
	@Column(name="regi_id")
	private Integer id;
	@Column(name="regi_codigo_barras_individual")
	private String codigoBarrasIndividual;
	@Column(name="regi_")
	private String nombreHilo;
	@ManyToOne
	@JoinColumn(name="bode_id")
	private Bodega bodegaR;
	@ManyToOne
	@JoinColumn(name="prod_id")
	private Producto productoR;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCodigoBarrasIndividual() {
		return codigoBarrasIndividual;
	}
	public void setCodigoBarrasIndividual(String codigoBarrasIndividual) {
		this.codigoBarrasIndividual = codigoBarrasIndividual;
	}
	public String getNombreHilo() {
		return nombreHilo;
	}
	public void setNombreHilo(String nombreHilo) {
		this.nombreHilo = nombreHilo;
	}
	public Bodega getBodegaR() {
		return bodegaR;
	}
	public void setBodegaR(Bodega bodegaR) {
		this.bodegaR = bodegaR;
	}
	public Producto getProductoR() {
		return productoR;
	}
	public void setProductoR(Producto productoR) {
		this.productoR = productoR;
	}
	
	

}
