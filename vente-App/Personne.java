
public class Personne {
	private String nom;
	private String prenom;
	private String datenaissance;
	
	public Personne(String nom, String prenom, String datenaissance) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.datenaissance = datenaissance;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDatenaissance() {
		return datenaissance;
	}

	public void setDatenaissance(String datenaissance) {
		this.datenaissance = datenaissance;
	}

	@Override
	public String toString() {
		return " [nom=" + nom + ", prenom=" + prenom + ", datenaissance=" + datenaissance + "]";
	}
	
	
	
}
