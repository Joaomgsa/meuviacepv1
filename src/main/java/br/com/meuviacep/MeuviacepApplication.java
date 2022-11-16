package br.com.meuviacep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class MeuviacepApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeuviacepApplication.class, args);
	}

}
