package classes;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Date date = new Date();
		date.setYear(0);;;
		Etudiant e1 = new Etudiant("Dupez","Thmas",1,date,"CM1");
		Etudiant e2= new Etudiant("Qoz","Idriss",2,date,"CE2");
		e1.montrerDetails();
		e2.montrerDetails();
		Cours c1 = new Cours("Maths","Jean",10, 8);
		Cours c2 = new Cours("Anglais","Jan",12, 10);
		c1.montrerDetails();
		c2.montrerDetails();
		
		Enseignant en1 = new Enseignant("Ames","Jose",1,"Prof de maths",2000);
		Enseignant en2 = new Enseignant("Ames","Jose",2,"Prof d anglais",2000);
		en1.montrerDetails();
		en2.montrerDetails();
	}

}
