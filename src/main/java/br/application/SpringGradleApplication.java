package br.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@Profile({"local", "test", "prod"})
public class SpringGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGradleApplication.class, args);
	}

}
