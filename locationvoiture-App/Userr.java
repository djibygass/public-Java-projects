import javax.swing.JOptionPane;

public class Userr {
	
	public static void main(String[] args) {
		String phrase = JOptionPane.showInputDialog(null,"Entrer Une phrase : ");
		JOptionPane.showMessageDialog(null, "Le premier charactère est "+phrase.charAt(0)+"\net le dernier est "+phrase.charAt(phrase.length()-1));
		
		if (phrase.length()<=20) {
			JOptionPane.showMessageDialog(null, "La phrase est courte !!" );	
		}
		else if ((phrase.length()>=21) && (phrase.length()<=49)) {
			JOptionPane.showMessageDialog(null, "la phrase est moyenne !!");
		}
		else {
			JOptionPane.showMessageDialog(null, "la phrase est longue !!");
		}
	}
}