package ec.edu.uce.service;

import ec.edu.uce.modelo.Producto;

public interface IModeloService {

	void insertar(Producto modelo);
	void actualizar(Producto modelo);
	Producto buscarPorId(Integer id);
	void borrarPorId(Integer id);
}
