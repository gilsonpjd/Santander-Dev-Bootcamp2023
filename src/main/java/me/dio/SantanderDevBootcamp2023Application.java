package me.dio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("me.dio.domain.model")
@ComponentScan("me.dio.domain.repository")
public class SantanderDevBootcamp2023Application {

	public static void main(String[] args) {
		SpringApplication.run(SantanderDevBootcamp2023Application.class, args);
	}

}
