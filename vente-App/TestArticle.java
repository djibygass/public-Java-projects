import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TestArticle {

	public static void main(String[] args) {
		//Article a1 = new Article("VOGUE450A2","COVID-19",2);
		//System.out.println(a1);
		
		Livre L1 = new Livre("78300GAL0","JS",30,45648221,320,new Personne("autJS","autJS","21 mars 1982"));
		Livre L2 = new Livre("75500DS","PHP",35,45648245,400,new Personne("autPHP","autPHP","2 mai 1992"));
		Dvd D1 = new Dvd("SPLASH7878","dvd001",3,35,new Personne("reaDVD1","reaDVD1","15 janvier 1994"));
		Dvd D2 = new Dvd("SPZER","dvd002",7,38,new Personne("reaDVD2","reaDVD2","1 decembre 1994"));
		Livre L3 = new Livre("7845SZZ","JQUERY",50,45785145,260,new Personne("autJS","autJS","21 mars 1982"));
		
		ArrayList<Livre> ListeArticleL = new ArrayList<Livre>();
		ListeArticleL.add(L1);
		ListeArticleL.add(L2);
		ListeArticleL.add(L3);
		ArrayList<Dvd> ListeArticleD = new ArrayList<Dvd>();
		ListeArticleD.add(D1);
		ListeArticleD.add(D2);
		
		String name = JOptionPane.showInputDialog(null,"Entrer le nom de l'auteur ou du realisateur :");
		
		for (int i=0 ; i < ListeArticleL.size(); i++) {
			if (name == ListeArticleL.get(i).getAuteur().getNom()) {
				JOptionPane.showMessageDialog(null,ListeArticleL.get(i));
			}
		}
		for (int i=0 ; i < ListeArticleD.size(); i++) {
			if (name == ListeArticleD.get(i).getRealisateur().getNom()) {
				System.out.println(ListeArticleD.get(i));
			}
		}
	}
	

}
