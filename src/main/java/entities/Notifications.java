package entities;

import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
@DiscriminatorValue("Notif")
public class Notifications {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codeuser;
	private Long idNotification;
	private Date dateNotification; 
	private String libelle;
	private Demande demande;
	private Transaction transaction;
	
	
	
	public Notifications() {
	
	}
	public Notifications(Long idNotification, Date dateNotification, String libelle, Demande demande,
			Transaction transaction, Long codeuser) {
		super();
		this.codeuser = codeuser;
		this.idNotification = idNotification;
		this.dateNotification = dateNotification;
		this.libelle = libelle;
		this.demande = demande;
		this.transaction = transaction;
	}

	public Long getIdNotification() {
		return idNotification;
	}

	public void setIdNotification(Long idNotification) {
		this.idNotification = idNotification;
	}

	public Date getDateNotification() {
		return dateNotification;
	}

	public void setDateNotification(Date dateNotification) {
		this.dateNotification = dateNotification;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Demande getDemande() {
		return demande;
	}

	public void setDemande(Demande demande) {
		this.demande = demande;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	
	
	

}
