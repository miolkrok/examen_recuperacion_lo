package ec.edu.uce.service;

import ec.edu.uce.modelo.Registro;

public interface IRegistroService {

	void insertar(Registro registro);
	void actualizar(Registro registro);
	Registro buscarPorId(Integer id);
	void borrarPorId(Integer id);
}
