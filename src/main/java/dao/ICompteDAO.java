package dao;

import entities.Compte;

public interface ICompteDAO { //
	/*comptes*/
	public Compte ajouterCompte(Compte cp,Long codeCli, Long codeAg);
	public Compte consulterCompte(String codeCpte);
	public Compte supprimerCompte(String codeCpte, Long codeAg);
	
}
