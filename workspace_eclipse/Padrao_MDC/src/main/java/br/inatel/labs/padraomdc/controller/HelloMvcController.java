package br.inatel.labs.padraomdc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloMvcController {
	@GetMapping("/hello")
	public String getHello(Model model) {
		String nomeUsuario = "Iza Lopes";
		model.addAttribute("usuario", nomeUsuario);
				
		return "hello-mvc"; // Nao precisa por a extensao .html
		// sera buscado em templates  o arquivo hello-mvc.html
	}
}
