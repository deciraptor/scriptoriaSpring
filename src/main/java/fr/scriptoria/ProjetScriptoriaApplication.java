package fr.scriptoria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = { "fr.scriptoria.repositories.mySqlRepositories",
		"fr.scriptoria.security.repository" })
@EnableMongoRepositories(basePackages = "fr.scriptoria.repositories.mongoDbRepositories")

public class ProjetScriptoriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetScriptoriaApplication.class, args);
	}

}
