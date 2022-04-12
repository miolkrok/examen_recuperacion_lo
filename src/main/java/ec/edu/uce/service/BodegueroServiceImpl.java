package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Bodega;
import ec.edu.uce.modelo.Producto;
import ec.edu.uce.modelo.Registro;

@Service
public class BodegueroServiceImpl implements IBodegueroService{
	
	@Autowired
	private IProductoService productoService;
	
	@Autowired
	private IBodegaService bodegaService;
		
	@Autowired
	private IRegistroService registroService;

	@Override
	public void ingresarInventario(String numero, String codigoBarrasMaestro, Integer cantidad) {
		// TODO Auto-generated method stub
		Bodega bod = this.bodegaService.buscarBodegaPorNumero(numero);
		Producto pro = this.productoService.buscarProductoPorCodigoBarrasMaestro(codigoBarrasMaestro);
		Registro reg = new Registro();
		
		reg.setCodigoBarrasIndividual(codigoBarrasMaestro + String.valueOf((int) Math.toIntExact(1)));
		
		reg.setNombreHilo(Thread.currentThread().getName());
		
		
	}

	@Override
	public void eliminarProductoSinRegistrado(String codigoBarrasMaestro) {
		// TODO Auto-generated method stub
		Producto pro = this.productoService.buscarProductoPorCodigoBarrasMaestro(codigoBarrasMaestro);
		if(pro.getStock()==0 || pro.getStock()==null) {
			this.productoService.borrarPorId(pro.getId());
			
		}
				
	}
	



}
