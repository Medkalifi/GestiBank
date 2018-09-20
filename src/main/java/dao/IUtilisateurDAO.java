package dao;

import java.util.List;

import entities.Administrateur;
import entities.Agent;
import entities.Client;
import entities.Demande;
import entities.Utilisateur;

public interface IUtilisateurDAO {
	
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

}
