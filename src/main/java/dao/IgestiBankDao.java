package dao;

import java.util.List;

import javax.management.Notification;

import com.mysql.cj.protocol.Message;

import entities.Administrateur;
import entities.Agent;
import entities.Client;
import entities.Compte;
import entities.Demande;
import entities.Document;
import entities.Transaction;
import entities.Utilisateur;

public interface BanqueDaoInterface {

		// Management des utilisateurs
		public abstract Utilisateur updateUtilisateur(long codeuser);
		public Utilisateur ajouterUtilisateur(long codeuser);
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
		
		//
		
		// Gestion des documents
		public List<Document> findAllDoc();
		public Document findDocById(int id);
		public void saveDoc(Document document);
		public List<Document> findAllDocByUserId(long userId);
	    public void deleteDocById(int id);
	      
	    //Notification
	  	public Notification ajouterNotification(Notification notif);
	  	public List<Notification> getNotificationsByDestinateur(long idUser);
	  	
	  	//Messages refus nouveau compte
	  	
	  	public Message ajouterMessage(Message message);
	  	
	  	
	  	
		

	  	//Compte et transaction
	  	
		
		public void miseAjourCompte(Compte cpte);
		public void saveCompte(Compte cpte);
		public Compte ajouterCompte(Compte c,Long numCli);
		public Transaction ajouterOperation(Transaction op,String numCpte);
		public Compte consulterCompte(String numCpte);
		public List<Transaction> consulterOperations(String codeCompte,int position,int nboperation);
		public List<Compte> getComptesByClient(long codeCli);
		public List<Compte> getComptesByConseiller(long codeConseil);
		public int getNombreOperation(String numCpte);
		
		
		
		
		

			

		}