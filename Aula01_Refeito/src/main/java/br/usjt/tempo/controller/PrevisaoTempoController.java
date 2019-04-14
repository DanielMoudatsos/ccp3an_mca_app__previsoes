package br.usjt.tempo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.tempo.model.PrevisaoTempo;
import br.usjt.tempo.repository.PrevisaoTempoRepository;

@Controller
public class PrevisaoTempoController {

	@Autowired
	private PrevisaoTempoRepository repository;

	@GetMapping("/previsaoTempo")
	private ModelAndView listarPeriodos() throws IOException {
		ModelAndView modelAndView = new ModelAndView("lista_previsaoTempo");
		List<PrevisaoTempo> periodos = repository.findAll();
		modelAndView.addObject("previsaoTempo", periodos);
		return modelAndView;
	}
}