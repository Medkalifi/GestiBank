package entities;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Transient;
@Entity
@DiscriminatorValue("CLIENT")
public class Client extends Utilisateur {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long idCl;
	private String telephone;
	private String sm;
	private int enfant;
	private double salaire;
	private Boolean document; 
	@Transient
	private List<Transaction>ListTransaction;
	@Transient
	private List<Demande>listDemande;
	@Transient
	private List<Compte>listCompte;
	
	

	

	public Client() {
		
	}
	
	
	public Client(String nom, String prenom, String mdp, String email, String adresse, String telephone, String sm,
			int enfant, double salaire) {
		super(nom, prenom, mdp, email, adresse);
		this.telephone = telephone;
		this.sm = sm;
		this.enfant = enfant;
		this.salaire = salaire;
	}


	public String getTelephone() {	return telephone;	}


	public void setTelephone(String telephone) {	this.telephone = telephone;	}


	public String getSm() {	return sm;	}


	public void setSm(String sm) {	this.sm = sm;	}


	public int getEnfant() {	return enfant;	}


	public void setEnfant(int enfant) {	this.enfant = enfant;}


	public Long getId() {return idCl;	}


	public void setId(Long id) {	this.idCl = id;	}


	public double getSalaire() {return salaire;	}


	public void setSalaire(double salaire) {this.salaire = salaire;	}


	public Boolean getDocument() {	return document;	}


	public void setDocument(Boolean document) {this.document = document;	}


	public List<Transaction> getListTransaction() {		return ListTransaction;	}


	public void setListTransaction(List<Transaction> listTransaction) {	ListTransaction = listTransaction;	}


	public List<Demande> getListDemande() {	return listDemande;	}


	public void setListDemande(List<Demande> listDemande) {
		this.listDemande = listDemande;
	}


	public List<Compte> getListCompte() {return listCompte;
	}


	public void setListCompte(List<Compte> listCompte) {this.listCompte = listCompte;	}
	
	
	
}


