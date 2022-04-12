package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Producto;

@Service
public class BodegueroServiceImpl implements IBodegueroService{
	
	@Autowired
	private IProductoService productoService;

	@Override
	public void ingresarProducto(Producto producto) {
		// TODO Auto-generated method stub
		producto.setStock(0);
		this.productoService.insertar(producto);
	}

}
