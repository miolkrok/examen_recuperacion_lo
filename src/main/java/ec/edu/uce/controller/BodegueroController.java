package ec.edu.uce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ec.edu.uce.modelo.Producto;
import ec.edu.uce.service.IBodegueroService;
import ec.edu.uce.service.IProductoService;


@Controller
@RequestMapping("/bodeguero/")
public class BodegueroController {
	
	@Autowired
	private IBodegueroService bodegueroService;
	@Autowired
	private IProductoService productoService;
	
	@GetMapping("todos")
	public String buscarTodos(Model modelo) {
		
		List<Producto> listaProductos = this.productoService.buscarProductoTodos();
		modelo.addAttribute("productos", listaProductos);
		return "productoInsertado";
	}

	
	///////////////////////2////////////////////////////
	@GetMapping("insertarProducto")
	public String obtenerPaginaDatos(Producto producto, Model modelo) {
		
		return "insertarProducto";
	}

	@PostMapping("productoInsertado")
	public String mostrarVuelos(Producto producto,BindingResult result, Model modelo, RedirectAttributes redirectAttributes) {
		
		this.productoService.insertar(producto);
//		modelo.addAttribute("buscar", true);
//		redirectAttributes.addFlashAttribute("mensaje", "Producto Registrado");
		return "redirect:todos";

	}

}
