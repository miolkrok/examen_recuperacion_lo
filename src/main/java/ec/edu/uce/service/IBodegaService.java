package ec.edu.uce.service;

import ec.edu.uce.modelo.Bodega;

public interface IBodegaService {

	void insertar(Bodega bodega);
	void actualizar(Bodega bodega);
	Bodega buscarPorId(Integer id);
	void borrarPorId(Integer id);
}
