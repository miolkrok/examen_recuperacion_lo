package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Bodega;
import ec.edu.uce.repository.IBodegaRepo;

@Service
public class BodegaServiceImpl implements IBodegaService{
	
	@Autowired
	private IBodegaRepo bodRepo;

	@Override
	public void insertar(Bodega bodega) {
		// TODO Auto-generated method stub
		this.bodRepo.insertar(bodega);
	}

	@Override
	public void actualizar(Bodega bodega) {
		// TODO Auto-generated method stub
		this.bodRepo.actualizar(bodega);
	}

	@Override
	public Bodega buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.bodRepo.buscarPorId(id);
	}

	@Override
	public void borrarPorId(Integer id) {
		// TODO Auto-generated method stub
		this.bodRepo.borrarPorId(id);
	}

	@Override
	public Bodega buscarBodegaPorNumero(String numero) {
		// TODO Auto-generated method stub
		return this.bodRepo.buscarBodegaPorNumero(numero);
	}	

}
