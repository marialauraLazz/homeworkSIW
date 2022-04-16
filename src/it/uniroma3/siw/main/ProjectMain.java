package it.uniroma3.siw.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class ProjectMain {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("products-unit");
		EntityManager em = emf.createEntityManager();
	}
	/*ho lasciato le strategie di fetch standard delle associazioni, per gli eventi a cascata ho messo solamente quello tra docente e corso perche non esiste corso senza docente che lo insegni*/
}
