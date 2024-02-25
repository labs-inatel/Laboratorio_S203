package br.inatel.labs.padraosoa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class Controller {
	@GetMapping
	public MyMessage processarGetHello() {
		MyMessage msg = new MyMessage("Olá, padrão arquitetal SOA");
		return msg;
	}
}
