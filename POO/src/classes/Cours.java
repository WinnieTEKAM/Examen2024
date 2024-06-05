package classes;

public class Cours {
	protected  String titre;
	protected  String formateur;
	protected int  duree;
	protected int placesRestantes;
	
	public  Cours(String titre, String formateur, int duree, int placesRestantes) {
		this.titre=titre;
		this.formateur=formateur;
		this.duree=duree;
		this.placesRestantes=placesRestantes;
	}
	
	public void montrerDetails () {
		System.out.println("Le titre: " +this.titre);
		System.out.println("Le formateur: " +this.formateur);
		System.out.println("La duree: " +this.duree +" heures.");
		System.out.println("Places restantes " +this.placesRestantes +" places.");
		
	}
}
