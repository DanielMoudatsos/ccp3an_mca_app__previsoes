package br.usjt.tempo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.tempo.model.Previsao;
import br.usjt.tempo.service.PrevisaoService;

@Controller
public class PrevisaoController {

	@Autowired
	private PrevisaoService service;

	@GetMapping("/previsaoTempo")
	public ModelAndView listarPeriodos() throws IOException {
		
		ModelAndView modelAndView = new ModelAndView("lista_previsaoTempo");
		List<Previsao> previsoes = service.findAll();
		modelAndView.addObject("previsaoTempo", previsoes);
		return modelAndView;
	}
}
