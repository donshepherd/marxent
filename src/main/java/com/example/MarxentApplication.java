package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class MarxentApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarxentApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(SolutionRepository repository) {
		return args -> {

			Arrays.asList("VisualCommerce™, 3D Modeling Services".split(",")).forEach(n -> repository.save(new Solution(n)));

			//Show solutions on console on startup for demo purposes only
			repository.findAll().forEach(System.out::println);
		};
	}
}
