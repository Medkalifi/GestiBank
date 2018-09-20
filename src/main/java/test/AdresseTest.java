package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Adresse;


public class AdresseTest {
	
	
	



		public static void main(String[] args) {
		
			Adresse user =new	Adresse("GlobalK", "9999", "lille", 21);
				
			
			EntityManagerFactory emf =Persistence.createEntityManagerFactory("banqueProject" );
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			em.persist(user);
			em.getTransaction().commit();
			em.close();

	}
	}



