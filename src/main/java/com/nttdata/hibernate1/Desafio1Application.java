package com.nttdata.hibernate1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.hibernate1.persistence.Client;
import com.nttdata.hibernate1.services.ClientServiceInterface;

@SpringBootApplication
public class Desafio1Application {

	private ClientServiceInterface clientManager;

	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	public void run(String... args) throws Exception {
		Client client1 = new Client();
		client1.setDNI("11122233A");
		client1.setName("Alberto");
		client1.setSurname("Otero");
		client1.setSecondSurname("Gonzalez");

		clientManager.insertNewClient(client1);
	}

}
