package it.uniroma3.siw.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Societa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private char indirizzoSede;
	private String ragione;
	private int numero;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public char getIndirizzoSede() {
		return indirizzoSede;
	}
	public void setIndirizzoSede(char indirizzoSede) {
		this.indirizzoSede = indirizzoSede;
	}
	public String getRagione() {
		return ragione;
	}
	public void setRagione(String ragione) {
		this.ragione = ragione;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	

}
