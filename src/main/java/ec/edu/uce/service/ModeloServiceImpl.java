package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Producto;
import ec.edu.uce.repository.IProductoRepo;

@Service
public class ModeloServiceImpl implements IModeloService{
	
	@Autowired
	private IProductoRepo repo;

	@Override
	public void insertar(Producto modelo) {
		// TODO Auto-generated method stub
		this.repo.insertar(modelo);
	}

	@Override
	public void actualizar(Producto modelo) {
		// TODO Auto-generated method stub
		this.repo.actualizar(modelo);
	}

	@Override
	public Producto buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.repo.buscarPorId(id);
	}

	@Override
	public void borrarPorId(Integer id) {
		// TODO Auto-generated method stub
		this.repo.borrarPorId(id);
	}	

}
