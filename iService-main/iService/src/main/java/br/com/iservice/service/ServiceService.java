package br.com.iservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.iservice.model.Servico;
import br.com.iservice.repository.ServiceRepository;

@Service
public class ServiceService {

	@Autowired
	private ServiceRepository serviceRepository;
	
	public List<Servico> listarService() {
		return serviceRepository.findAll();
	}
	
	//public List<Serviço> listarServiceCidade(){
		//return serviceRepository.find
	//}
	public void cadastrarServico(Servico servico) {
		serviceRepository.save(servico);
		
	}
}