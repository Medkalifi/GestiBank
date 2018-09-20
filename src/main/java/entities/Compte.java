package entities;


import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_CPTE", discriminatorType=DiscriminatorType.STRING)
public  class Compte implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Long idC;
	private String rib;
	private Date dateCreation;
	private double montant;
	private double montantDecouvert;
	
	
	private double debit;
	private double credit;
	@ManyToOne
	@JoinColumn(name="CODE_CLI")
	private Client client;
	
	@ManyToOne
	@JoinColumn(name="CODE_AG")
	private Agent agent;
	@OneToMany(mappedBy="compte")
	
	@Transient
	private Collection<Transaction> transactions;

	public Client getClient() {	return client;}

	public void setClient(Client client) {this.client = client;	}

	public Date getDateCreation() {	return dateCreation;}

	public void setDateCreation(Date dateCreation) {this.dateCreation = dateCreation;	}

	public double getMontant() {return montant;	}

	public void setMontant(double montant) {this.montant = montant;	}

	public double getMontantDecouvert() {return montantDecouvert;	}

	public void setMontantDecouvert(double montantDecouvert) {this.montantDecouvert = montantDecouvert;	}
	
	public String getRib() {return rib;	}

	public void setRib(String rib) {this.rib = rib;	}

	public double getDebit() {	return debit;}

	public void setDebit(double debit) {this.debit = debit;	}

	public double getCredit() {	return credit;}

	public void setCredit(double credit) {	this.credit = credit;}
	
	public Compte() {
		
		
	}

	

	public Compte(String rib, Date dateCreation, double montant, double montantDecouvert) {
		super();
		this.rib = rib;
		this.dateCreation = dateCreation;
		this.montant = montant;
		this.montantDecouvert = montantDecouvert;
	}

	public Long getIdC() {
		return idC;
	}

	public void setIdC(Long idC) {
		this.idC = idC;
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public Collection<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(Collection<Transaction> transactions) {
		this.transactions = transactions;
	}
	
}
