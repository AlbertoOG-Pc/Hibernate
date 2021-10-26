package com.nttdata.hibernate1.services;

import com.nttdata.hibernate1.persistence.Client;

public interface ClientServiceInterface {
	public void insertNewClient(final Client client);
	public void getAllClient();
	public void getClientById(final Integer Id);
	public void updateClient(final Client client);
	public void deleteClient(final Client client);
	public void getClientByFullName(final String name, final String surname, final String secondSurname);
}
