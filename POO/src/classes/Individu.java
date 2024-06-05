package classes;

public abstract class Individu {
	protected String nom;
	protected String prenom;
	protected int identifiant;

	public Individu(String nom, String prenom, int identifiant) {
		this.nom = nom;
		this.prenom = prenom;
		this.identifiant = identifiant;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getIdentifiant() {
		return this.identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public abstract void montrerDetails();

}
