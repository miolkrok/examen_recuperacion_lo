package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Registro;
import ec.edu.uce.repository.IProductoRepo;
import ec.edu.uce.repository.IRegistroRepo;

@Service
public class RegistroServiceImpl implements IRegistroService{
	
	@Autowired
	private IRegistroRepo registroRepo;

	@Override
	public void insertar(Registro registro) {
		// TODO Auto-generated method stub
		this.registroRepo.insertar(registro);
	}

	@Override
	public void actualizar(Registro registro) {
		// TODO Auto-generated method stub
		this.registroRepo.actualizar(registro);
	}

	@Override
	public Registro buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.registroRepo.buscarPorId(id);
	}

	@Override
	public void borrarPorId(Integer id) {
		// TODO Auto-generated method stub
		this.registroRepo.borrarPorId(id);
	}	

}
