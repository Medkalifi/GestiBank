package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public  class Transaction implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long numeroTransaction;
	private Date dateTransaction;
	private double montant;
	
	@ManyToOne
	@JoinColumn(name="CODE_CPTE")
	private Compte compte;
	@ManyToOne
	@JoinColumn(name="CODE_AG")
	private Agent agent;
	
		
	public Transaction() {
		super();
			}


	public Transaction(Date dateTransaction, double montant) {
		super();
		this.dateTransaction = dateTransaction;
		this.montant = montant;
	}


	public Date getDateOperation() {return dateTransaction;}

	public void setDateOperation(Date dateTransaction) {this.dateTransaction = dateTransaction;}

	public double getMontant() {return montant;	}

	public void setMontant(double montant) {this.montant = montant;}

	public Long getNumeroTransaction() {return numeroTransaction;
	}

	public void setNumeroTransaction(Long numeroTransaction) {
		this.numeroTransaction = numeroTransaction;
	}

	public Date getDateTransaction() {	return dateTransaction;
	}

	public void setDateTransaction(Date dateTransaction) {
		this.dateTransaction = dateTransaction;
	}

	public Compte getCompte() {	return compte;	}


	public void setCompte(Compte compte) {
		this.compte = compte;
	}


	public Agent getAgent() {
		return agent;
	}


	public void setAgent(Agent agent) {
		this.agent = agent;
	}




}
