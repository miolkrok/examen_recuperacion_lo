package ec.edu.uce.service;


public interface IBodegueroService {
	
	void ingresarInventario(String numero,String codigoBarrasMaestro,Integer cantidad);
	void eliminarProductoSinRegistrado(Integer id);
			

}
