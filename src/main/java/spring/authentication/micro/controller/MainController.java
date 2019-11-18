package spring.authentication.micro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {
	

	@GetMapping(value = "hi")
	public String get() {
		return "Hello world";
	}

}
