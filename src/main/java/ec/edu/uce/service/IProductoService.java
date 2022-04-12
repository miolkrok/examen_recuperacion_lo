package ec.edu.uce.service;

import ec.edu.uce.modelo.Producto;

public interface IProductoService {

	void insertar(Producto producto);
	void actualizar(Producto producto);
	Producto buscarPorId(Integer id);
	void borrarPorId(Integer id);
}
