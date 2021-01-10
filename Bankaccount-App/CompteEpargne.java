
public class CompteEpargne extends Compte {
	
	private double tauxInteret;
	
	public CompteEpargne(String numero,String nom,double solde,double tauxInteret) {
		super(numero, nom, solde);
		this.tauxInteret = tauxInteret;
	}
	
}
