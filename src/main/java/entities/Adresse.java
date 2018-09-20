package entities;


public class Adresse {
	
	
	private String rue;
  
	private String cp;
	private String ville;
	private int NumeroRue;
	
	public Adresse(String rue, String cp, String ville, int numeroRue) {
		super();
		this.rue = rue;
		this.cp = cp;
		this.ville = ville;
		NumeroRue = numeroRue;
	}

	public String getRue() {return rue;	}

	public void setRue(String rue) {	this.rue = rue;	}

	public String getCp() {		return cp;	}

	public void setCp(String cp) {		this.cp = cp;	}

	public String getVille() {	return ville;	}

	public void setVille(String ville) {this.ville = ville;	}

	public int getNumeroRue() {	return NumeroRue;	}

	public void setNumeroRue(int numeroRue) {NumeroRue = numeroRue;
	}

	public Adresse() {
		super();
		
		
		
		
		
		
		
	}

	public Adresse(String rue, String ville, int numeroRue) {
		super();
		this.rue = rue;
		this.ville = ville;
		NumeroRue = numeroRue;
	}
	
	

	
}



