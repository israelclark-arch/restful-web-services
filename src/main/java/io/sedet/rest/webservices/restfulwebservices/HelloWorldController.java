package io.sedet.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

//	@RequestMapping(method = RequestMethod.GET, path = "/hello")
	@GetMapping(path = "/hello")
	public String helloWorld() {
		
		return "hello world";
	}
}
