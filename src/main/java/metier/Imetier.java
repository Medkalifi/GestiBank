package metier;


import java.util.Date;
import java.util.List;

import javax.management.Notification;

import entities.Administrateur;
import entities.Agent;
import entities.Client;
import entities.Compte;
import entities.Demande;
import entities.DemandeCheque;
import entities.DemandeMdp;
import entities.Document;
import entities.Notifications;
import entities.Transaction;
import entities.Utilisateur;

public interface Imetier {

		  	
         //METHODES METIER

	/*comptes*/
	  
	public Compte ajouterCompte(Compte cp,Long codeCli, Long codeAg);
	public Compte consulterCompte(String codeCpte);
	public Boolean supprimerCompte(String codeCpte, Long codeAg);
	public Compte verifierDecouvert(String codeCpte);
	
	/*transaction*/
	public Transaction ajouterTransation(Transaction tr,String numCpte);       //cod�e
	public List<Transaction> consulterTransaction(String codeCpte);			 //cod�e
	public void verser(double mt, String cpte);  // cod�e depend de, compte :stephane
	public void retirer(double mt,String cpte);   // cod�e depend de, compte :stephane
	public void virement(double mt,String cpte1,String cpte2,Long codeAg);  // cod�e depend de, compte :stephane
	public void historique(String codeCpte) ;
	
	
	// Demande
	
	
			// Gestion des demandes en attente
			public void affectAgentToClient(Long code_agent, Long code_lient);
			public Demande ajouterDemande(Demande ajouter_demande);
			public List<Demande> getDemande(long codeuser);
			public List<Demande> getDemandesAffect(String nom);
			public List<Demande> getDemandesAffectDate(Date date);
			public List<Demande> getDemandesAffectCompte(String numCompte);
			public List<Demande> getDemandeStatut(Demande statut_demande);
			public List<Demande> getDemandeDate(Date date);
			public void ChangementMdp(long codeuser,String Mdp);
			public DemandeCheque getChequier(String numCpte);
			public DemandeCheque getChequierParNom(String nom);
			
			
			
			// Gestion des documents
			
			public void saveDoc(Document document);
			public List<Document> findAllDocByUserId(long codeuser);
			public Boolean deleteDocById(String codeuser);
		    
		      
	//Notification
		  	public Notification ajouterNotification(Notification notif);
		  	public List<Notifications> getNotificationsByDestinateur(Long idNotification);
		  	public Notification  envoyerNotification(Notification notif);
			
	
}
	

	


	

