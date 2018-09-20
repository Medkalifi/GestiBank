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
	//METHODES DAO
	
	
	// Management des utilisateurs
	
			public Utilisateur ajouterUtilisateur(long codeuser);
			public  Utilisateur updateUtilisateur(long codeuser);
			public Utilisateur getUtilisateur(long codeuser);
			public List<Utilisateur> findAllUtilisateur();
			
			// Création d'un compte par le client
			public Client ajouterNewClient(Long code_client);
			
			// Management des clients par l'agent
			public Client ajouterClient(Client client);
			public Client miseAjourClient(Client client);
			public Client consulterClient(Long code_lient);
			public Boolean supprimerClient(Long code_lient);

			// Management des agents par l'administrateur
			public Agent ajouterAgent(Agent code_agent);
			public Agent miseAjourAgent(Agent code_agent);
			public Agent consulterAgent(Agent code_agent);
			public Boolean supprimerAgent(Agent code_agent);
			public void affectAgentToClient(Long code_agent,Long code_lient);
			
			
			// Liste pour l'administateur
			public List<Agent> getAgentByGroupe(Administrateur groupe_agent);
			public List<Agent> getAgent(Administrateur agent);
			public List<Demande> getDemandes(Administrateur Demande);
			
			
			// Liste pour l'agent
			public List<Client> consulterClients(Client client);
			public List<Client> findAllClients();
			
			
			// Gestion des demandes en attente
			public Demande ajouterDemande(Demande ajouter_demande);
			public List<Demande> getDemande(Demande demande);
			public List<Demande> getDemandesAffect(Demande affect_demande);
			public List<Demande> getDemandeStatut(Demande statut_demande);
			public List<Demande> getDemandeDate(Demande Date_demande);
			public List<Demande> getDemandeAffectDate(Demande Date_Affect_demande);
			public List<Demande> getDemandeByUser(Long codeuser);
			
			/*demande*/
			public void demanderChequier(String cpte);
			public void CreationCompte(String cpte);
			public void validerDemande(Long codecpte);
			public DemandeMdp ChangementMdp(String Mdp, String cpte);
			public  List<Document> AjouterDocument(String cpte);
			public List<Demande> getDemandesAffectes(Long idAg);
			
			
			
			//////
			
			// Gestion des documents
			public List<Document> findAllDoc();
			public Document findDocById(int id);
			public void saveDoc(Document document);
			public List<Document> findAllDocByUserId(long userId);
		    public void deleteDocById(int id);
		      
		    //Notification
		  	public Notification ajouterNotification(Notification notif);
		  	public List<Notification> getNotificationsByDestinateur(long idUser);
		  	
         //METHODES METIER

	/*comptes*/
	public Compte ajouterCompte(Compte cp,Long codeCli, Long codeAg);
	public Compte consulterCompte(String codeCpte);
	public Compte supprimerCompte(String codeCpte, Long codeAg);
	public Compte verifierDecouvert(String codeCpte);
	
	/*transaction*/
	public void verser(double mt,String cpte,Long codeAg);
	public void retirer(double mt,String cpte,Long codeAg);
	public void virement(double mt,String cpte1,String cpte2,Long codeAg);
	public void historique(String codeCpte) ;
	public void envoyerNotification(String cpte, Transaction transaction);
	public List<Transaction> consulterTransaction(String codeCpte, int nbOp);
	
	
	
	
	
	
<<<<<<< HEAD
=======
	/* concerne adm*/
	public List<Agent> getAgent();
	public List<Compte> getComptesParClient(Long codeCli);
	public List<Compte> getComptesParAgent(Long codeAg);
	
	
>>>>>>> branch 'master' of https://github.com/Medkalifi/gestibank.git
}

	


	

