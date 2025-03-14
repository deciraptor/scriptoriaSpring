package fr.scriptoria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = { "fr.scriptoria.api.repositories.mySqlRepositories",
		"fr.scriptoria.login.repository" })
@EnableMongoRepositories(basePackages = "fr.scriptoria.api.repositories.mongoDbRepositories")
public class ProjetScriptoriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetScriptoriaApplication.class, args);
	}

}

