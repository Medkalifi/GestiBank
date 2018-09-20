import java.util.List;

import entities.Agent;
import entities.Client;
import entities.Compte;
import entities.Demande;
import entities.DemandeMdp;
import entities.Document;
import entities.Transaction;

public class ImetierIMPL implements Imetier {

	@Override
	public Client ajouterClient(Client c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client consulterClient(Long codeCli) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transaction> consulterTransaction(String codeCpte, int nbOp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Agent ajouterAgent(Agent Ag, Long codeAdm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> consulterClients(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Compte ajouterCompte(Compte cp, Long codeCli, Long codeAg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Compte consulterCompte(String codeCpte) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Compte supprimerCompte(String codeCpte, Long codeAg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void verser(double mt, String cpte, Long codeAg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retirer(double mt, String cpte, Long codeAg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void virement(double mt, String cpte1, String cpte2, Long codeAg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void historique(String codeCpte) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void envoyerNotification(String cpte, Transaction transaction) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void demanderChequier(String cpte) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CreationCompte(String cpte) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void validerDemande(Long codecpte) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DemandeMdp ChangementMdp(String Mdp, String cpte) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Document> AjouterDocument(String cpte) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Demande> getDemandesAffectes(Long idAg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Agent> getAgent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Compte> getComptesParClient(Long codeCli) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Compte> getComptesParAgent(Long codeAg) {
		// TODO Auto-generated method stub
		return null;
	}

	