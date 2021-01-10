import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TestLocation {

	public static void main(String[] args) {

		Location loc1 = new Location("Dupont", 'c', 5500, 30);
		Location loc2 = new Location("Leroy", 'l', 700, 6);
		
		
		ArrayList<Location> mesLocations = new ArrayList<Location>();
		mesLocations.add(loc1);
		mesLocations.add(loc2);
		
		
		double som = 0;
		int nb = 0, nb2 = 0;
		for (Location location : mesLocations) {
			System.out.println("Prix total de la location : "+location.montantTotal()+
				                        "�\nNombre de Km suppl�mentaires : " + location.kmSupplementaire()+"km"
				                        +"\nPrix des Km suppl�mentaires : " + location.prixKmSupplementaire()+"�"
				                        +"\nPrix / jours du v�hicule : "+ location.montantJour()+"�");
			if(location.getNbJours()>10) nb++;
			som = som + location.montantTotal();
		}
		
		for (int i = 0; i < mesLocations.size(); i++) {
			System.out.println(mesLocations.get(i)) ;
		}
		
		System.out.println(nb + " locations ont �t� sup�rieures � 10 jours");
		
//		JOptionPane.showMessageDialog(null, "Prix total de la location : "+loc1.montantTotal()+
//				                        "�\nNombre de Km suppl�mentaires : " + loc1.kmSupplementaire()+"km"
//				                        +"\nPrix des Km suppl�mentaires : " + loc1.prixKmSupplementaire()+"�"
//				                        +"\nPrix / jours du v�hicule : "+ loc1.montantJour()+"�");

	}
	

}
