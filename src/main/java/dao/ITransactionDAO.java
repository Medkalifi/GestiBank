package dao;

import java.util.List;

import entities.Transaction;

public interface ITransactionDAO {

	
	/*transaction*/
	
	public Transaction ajouterTransation(Transaction tr,String numCpte);       //codée
	public List<Transaction> consulterTransaction(String codeCpte);			 //codée
	public void verser(double mt, String cpte);  // codée depend de, compte :stephane
	public void retirer(double mt,String cpte);   // codée depend de, compte :stephane
	public void virement(double mt,String cpte1,String cpte2,Long codeAg);  // codée depend de, compte :stephane
	public void historique(String codeCpte) ;
	public Notification  envoyerNotification(Notification notif);
	public List<Notification> getNotificationsByDestinateur(long idUser);
	
	
}
