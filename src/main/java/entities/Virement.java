package entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("VIR")
public class Virement extends Transaction{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String CompteDestinataire;

	
	public Virement(Date dateTransaction, double montant, String compteDestinataire) {
	super(dateTransaction, montant);
	CompteDestinataire = compteDestinataire;
}

	public String getCompteDestinataire() {
		return CompteDestinataire;
	}

	public void setCompteDestinataire(String compteDestinataire) {
		CompteDestinataire = compteDestinataire;
	}

	public Virement() {
		super();
		
	}

	
	
}
