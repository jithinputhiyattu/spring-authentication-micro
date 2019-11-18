package spring.authentication.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringAuthenticationMicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAuthenticationMicroApplication.class, args);
	}

}
