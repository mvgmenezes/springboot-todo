package com.mmenezes.rest.webservices.restfulwebservices.helloworld;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mmenezes.bean.MessageBean;

//Controller
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HelloWorldController {

	//@RequestMapping(method=RequestMethod.GET, path="/hello-world")
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello world";
	}
	
	@GetMapping(path = "/hello-world-bean")
	public MessageBean helloWorldBean() {
		return new MessageBean("Hello world Changed s");
		//throw new RuntimeException("Algum erro ocorreu");
	}
	
	@GetMapping(path = "/hello-world-bean/path-variable/{name}")
	public MessageBean helloWorldBean(@PathVariable String name) {
		return new MessageBean(String.format("Hello world Changed %s", name));
	}
}
