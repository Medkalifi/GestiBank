package entities;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Transient;
@Entity
@DiscriminatorValue("ADMIN")
public class Administrateur extends Utilisateur{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long idAd;
	@Transient
	private List<Agent>listAgent;
	
	public Long getIdAd() {
		return idAd;
	}



	public void setIdAd(Long idAd) {
		this.idAd = idAd;
	}

	
	
     public Administrateur() {
    	 super();
		
	}



	public List<Agent> getListAgent() {	return listAgent;	}

	public void setListAgent(List<Agent> listAgent) {this.listAgent = listAgent;}

}
