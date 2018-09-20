package dao;

import java.util.List;

import entities.Transaction;

public interface ITransactionDAO {

	
	/*transaction*/
	public void verser(double mt,String cpte,Long codeAg);
	public void retirer(double mt,String cpte,Long codeAg);
	public void virement(double mt,String cpte1,String cpte2,Long codeAg);
	public void historique(String codeCpte) ;
	public void envoyerNotification(String cpte, Transaction transaction);
	public List<Transaction> consulterTransaction(String codeCpte, int nbOp);
	
	
}
