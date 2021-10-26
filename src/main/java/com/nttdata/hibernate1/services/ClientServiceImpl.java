package com.nttdata.hibernate1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.hibernate1.daoInterfaces.ClientDao;
import com.nttdata.hibernate1.persistence.Client;

@Service
public class ClientServiceImpl implements ClientServiceInterface {

	@Autowired
	private ClientDao clientManager;

	@Override
	public void insertNewClient(Client client) {
		clientManager.insert(client);
	}

	@Override
	public void getAllClient() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getClientById(Integer Id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateClient(Client client) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteClient(Client client) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getClientByFullName(String name, String surname, String secondSurname) {
		// TODO Auto-generated method stub

	}

}
