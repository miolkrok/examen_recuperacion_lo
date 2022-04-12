package ec.edu.uce.repository;

import ec.edu.uce.modelo.Producto;

public interface IProductoRepo {
	
	void insertar(Producto modelo);
	void actualizar(Producto modelo);
	Producto buscarPorId(Integer id);
	void borrarPorId(Integer id);

}
