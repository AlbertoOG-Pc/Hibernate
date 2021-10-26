package com.nttdata.hibernate1.persistence;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_Contract")
public class Contract implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "C_contractId")
	private Long clientId;

	@Column(name = "C_date")
	private Date date;

	@Column(name = "C_precio")
	private Float price;

	@Column(name = "C_fk_client", nullable = false)
	private Long fk_client;

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Long getFk_client() {
		return fk_client;
	}

	public void setFk_client(Long fk_client) {
		this.fk_client = fk_client;
	}

}
