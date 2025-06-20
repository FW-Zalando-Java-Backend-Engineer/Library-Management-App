package com.example.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * SpringApplication: is a helper class to launch our Spring Boot app
 * @SpringBootApplication: is a meta-annotation that combines:
 * 	* @Configuration: marks the class as a source of Spring beans
 * 	* @EnableAutoConfiguration: enables automatic configuration based on classpath
 * 	* @ComponentScan: scans the package for Spring components like @RestController, @Service, etc.
 * */

@SpringBootApplication
public class LibraryApplication {

	public static void main(String[] args) {

		SpringApplication.run(LibraryApplication.class, args);
	}

}
