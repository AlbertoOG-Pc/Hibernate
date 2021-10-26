package com.nttdata.hibernate1.daoInterfaces;

import java.util.List;

import com.nttdata.hibernate1.persistence.Client;

public interface ClientDao {
	public void insert(Client client);

	public List<Client> getAll();

	public Client getById(Integer Id);

	public void update(Client client);

	public void delete(Client client);

	public Client getByFullName(String name, String surname, String secondSurname);
}
