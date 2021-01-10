import javax.swing.JOptionPane;

public class Compte {
	private String numero;
	private String nom;
	private double solde;
	
	
	public Compte(String numero, String nom, double solde) {
		this.nom = nom;
		this.numero = numero;
		this.solde = solde;
	}
	
	public void crediter(double somme) {
		this.solde = this.solde + somme;
		
	}
	public boolean debiter(double somme) {
			if (this.solde >=somme) {
				this.solde = this.solde - somme;
				return true;
			}else {
				JOptionPane.showMessageDialog(null, "Pas assez d'argent");
				return false;
			}
		}
	
	public void virer (Compte cpt, double somme) {
		
		if (debiter(somme)) {
		cpt.crediter(somme);
		}else {
			JOptionPane.showMessageDialog(null, "Virement Annulé");
		}
	}
	
	public String getNumero() {
		return numero;
	}
	public String getNom() {
		return nom;
	}
	public double getSolde() {
		return solde;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public void setNom(String nom){
		this.nom = nom;
	}
	public void setSolde(double solde){
		this.solde = solde;
	}
	public String toString() {
		return "Numero de compte : "+numero+"\nNom : "+nom+"\nSolde : "+solde;
	}
	
}