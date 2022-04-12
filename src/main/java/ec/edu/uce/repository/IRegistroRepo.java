package ec.edu.uce.repository;

import ec.edu.uce.modelo.Registro;

public interface IRegistroRepo {
	
	void insertar(Registro registro);
	void actualizar(Registro registro);
	Registro buscarPorId(Integer id);
	void borrarPorId(Integer id);

}
