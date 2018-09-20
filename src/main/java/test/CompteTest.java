package test;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Administrateur;
import entities.Agent;
import entities.Client;
import entities.Compte;
import entities.CompteCourantAD;
import entities.Utilisateur;

public class CompteTest {

	public static void main(String[] args) {
		 
		Date dt =new Date();
		
		
				Compte cp= new Compte("rib2014", dt, 2000.01, 100);
				CompteCourantAD cad= new CompteCourantAD("ribCAD0214",dt, 100, 1000.23,100);
				
				
				EntityManagerFactory emf =Persistence.createEntityManagerFactory("banqueProject" );
				EntityManager em = emf.createEntityManager();
				em.getTransaction().begin();
				em.persist(cp);
				em.getTransaction().commit();
				em.close();
	}
	
	
	


}
