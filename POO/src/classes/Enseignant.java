package classes;

public class Enseignant extends Individu {

	public String specialisation;
	public double salaireMensuel;

	public Enseignant(String nom, String prenom, int identifiant, String specialisation, double salaireMensuel) {
		super(nom, prenom, identifiant);
		this.specialisation = specialisation;
		this.salaireMensuel = salaireMensuel;
	}

	public String getSpecialisation() {
		return this.specialisation;
	}

	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}

	public double getSalaireMensuel() {
		return this.salaireMensuel;
	}

	public void setSalaireMensuel(double salaireMensuel) {
		this.salaireMensuel = salaireMensuel;
	}

	@Override
	public void montrerDetails() {

		System.out.println("Enseignant numero: " + this.identifiant);
		System.out.println(" Nom : " + this.nom);
		System.out.println("Prénom: " + this.prenom);
		System.out.println("Spécialisation: " + this.specialisation);
		System.out.println("Salaire menseul: " + this.salaireMensuel + " euros.");

	}

}
