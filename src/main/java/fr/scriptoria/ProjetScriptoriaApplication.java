package fr.scriptoria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ProjetScriptoriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetScriptoriaApplication.class, args);
	}

}
