package EntityClasses;

public class Etudiant {
	private int matricule ;
	private String prenom;
	private String nom ;
	private int age ;
	private int idFiliere;
	
	public Etudiant(int matricule, String prenom, String nom, int age , int idFiliere ) {
		this.matricule = matricule;
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
		this.idFiliere = idFiliere;	
	}
	
	public Etudiant() {};
	
	public String getNom() {
    	return nom;
	}
	
	public String getPrenom() {
    	return prenom;
    }
	
	public int getMatricule() {
    	return matricule;
    }
	
	public int getAge() {
    	return age;
    }
	
	public int getIdFiliere() {
    	return idFiliere;
    }
	
	public void setNom(String nom) {
    	this.nom = nom;
    }
	public void setPrenom(String prenom) {
    	this.prenom = prenom;
    }
	
	public void setAge(int age) {
    	this.age = age;
    }
	
	public void setIdFiliere(int idFiliere) {
    	this.idFiliere = idFiliere;
    }
	
	public void setMatricule(int matricule) {
    	this.matricule = matricule;
    }
	
	
	
	
	
	

}
