package br.com.caelum.ingresso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.caelum.ingresso.dao.FilmeDao;
import br.com.caelum.ingresso.dao.SalaDao;

@Controller
public class SessaoController {
	
	@Autowired
	private SalaDao salaDao;
	@Autowired
	private FilmeDao filmeDao;
	
	public ModelAndView form(@RequestParam("salaId") Integer salaId) {
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("sala", salaDao.findOne(salaId));
		modelAndView.addObject("filme", filmeDao.findAll());
		
		return modelAndView;
		
	}
}
