package spring.authentication.micro.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 
import spring.authentication.micro.jpa.model.User;
import spring.authentication.micro.jpa.repository.UserRepository;
import spring.authentication.micro.pojo.NewUser;

@RestController
@RequestMapping("/")
public class MainController {
	
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	PasswordEncoder passwordEncoder;

	@GetMapping(value = "hi")
	public String get() {
		return "Hello world";
	}
	
	@PostMapping(value = "create", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String createAccount(@Valid @RequestBody(required = true) NewUser newUser) {
		newUser.setPassword(passwordEncoder.encode(newUser.getPassword()));
		User user = new User(newUser);
		try {
			userRepository.saveAndFlush(user);
		} catch (Exception e ) {
			return "give different user name";
		}

		return "create-account";
		
	}

}
