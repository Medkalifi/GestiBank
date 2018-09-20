package dao;

import java.util.List;


import entities.Administrateur;
import entities.Agent;
import entities.Client;
import entities.Compte;
import entities.Utilisateur;

public interface IgestiBankDao {
	
	
		// Management des utilisateurs
		public abstract Utilisateur updateUtilisateur(Utilisateur codeuser);
		public abstract Utilisateur ajouterUtilisateur(Utilisateur codeuser);
		public abstract Utilisateur getUtilisateur(long codeuser);
		public List<Utilisateur> findAllUtilisateur();
		
		// Création d'un compte par le client
		public Client ajouterNewClient(Client code_client);
		
		// Management des clients par l'agent
		public Client ajouterClient(Client client);
		public Client miseAjourClient(Client client);
		public Client consulterClient(Long codeClient);
		public Boolean supprimerClient(Client codeClient);

		
		
		

}
