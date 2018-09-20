package entities;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("CSD")
public class CompteCourantSD extends Compte{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CompteCourantSD() {
		super();
		
	}

	public Double getMtDecouvert() {return mtDecouvert=0;}
	
	
	

}
