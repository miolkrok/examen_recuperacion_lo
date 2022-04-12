package ec.edu.uce.service;

import java.util.List;

import ec.edu.uce.modelo.Producto;

public interface IProductoService {

	void insertar(Producto producto);
	void actualizar(Producto producto);
	Producto buscarPorId(Integer id);
	void borrarPorId(Integer id);
	List<Producto> buscarProductoTodos();
	Producto buscarProductoPorCodigoBarrasMaestro(String codigoBarrasMaestro);

}
