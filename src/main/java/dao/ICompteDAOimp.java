package dao;

import entities.Client;
import entities.Compte;


public class ICompteDAOimp implements 	ICompteDAO, IgestiBankDao {

	
private IgestiBankDao dao;
	
	
	public void setDao(IgestiBankDao dao) {
		this.dao = dao;
	}
	
	//Find et persist = couche dao anntotations//
	@Override
	public Compte ajouterCompte(Compte cp, Long codeCli, Long codeAg) {
		Client cli=dao.find(Client.class, codeCli);
		cp.setClient(cli);
		dao.persist(cp);
		return cp;
	}

	@Override
	public Compte consulterCompte(String codeCpte) {
		Compte cpte=dao.find(Compte.class, codeCpte);
		return cpte;
	}

	@Override
	public Compte supprimerCompte(String codeCpte, Long codeAg) {
		Compte cpte=dao.remove(Compte.class, codeCpte);
	}

}
