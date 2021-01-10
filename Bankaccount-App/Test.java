import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		//JOptionPane.showMessageDialog(null, "yoooo");
		String nom = JOptionPane.showInputDialog(null,"Nom :");
		//JOptionPane.showMessageDialog(null, "yoooo " + nom);
		System.out.println(nom.charAt(0));
		System.out.println("Il y'a  "+nom.length()+" charactères");
		System.out.println(nom.toUpperCase());
		
	}

}
