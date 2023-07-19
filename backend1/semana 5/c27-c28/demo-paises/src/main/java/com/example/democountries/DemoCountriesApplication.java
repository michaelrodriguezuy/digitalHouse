package com.example.democountries;

import com.example.democountries.model.Continentes;
import com.example.democountries.model.País;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoCountriesApplication {

	public static void main(String[] args) {

		País p = new País("co", "Bogotá");
		p.setContinente(Continentes.AFRICA);

		if(Continentes.AFRICA.getCodigo() == 1)



		SpringApplication.run(DemoCountriesApplication.class, args);
	}

}
