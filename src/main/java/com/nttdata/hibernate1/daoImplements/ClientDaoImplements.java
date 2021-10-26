package com.nttdata.hibernate1.daoImplements;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nttdata.hibernate1.daoInterfaces.ClientDao;
import com.nttdata.hibernate1.persistence.Client;

@Repository
public class ClientDaoImplements implements ClientDao {

	@Autowired
	private EntityManager ClientManager;

	@Override
	@Transactional
	public void insert(Client client) {
		Session currentSession = ClientManager.unwrap(Session.class);
		currentSession.save(client);
		currentSession.close();
	}

	@Override
	public List<Client> getAll() {
		Session currentSession = ClientManager.unwrap(Session.class);
		@SuppressWarnings("unchecked")
		List<Client> result = currentSession.createQuery("From T_Client").list();
		currentSession.close();
		return result;
	}

	@Override
	public Client getById(Integer Id) {
		Session currentSession = ClientManager.unwrap(Session.class);
		Client result = currentSession.get(Client.class, Id);
		currentSession.close();
		return result;
	}

	@Override
	public void update(Client client) {
		Session currentSession = ClientManager.unwrap(Session.class);
		currentSession.update(client);
		currentSession.close();

	}

	@Override
	public void delete(Client client) {
		Session currentSession = ClientManager.unwrap(Session.class);
		currentSession.delete(client);
		currentSession.close();

	}

	@Override
	public Client getByFullName(String name, String surname, String secondSurname) {
		Session currentSession = ClientManager.unwrap(Session.class);
		Client result = (Client) currentSession
				.createQuery(
						"From T_Client where c_name =:name AND c_surname =:surname AND c_secondSurname =:secondSurname")
				.setParameter("name", name).setParameter("surname", surname)
				.setParameter("secondSurname", secondSurname).uniqueResult();
		currentSession.close();
		return result;
	}

}
