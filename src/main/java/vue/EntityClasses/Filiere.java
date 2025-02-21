package EntityClasses;

public class Filiere {
	private String libelle;
	private String description ;
	private int idFiliere;
	
	public Filiere(String libelle, String description,int idFiliere ) {
		this.libelle = libelle;
		this.description = description;
		this.idFiliere = idFiliere;
	}
	
	public Filiere() {};
	
	public String getLibelle() {
		return libelle;
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getIdFiliere() {
		return idFiliere;
	}
	
	public void setIdFiliere(int idFiliere) {
    	this.idFiliere = idFiliere;
    }
	
	public void setDescription(String description) {
    	this.description = description;
    }
	
	public void setLibelle(String libelle) {
    	this.libelle = libelle;
    }
}
