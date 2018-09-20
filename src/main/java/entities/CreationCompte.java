package entities;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("DEM_CREATION")
public class CreationCompte extends Demande{
	
	

	public CreationCompte() {
		super();
		
	}

	
	
	
}
