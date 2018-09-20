package entities;




import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_USER", discriminatorType=DiscriminatorType.STRING)


public  class Utilisateur implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long codeUser;
	private String nom;
	private String prenom;
	private String mdp;
	private String email;
	//@OneToOne
	private String adresse;
	
	
	public Utilisateur(String nom, String prenom, String mdp, String email, String adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.mdp = mdp;
		this.email = email;
		this.adresse = adresse;
	}
	public String getNom() {return nom;	}
	public void setNom(String nom) {this.nom = nom;	}
	public String getPrenom() {	return prenom;	}
	public void setPrenom(String prenom) {	this.prenom = prenom;
	}
	public String getMdp() {return mdp;
	}
	public void setMdp(String mdp) {this.mdp = mdp;
	}
	public String getEmail() {return email;	}
	public void setEmail(String email) {this.email = email;
	}
	public String getAdresse() {return adresse;
	}
	public void setAdresse(String adresse) {	this.adresse = adresse;
	}
	public Utilisateur() {
		super();
		
	}
	public Long getCodeUser() {	return codeUser;	}
	public void setCodeUser(Long codeUser) {this.codeUser = codeUser;
	}
	
	
	
	
}
