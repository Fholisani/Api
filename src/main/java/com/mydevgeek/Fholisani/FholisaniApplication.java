package com.mydevgeek.Fholisani;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.mydevgeek")
@EnableJpaRepositories(basePackages = "com.mydevgeek.repo")
@EntityScan(basePackages = "com.mydevgeek.domain")
public class FholisaniApplication {

	public static void main(String[] args) {
		SpringApplication.run(FholisaniApplication.class, args);
	}
}
