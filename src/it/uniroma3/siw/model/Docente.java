package it.uniroma3.siw.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

//ho cambiato la strategia di fetch della onetomany in eager per avere i dati dei corsi insegnati dal docente, per gli eventi a cascata ho messo solamente quello tra docente e corso perchè non esiste corso senza docente che lo insegni

@Entity
public class Docente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String nome;
	private String cognome;
	private Date nascita;
	private String luogonascia;
	private char piva;
	
	@OneToMany(mappedBy = "docente",  fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	private List<Corso> corsi;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Date getNascita() {
		return nascita;
	}

	public void setNascita(Date nascita) {
		this.nascita = nascita;
	}

	public String getLuogonascia() {
		return luogonascia;
	}

	public void setLuogonascia(String luogonascia) {
		this.luogonascia = luogonascia;
	}

	public char getPiva() {
		return piva;
	}

	public void setPiva(char piva) {
		this.piva = piva;
	}

	public List<Corso> getCorsi() {
		return corsi;
	}

	public void setCorsi(List<Corso> corsi) {
		this.corsi = corsi;
	}

}
