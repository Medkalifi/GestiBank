package dao;

import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import entities.Compte;
import entities.Credit;
import entities.Debit;
import entities.Transaction;
public class ITransactionDAOimpl implements ITransactionDAO{
	
	private EntityManager em;
	public EntityManager getEm() {return em;	}
	public void setEm(EntityManager em) {this.em = em;}

	
	@Override
	public Transaction ajouterTransation(Transaction tr, String numCpte) {
		Compte c =em.find(Compte.class, numCpte);
		if (tr.getMontant()+ c.getSolde()+c.getMontantDecouvert()>0) {
			tr.setCompte(c);
			c.getTransactions().add(tr);
			c.setSolde(c.getSolde()+tr.getMontant());
			em.persist(tr);
		}else {
			return null; // si probleme de solde";
		}
		return tr;
	}
	

	public void verser(double mt, String cpte) {
		Compte c = new Compte();
		c.consulterCompte(String codeCpte);
		((ITransactionDAO) c).ajouterTransation(new Debit(new Date(),mt), cpte);
		c.setSolde(c.getSolde()+mt);	
		
	}

	public void retirer(double mt, String cpte) {
		Compte c = new Compte();
		c.consulterCompte(String codeCpte);
		((ITransactionDAO) c).ajouterTransation(new Credit(new Date(),mt), cpte);
		c.setSolde(c.getSolde()-mt);
		
	}
	
	public void virement(double mt, String cpte1, String cpte2, Long codeAg) {
		retirer(mt, cpte1);
		verser(mt, cpte2);
		
	}

	@Override
	public void historique(String codeCpte) {
		
		
	}
	@Override
	public List<Transaction> consulterTransaction(String codeCpte ) {
		Query req=em.createQuery("SELECT op FROM Transaction op WHERE op.compte.codeCompte=:x ");
		req.setParameter("x",codeCpte);
			return req.getResultList();
	}
	@Override
	public Notification envoyerNotification(Notification notif) {
		
		return notif;
	}
	@Override
	public List<Notification> getNotificationsByDestinateur(long idUser) {
		Query req=em.createQuery("select notif from Notification notif where destinateur.id=:x ");
		req.setParameter("x",idUser);
		return req.getResultList();
	}
	
}
