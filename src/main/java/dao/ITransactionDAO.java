package dao;

import java.util.List;

import entities.Transaction;

public interface ITransactionDAO {

	
	/*transaction*/
	
	public Transaction ajouterTransation(Transaction tr,String numCpte);       //cod�e
	public List<Transaction> consulterTransaction(String codeCpte);			 //cod�e
	public void verser(double mt, String cpte);  // cod�e depend de, compte :stephane
	public void retirer(double mt,String cpte);   // cod�e depend de, compte :stephane
	public void virement(double mt,String cpte1,String cpte2,Long codeAg);  // cod�e depend de, compte :stephane
	public void historique(String codeCpte) ;
	public Notification  envoyerNotification(Notification notif);
	public List<Notification> getNotificationsByDestinateur(long idUser);
	
	
}
