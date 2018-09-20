package entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("DEM_DOC")
public class Document extends Demande{
	
	
	public Document() {
		super();
	}

	public Document(Date dateDemande, String statut) {
		super(dateDemande);
		
	}


}
