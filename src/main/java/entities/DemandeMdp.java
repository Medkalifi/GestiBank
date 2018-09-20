package entities;



import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("DEM_MDP")
public class DemandeMdp extends Demande{

	public DemandeMdp() {
		super();
		
	}
	
	


}
