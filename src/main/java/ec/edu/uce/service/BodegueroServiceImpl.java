package ec.edu.uce.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Bodega;
import ec.edu.uce.modelo.Producto;
import ec.edu.uce.modelo.Registro;

@Service
public class BodegueroServiceImpl implements IBodegueroService{
	
	private static Logger LOG = Logger.getLogger(BodegueroServiceImpl.class);
	
	@Autowired
	private IProductoService productoService;
	
	@Autowired
	private IBodegaService bodegaService;
		
	@Autowired
	private IRegistroService registroService;

	@Override
	public void ingresarInventario(String numero, String codigoBarrasMaestro, Integer cantidad) {
		// TODO Auto-generated method stub
		Producto producto = this.productoService.buscarcodigoBarrasMaestro(codigoBarrasMaestro);
		Bodega bodega = this.bodegaService.buscarBodegaPorNumero(numero);

		for (int i = 1; i <= cantidad; i++) {

			Registro regi = new Registro();
			regi.setBodegaR(bodega);
			regi.setCodigoBarrasIndividual(codigoBarrasMaestro + "" + i);
			regi.setProductoR(producto);
			this.registroService.insertar(regi);
		}

		producto.setStock(cantidad);
		this.productoService.actualizar(producto);
		
		
	}

	@Override
	public void eliminarProductoSinRegistrado(Integer id) {
		// TODO Auto-generated method stub
		Producto pro = this.productoService.buscarPorId(id);
		if(pro.getStock()==0 || pro.getStock()==null) {
			this.productoService.borrarPorId(pro.getId());
			
		}

				
	}
	



}
