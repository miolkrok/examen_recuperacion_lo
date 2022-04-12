package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Producto;
import ec.edu.uce.repository.IProductoRepo;

@Service
public class ProductoServiceImpl implements IModeloService{
	
	@Autowired
	private IProductoRepo repo;

	@Override
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		this.repo.insertar(producto);
	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		this.repo.actualizar(producto);
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
