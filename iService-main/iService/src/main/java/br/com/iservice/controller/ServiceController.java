package br.com.iservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;



import br.com.iservice.model.Servico;
import br.com.iservice.service.ServiceService;

@Controller
public class ServiceController {

	@Autowired
	private ServiceService serviceService;
	
	@GetMapping("/service/listar")
	public ModelAndView listarService() {
		List<Servico> service = serviceService.listarService();
		//Faz Conecção com o View/front
		ModelAndView MaV = new ModelAndView("template");
		
		MaV.addObject("key", service);
		return MaV;
	}
	
	//public ModelAndView buscarServiceCidade() {
		//List<Serviço> service = serviceService.listarService();
	//}
	
	@GetMapping("/cadastrar")
	public String cadastrarServiço(Servico serviço) {
		
		
		return "cadastro";
	}
	@GetMapping("/salvar")
	public String salvarTime(Servico servico) {
		
		serviceService.cadastrarServico(servico);
		return "salvar";
	}
	
}
