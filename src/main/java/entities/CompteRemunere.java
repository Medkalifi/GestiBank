package entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CR")
public class CompteRemunere extends Compte{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double tauxRenumeration;
	
		

	public double getTauxRenumeration() {return tauxRenumeration;}
	public void setTauxRenumeration(double tauxRenumeration) {this.tauxRenumeration = tauxRenumeration;	}
	
	public Double getMtDecouvert() {return mtDecouvert=0;}
	
	
	
	
	public CompteRemunere() {
		super();
	}
	
	
	public CompteRemunere(double tauxRenumeration) {
		super();
		this.tauxRenumeration = tauxRenumeration;
	}

	


	
	}


