package ec.edu.uce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping("")
public class ModeloController {
	
	
//	@GetMapping("buscarVuelos")
//	public String obtenerPaginaDatos(VueloTO vueloTO, Model modelo) {
//		
////		modelo.addAttribute("buscar", false);
//		return "buscaVuelos";
//	}
//	
//	@GetMapping("mostrar/vuelosDisponibles")
//	public String mostrarVuelos(VueloTO vueloTO,BindingResult result, Model modelo, RedirectAttributes redirectAttributes) {
//		
//		modelo.addAttribute("vuelos", this.gestorClienteService.buscarVuelosDisponibles(vueloTO.getOrigen(), vueloTO.getDestino(), vueloTO.getFechaVuelo(), vueloTO.getCategoria(), vueloTO.getEstado()));
//		modelo.addAttribute("buscar", true);
//		return "mostrarVuelos";
//
//	}

}
