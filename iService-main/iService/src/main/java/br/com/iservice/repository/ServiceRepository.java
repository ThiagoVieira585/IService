package br.com.iservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.iservice.model.Servico;

	@Repository
	public interface ServiceRepository extends JpaRepository<Servico, Long>{

	}