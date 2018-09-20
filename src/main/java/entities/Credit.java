package entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("CRE")
public class Credit extends Transaction{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Credit() {
		super();
		
	}

	public Credit(Date dateTransaction, double montant) {
		super(dateTransaction, montant);
		
	}

	


}
