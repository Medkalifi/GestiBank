
package entities;

import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_DEM", discriminatorType=DiscriminatorType.STRING)
public  class Demande {
	@Id
	private Long numDemande;
	private Date DateDemande;
	private Date DateAffectation;
	private String Statut;
	@ManyToOne
	@JoinColumn(name="DEM_CLI")
	private Client client;
	@ManyToOne
	@JoinColumn(name="DEM_AG")
	private Agent agent;
	
	
	
	
	
	public Demande() {
		super();
		
	}
	public Demande(Date dateDemande,String statut) {
		super();
		DateDemande = new Date();
		this.Statut = statut;
		
	}
	
	public Long getNumDemande() {
		return numDemande;
	}
	public void setNumDemande(Long numDemande) {
		this.numDemande = numDemande;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Agent getAgent() {
		return agent;
	}
	public void setAgent(Agent agent) {
		this.agent = agent;
	}
	
	public Date getDateDemande() {return DateDemande;}
	
	public void setDateDemande(Date dateDemande) {DateDemande = dateDemande;	}
	
	public Date getDateAffectation() {
		this.DateAffectation = getDateDemande();
		return DateAffectation;
	}
	public void setDateAffectation(Date dateAffectation) {
		DateAffectation = dateAffectation;
	}
	public String getStatut() {
		return Statut;
	}
	public void setStatut(String statut) {
		Statut = statut;
	}
	
	
		
}


