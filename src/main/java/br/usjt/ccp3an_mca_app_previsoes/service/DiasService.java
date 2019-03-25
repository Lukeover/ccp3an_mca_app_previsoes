package br.usjt.ccp3an_mca_app_previsoes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.ccp3an_mca_app_previsoes.model.Dia;
import br.usjt.ccp3an_mca_app_previsoes.repository.DiaRepository;

@Service
public class DiasService {
	@Autowired
	private DiaRepository diaRepo;
	public void salvar (Dia dia) {
		diaRepo.save(dia);
	}
	public List <Dia> listarTodos (){
	return diaRepo.findAll();
	}
}
