package io.sedet.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

//	@RequestMapping(method = RequestMethod.GET, path = "/hello")
	@GetMapping(path = "/hello")
	public String helloWorld() {
		
		return "hello world";
	}
	
	
	
//	hello world bean
	@GetMapping(path = "/helloworldbean")
	public HelloWorldBean helloWorldBean() {
		
		return new HelloWorldBean("hello world");
	}
	
//	path variable
	
	@GetMapping(path = "/helloworldbean/pathvariable/{name}")
	public HelloWorldBean helloWorlPathVariable(@PathVariable String name) {
		
		return new HelloWorldBean(String.format("hello world, %s ", name) );
	}

}
