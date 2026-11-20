package com.api.mecanica;

import org.springframework.boot.SpringApplication;

public class TestMecanicaApplication {

	public static void main(String[] args) {
		SpringApplication.from(MecanicaApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
