package entities;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Transient;
@Entity
@DiscriminatorValue("AGENT")
public class Agent extends Utilisateur{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long idAg;
	private String matricule;
	private int telephone;
	@Transient
	private List<Client>listClient;
	@Transient
	private List<Demande>listDemande;
	
	
	
	


	


	public Agent(String nom, String prenom, String mdp, String email, String adresse, String matricule,
			int telephone) {
		super(nom, prenom, mdp, email, adresse);
		this.matricule = matricule;
		this.telephone = telephone;
	}


	public String getMatricule() {	return matricule;	}


	public void setMatricule(String matricule) {this.matricule = matricule;	}





	public int getTelephone() {	return telephone;	}


	public void setTelephone(int telephone) {	this.telephone = telephone;	}


	public List<Client> getListClient() {return listClient;	}


	public void setListClient(List<Client> listClient) {this.listClient = listClient;}


	public List<Demande> getListDemande() {	return listDemande;	}


	public void setListDemande(List<Demande> listDemande) {	this.listDemande = listDemande;
	}


	public Agent() {
		super();
		
	}


	public Agent(String nom, String prenom, String mdp, String email, String adresse) {
		super(nom, prenom, mdp, email, adresse);
		
	}


	public Long getIdAg() {
		return idAg;
	}


	public void setIdAg(Long idAg) {
		this.idAg = idAg;
	}
	
	
	
	
}

	

