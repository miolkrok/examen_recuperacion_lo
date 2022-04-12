package ec.edu.uce.repository;

import java.util.List;

import ec.edu.uce.modelo.Producto;

public interface IProductoRepo {
	
	void insertar(Producto producto);
	void actualizar(Producto producto);
	Producto buscarPorId(Integer id);
	void borrarPorId(Integer id);
	List<Producto> buscarProductoTodos();

}
