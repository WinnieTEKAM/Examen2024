package classes;

import java.util.ArrayList;
import java.util.Date;

public class Etudiant extends Individu implements Participable  {

	public Date dateInscription;
	public String niveauEtude;
	ArrayList<Cours> coursParticipes = new ArrayList<Cours>();
	public Etudiant(String nom, String prenom, int identifiant, Date dateInscription, String niveauEtude) {
		super(nom, prenom, identifiant);
		this.dateInscription = dateInscription;
		this.niveauEtude = niveauEtude;

	}

	@Override
	public void montrerDetails() {
		System.out.println("Etudiant numero: "+this.identifiant);
		System.out.println(" Nom : " +this.nom);
		System.out.println("Prénom: " +this.prenom);
		System.out.println("Date inscription: " +this.dateInscription);
		System.out.println("Niveau etude: " +this.niveauEtude);
		
		
		
	}

	@Override
	public Cours participer() {
		Cours c1 = new Cours(niveauEtude, niveauEtude, coursParticipes.size()+1, identifiant);
		
		coursParticipes.add(c1);
		//placesRestantes++;
		return c1;
		
	}

	@Override
	public Cours quitter() {
Cours c1 = new Cours(niveauEtude, niveauEtude, coursParticipes.size()+1, identifiant);
		
		coursParticipes.remove(c1);
		return c1;
		
	}

}
