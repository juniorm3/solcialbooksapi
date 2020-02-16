package com.algaworks.socialbooks.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivroResource {
	
	@RequestMapping(value = "/livros", method = RequestMethod.GET)
	public String listar() {
		return "Rest aplicado, Git passo-a-passo";
	}

}
