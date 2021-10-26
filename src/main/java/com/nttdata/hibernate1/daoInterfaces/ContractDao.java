package com.nttdata.hibernate1.daoInterfaces;

import java.util.List;

import com.nttdata.hibernate1.persistence.Contract;

public interface ContractDao {
	public void insert(Contract contract);

	public List<Contract> getAll();

	public Contract getById(Integer Id);

	public void update(Contract contract);

	public void delete(Contract contract);
}
