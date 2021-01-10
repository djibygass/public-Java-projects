import javax.swing.JOptionPane;

public class Person {
	private String nom;
	private int age;
	private double taille;
	private double poids;
	
	public Person(String nom, int age, double taille, double poids) {
		this.nom = nom;
		this.age = age;
		this.taille = taille;
		this.poids = poids;
	}
	
	public boolean isAdult() {
		if (this.age>=20 && this.age<=65) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void detersignifIMC() {
		if(isAdult()) {
			double IMC = this.poids / (this.taille*2);
			JOptionPane.showMessageDialog(null, "le IMC est : "+IMC);
			if (IMC < 18.5) {
				JOptionPane.showMessageDialog(null, "Classification : Maigreur \nCommentaire : Poids inférieur à la normale");
			}
			else if (IMC >= 18.5 && IMC <= 24.9) {
				JOptionPane.showMessageDialog(null, "Classification : Normal \nCommentaire : Poids normale");
			}
			else if (IMC >= 25.0 && IMC <= 29.9) {
				JOptionPane.showMessageDialog(null, "Classification : Surpoids \nCommentaire : Surpoids");
			}
			else if(IMC >= 30.0 && IMC <=34.9) {
				JOptionPane.showMessageDialog(null, "Classification : Obésité niveau 1 \nCommentaire : Obésité modérée");
			}
		}
		else {
			JOptionPane.showMessageDialog(null,"Vous n'êtes pas autorisé au IMC !!! ");
		}
		
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setTaille(double taille) {
		this.taille = taille;
	}
	public void setPoids(double poids) {
		this.poids = poids ;
	}
	public String getNom() {
		return nom;
	}
	public int getAge(){
		return age;
	}
	public double getTaille() {
		return taille;
	}
	public double getPoids() {
		return poids;
	}
	public String toString() {
		return "Nom : "+nom+"\nâge : "+age+"\nTaille : "+taille+"\nPoids : "+poids;
	}
	
	
}
