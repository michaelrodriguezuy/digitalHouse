package com.digitalhouse.payments;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@SpringBootApplication
public class PaymentsApplication {

	@PostConstruct
	public void init() {

		TimeZone.setDefault(TimeZone.getTimeZone("America/Montevideo"));

	}

	public static void main(String[] args) {
		SpringApplication.run(PaymentsApplication.class, args);
	}

}
