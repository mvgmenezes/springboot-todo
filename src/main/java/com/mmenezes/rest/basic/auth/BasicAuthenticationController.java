package com.mmenezes.rest.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//classe responsavel em expor o servico de autenticantion basico. 

// A atutenticacao Basic Authentication, não é a mais indicada por ter um usuario e senha fixo para acesso aos metodos


//Controller
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class BasicAuthenticationController {
	
	@GetMapping(path = "/basicauth")
	public AuthenticationBean helloWorldBean() {
		return new AuthenticationBean("You're authenticated");

	}
	

}
