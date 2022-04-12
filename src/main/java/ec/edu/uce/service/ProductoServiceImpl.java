package ec.edu.uce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Producto;
import ec.edu.uce.repository.IProductoRepo;

@Service
public class ProductoServiceImpl implements IProductoService{
	
	@Autowired
	private IProductoRepo productosRepo;

	@Override
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		
		producto.setStock(0);
		this.productosRepo.insertar(producto);
	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		this.productosRepo.actualizar(producto);
	}

	@Override
	public Producto buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.productosRepo.buscarPorId(id);
	}

	@Override
	public void borrarPorId(Integer id) {
		// TODO Auto-generated method stub
		this.productosRepo.borrarPorId(id);
	}

	@Override
	public List<Producto> buscarProductoTodos() {
		// TODO Auto-generated method stub
		return this.productosRepo.buscarProductoTodos();
	}	

}
