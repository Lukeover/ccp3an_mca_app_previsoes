package br.usjt.ccp3an_mca_app_previsoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.ccp3an_mca_app_previsoes.model.Dia;
import br.usjt.ccp3an_mca_app_previsoes.repository.DiaRepository;


@Controller
public class DiaController{
	@Autowired
	private DiaRepository diaRepo;
	
	@GetMapping ("/dias")
	public ModelAndView listarRegistros() {
		ModelAndView mv = new ModelAndView ("lista_dias");
		List <Dia> dias = diaRepo.findAll();
		mv.addObject("dias",dias);
		mv.addObject(new Dia());
		return mv;
	}
}
