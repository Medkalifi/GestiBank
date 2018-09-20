package metier;


import java.util.List;

import javax.management.Notification;

import entities.Administrateur;
import entities.Agent;
import entities.Client;
import entities.Compte;
import entities.Demande;
import entities.DemandeMdp;
import entities.Document;
import entities.Transaction;
import entities.Utilisateur;

public interface Imetier {

		  	
         //METHODES METIER

	/*comptes*/
	  
	public Compte ajouterCompte(Compte cp,Long codeCli, Long codeAg);
	public Compte consulterCompte(String codeCpte);
	public Compte supprimerCompte(String codeCpte, Long codeAg);
	public Compte verifierDecouvert(String codeCpte);
	
	/*transaction*/
	public Transaction ajouterTransation(Transaction tr,String numCpte);       //cod�e
	public List<Transaction> consulterTransaction(String codeCpte);			 //cod�e
	public void verser(double mt, String cpte);  // cod�e depend de, compte :stephane
	public void retirer(double mt,String cpte);   // cod�e depend de, compte :stephane
	public void virement(double mt,String cpte1,String cpte2,Long codeAg);  // cod�e depend de, compte :stephane
	public void historique(String codeCpte) ;
	public Notification  envoyerNotification(Notification notif);
	public List<Notification> getNotificationsByDestinateur(long idUser);
	
	
}
	

	


	

