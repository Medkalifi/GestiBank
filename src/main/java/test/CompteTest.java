package test;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Administrateur;
import entities.Agent;
import entities.Client;
import entities.Compte;
import entities.Utilisateur;

public class CompteTest {

	public static void main(String[] args) {
		 
		Date dt =new Date();
		
		
				Compte cp= new Compte("rib2014", dt, 2000.01, 100);
				Administrateur admin = new Administrateur();
				Client client =new Client("kalifi", "moha", "1234", "kalifi@hotmail.fr", "21 rue curie", "06105487", "M", 2, 0.00);
				Agent agent = new Agent("conseiller1", "paul", "poau", "lloaj@gdd.fr", "5 rue de la rue");
				
				
				
				EntityManagerFactory emf =Persistence.createEntityManagerFactory("banqueProject" );
				EntityManager em = emf.createEntityManager();
				em.getTransaction().begin();
				em.persist(client);
				em.getTransaction().commit();
				em.close();
	}

}
