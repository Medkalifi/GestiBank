package entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("DEB")
public class Debit extends Transaction {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Debit() {
		super();
		
	}

	public Debit(Date dateTransaction, double montant) {
		super(dateTransaction, montant);
		
	}

	

	


}
