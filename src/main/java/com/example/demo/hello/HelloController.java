package com.example.demo.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/movies/{id}")
	public String index(@PathVariable String id) {
		return "Leo" + id;
	}
	
	@GetMapping("/new/movies")
	public HelloBean index() {
		return new HelloBean("boruto");
	}
}
