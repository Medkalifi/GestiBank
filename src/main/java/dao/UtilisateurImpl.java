package dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import com.mysql.cj.Query;



import entities.Administrateur;
import entities.Agent;
import entities.Client;
import entities.Demande;
import entities.Utilisateur;

public class UtilisateurImpl implements IUtilisateurDAO{

	
	private EntityManager em;
	
	/// Management des utilisateurs
	
	@Override
	public Utilisateur ajouterUtilisateur(long codeuser) {
		em.persist(codeuser);
		return ajouterUtilisateur(0);
	}
			
	
	@Override
	public Utilisateur getUtilisateur(long codeuser) {
		em.persist(codeuser);
		return getUtilisateur(codeuser);
	}
		
	
	@Override			
	public List<Utilisateur> findAllUtilisateur() {
		Query req = (Query) em.createQuery("select * from Utilisateur u");
		return findAllUtilisateur();
	}
		
	
	// Création d'un compte par le client
	
	@Override
	public Client ajouterNewClient(Long code_client) {
		em.persist(code_client);
		return ajouterNewClient(code_client);
	}
	
	
	// Management des clients par l'agent
	
	@Override
	public Client ajouterClient(Client client) {
		em.persist(Client.class);
		return ajouterClient(client);
	}
	
	@Override
	public Client miseAjourClient(Client client)  {
		
		Client c = em.find(Client.class, client.getId());
		if (c != null){
			
			c.setAdresse(client.getAdresse()); c.setNom(client.getNom());
			c.setPrenom(client.getPrenom());  c.setTelephone(client.getTelephone());
			c.setEmail(client.getEmail());  c.setEnfant(client.getEnfant());
			c.setSm(client.getSm());
			em.merge(client); }
		return c;
		}
	
	
	@Override
	public Client consulterClient(Long code_lient)  {
		Query req=(Query) em.createQuery("select c from Client");
		return consulterClient(code_lient);
	}
	
	
	public Boolean supprimerClient(Long code_lient)  {
		if (code_lient != null)
            em.remove(code_lient);
		return null;
	}

	@Override
	public Agent ajouterAgent(Agent code_agent) {
		em.persist(code_agent);
		return code_agent;
	}

	@Override
	public Agent miseAjourAgent(Agent code_agent) {
		Agent agent = em.find(Agent.class, code_agent.getIdAg());
		agent.setNom(code_agent.getNom());
		agent.setEmail(code_agent.getEmail());
		agent.setEmail(code_agent.getMatricule());
		agent.setEmail(code_agent.getPrenom());
		agent.setEmail(code_agent.getMdp());
		agent.setAdresse(code_agent.getAdresse());
		em.merge(agent);
		return agent;
	}

	@Override
	public Agent consulterAgent(Agent code_agent) {
		Agent agent =em.find(Agent.class, code_agent);
		if(agent==null) throw new RuntimeException("AGENT INTROUVABLE");
		return agent;
		
	}

	@Override
	public Boolean supprimerAgent(Agent code_agent) {
		Boolean bol = false;
		 if (code_agent != null) {
	            em.remove(em.merge(code_agent));
	            bol=true;
	        }
		return bol;
	}

	@Override
	public void affectAgentToClient(Long code_agent, Long code_lient) {
		Agent agent =em.find(Agent.class, code_agent);
		System.out.println(agent);
		Client c = em.find(Client.class, code_lient);
		agent.getListClient().add(c);
		c.setAgent(agent);	
	}
	
}
