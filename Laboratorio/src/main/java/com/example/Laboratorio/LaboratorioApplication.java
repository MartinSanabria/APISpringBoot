package com.example.Laboratorio;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LaboratorioApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LaboratorioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Swagger UI: http://localhost:8080/swagger-ui/index.html");
	}
}
