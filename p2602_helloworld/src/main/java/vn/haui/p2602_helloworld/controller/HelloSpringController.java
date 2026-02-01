package vn.haui.p2602_helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloSpringController {
	@GetMapping("/chatbot")
	String sayHello() {
		return "Hello world again!";
	}

}
