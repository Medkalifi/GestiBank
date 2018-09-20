package entities;


import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("CAD")

public class CompteCourantAD extends Compte {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Double MtDecouvert;

	public Double getMtDecouvert() {return MtDecouvert;}

	public void setMtDecouvert(Double mtDecouvert) {MtDecouvert = mtDecouvert;}


	

public CompteCourantAD() {
	
	
}

public CompteCourantAD(String rib, Date dateCreation, double solde, Double mtDecouvert) {
	super(rib, dateCreation, solde);
	MtDecouvert = mtDecouvert;
}










}
