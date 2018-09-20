package metier;


import java.util.List;

import entities.Agent;
import entities.Client;
import entities.Compte;
import entities.Demande;
import entities.DemandeMdp;
import entities.Document;
import entities.Transaction;

public interface Imetier {
	
	
	/*client*/
	public Client ajouterClient(Client c);
	public Client consulterClient(Long codeCli);
	
public List<Transaction> consulterTransaction(String codeCpte, int nbOp);
	
	/*agent*/
	public Agent ajouterAgent(Agent Ag,Long codeAdm);
	
	public List<Client> consulterClients(String mc);
	
	

	/*comptes*/
	public Compte ajouterCompte(Compte cp,Long codeCli, Long codeAg);
	public Compte consulterCompte(String codeCpte);
	public Compte supprimerCompte(String codeCpte, Long codeAg);
	
	
	/*transaction*/
	public void verser(double mt,String cpte,Long codeAg);
	public void retirer(double mt,String cpte,Long codeAg);
	public void virement(double mt,String cpte1,String cpte2,Long codeAg);
	public void historique(String codeCpte) ;
	public void envoyerNotification(String cpte, Transaction transaction);
	
	
	
	
	/*demande*/
	public void demanderChequier(String cpte);
	public void CreationCompte(String cpte);
	public void validerDemande(Long codecpte);
	public DemandeMdp ChangementMdp(String Mdp, String cpte);
	public  List<Document> AjouterDocument(String cpte);
	public List<Demande> getDemandesAffectes(Long idAg);
	
	
	/* concerne adm*/
	public List<Agent> getAgent();
	public List<Compte> getComptesParClient(Long codeCli);
	public List<Compte> getComptesParAgent(Long codeAg);
	
}

	


	

