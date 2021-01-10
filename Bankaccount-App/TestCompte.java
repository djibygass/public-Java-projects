import java.util.ArrayList;

public class TestCompte {

	public static void main(String[] args) {
		Compte c = new Compte("B45GHDA","Djibril",10000);
		Compte c2 = new Compte("Q45AEED","Raama",1000);
		//c.debiter(500);
		//c.crediter(2000);
		//c.virer(c2, 500);
		System.out.println(c);
		System.out.println(c2);
		ArrayList<Compte> maListeCompte = new ArrayList<Compte>();
		System.out.println(maListeCompte.size());
		maListeCompte.add(c);
		maListeCompte.add(c2);
		System.out.println(maListeCompte.size());
		maListeCompte.add( new Compte("Q45BGSD","Mamy",4500));
		
	}

}
