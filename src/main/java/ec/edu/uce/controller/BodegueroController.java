package ec.edu.uce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ec.edu.uce.modelo.Bodega;

import ec.edu.uce.modelo.Producto;
import ec.edu.uce.service.IBodegaService;
import ec.edu.uce.service.IBodegueroService;
import ec.edu.uce.service.IProductoService;


@Controller
@RequestMapping("/bodeguero/")
public class BodegueroController {
	
	@Autowired
	private IBodegueroService bodegueroService;
	@Autowired
	private IProductoService productoService;
	@Autowired
	private IBodegaService bodegaService;
	
	@GetMapping("todos")
	public String buscarTodos(Model modelo) {
		
		List<Producto> listaProductos = this.productoService.buscarProductoTodos();
		modelo.addAttribute("productos", listaProductos);
		return "productoInsertado";
	}
///////////////////////1////////////////////////////
	@GetMapping("registrarBodega")
	public String obtenerPaginaDatosBodega(Bodega bodega, Model modelo) {
		
		return "registrarBodega";
	}

	@PostMapping("bodegaRegistrada")
	public String bodegaInsertada(Bodega bodega,BindingResult result, Model modelo, RedirectAttributes redirectAttributes) {
		
		this.bodegaService.insertar(bodega);
//		redirectAttributes.addFlashAttribute("mensaje", "Producto Registrado");
		return "redirect:registrarBodega";
		

	}
	
	///////////////////////2////////////////////////////
	@GetMapping("insertarProducto")
	public String obtenerPaginaDatos(Producto producto, Model modelo) {
		
		return "insertarProducto";
	}

	@PostMapping("productoInsertado")
	public String productosInsertados(Producto producto,BindingResult result, Model modelo, RedirectAttributes redirectAttributes) {
		
		this.productoService.insertar(producto);
//		redirectAttributes.addFlashAttribute("mensaje", "Producto Registrado");
		return "redirect:todos";

	}
///////////////////////3////////////////////////////
	
	@DeleteMapping("borrar/{idProducto}")
	public String eliminarProductoSinRegistro(@PathVariable("idProducto")Integer idProducto, Model modelo) {
		this.bodegueroService.eliminarProductoSinRegistrado(idProducto);
						
		List<Producto> listaProductos= this.productoService.buscarProductoTodos();
		modelo.addAttribute("productos", listaProductos);
		return "productoInsertado";
		
		
	}
	

}
