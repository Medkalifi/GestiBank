package entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("DEM_DOC")
public class Document extends Demande{
	
	public long codeuser;
	
	public Document() {
		super();
	}

	public Document(Date dateDemande, String statut) {
		super(dateDemande, statut);
		
	}

	public long getCodeuser() {
		return codeuser;
	}

	public void setCodeuser(long codeuser) {
		this.codeuser = codeuser;
	}


		
	}



