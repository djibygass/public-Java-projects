
public class Compte {
	
	private String numero;
	private String nom;
	private double solde;
	
	public double getSolde() {
		return solde;
	}
	public String getNom() {
		return nom;
	}
	public String getNumero(){
		return numero;
	}
	
	public void setNom(String name) {
		nom = name;
	}
	public void setSolde(double sold) {
		solde = sold;
	}
	public void setNumero(String num) {
		numero = num;
	}
	
	public void afficher() {
		System.out.println("Numero de compte : "+numero+"\nNom du titulaire : "+nom+"\nSolde : "+solde+ " €");
	}
	
	
}
