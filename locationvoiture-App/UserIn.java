import javax.swing.JOptionPane;

public class UserIn {

	public static void main(String[] args) {
		String phrase = JOptionPane.showInputDialog(null,"Entrer Une phrase : ");
		JOptionPane.showMessageDialog(null, "le premier charactère est "+phrase.charAt(0)+" \net le dernier est "+phrase.charAt(phrase.length()-1));
		
		if (phrase.length()<=20) {
			JOptionPane.showMessageDialog(null, "La phrase est courte");
		}
		else if(phrase.length()>20 && phrase.length()<50){
			JOptionPane.showMessageDialog(null, "La phrase est de taille moyenne");
		}
		else{
			JOptionPane.showMessageDialog(null, "La phrase est longue");
		}
		//String mot = JOptionPane.showInputDialog(null, "Entrer un mot à rechercher dans la phrase : ");
		String tableau[] = phrase.split(" ");
		JOptionPane.showMessageDialog(null, "Il y'a "+tableau.length+" mots dans cette phrase");
		String mot = JOptionPane.showInputDialog(null,"Rechercher un mot dans la phrase : ");
		int i = 0;
		int count = 0;
		while(i != tableau.length) {
			int var = mot.compareTo(tableau[i]);
			if (var==0) {
				JOptionPane.showMessageDialog(null, "OUI, ce mot existe dans la phrase");
				count++;
				break;
			}
			i++;
		}
		if (count == 0) {
			JOptionPane.showMessageDialog(null, "NON, ce mot n'existe pas dans la phrase");
			JOptionPane.showMessageDialog(null, tableau[0] +" "+ mot );
		}
		
	
		

	}

}
