package vn.haui.p2602_crud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldCongtroller {
	@GetMapping("/hello")
	String sayHello() {
		return "Hello";
	}

}
