package dao;

import java.util.List;

import entities.Administrateur;
import entities.Agent;
import entities.Client;
import entities.Compte;
import entities.Utilisateur;

public interface IgestiBankDao {
	
	
	/*public Utilisateur addUser(Utilisateur ut);
	public Administrateur addAdmin(Administrateur ad);
	public Agent addAgent(Agent ag, Long CodeAd);
	
	public void addClientToAgent (Long codeCL);
	public List<Operation>> consulterOperations(String codeCpte, int position, int nbOp);
	
	public long getNombreOperations(String codeCpte);
	public Client consulterClient(Long codeCli);
	public List<Client> consulterClients(String mc);
	public List<Compte> getComptesParClient(Long codeCli);
	public List<Compte> getComptesParAgent(Long codeEmp);
	public List<Agent> getAgents();

	*/
	
	//ajouter Client
	public Client addClient( Client cl);
	public void updateClient( Long idC );
	public List<Client> consulterClients(Long idCl );
	public boolean supprClient( Long idCl);
	
	public void addCompte( Compte cp);
	public Compte updateCompte( Long  idC);
	public List<Compte> consulterCopmptes(Long idC );
	public boolean supprCompte( Long idC);
	
	
	
	

}
