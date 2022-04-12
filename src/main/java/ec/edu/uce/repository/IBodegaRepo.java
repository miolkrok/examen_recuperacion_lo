package ec.edu.uce.repository;

import ec.edu.uce.modelo.Bodega;

public interface IBodegaRepo {
	
	void insertar(Bodega bodega);
	void actualizar(Bodega bodega);
	Bodega buscarPorId(Integer id);
	void borrarPorId(Integer id);

}
