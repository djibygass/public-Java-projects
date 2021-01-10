
public class Dvd extends Article {

	private double duree;
	private Personne realisateur;
	
	public Dvd (String reference, String designation, double prix,  double duree, Personne realisateur) {
		super(reference, designation, prix);
		this.realisateur = realisateur;
		this.duree = duree;
	}

	public double getDuree() {
		return duree;
	}

	public void setDuree(double duree) {
		this.duree = duree;
	}


	public Personne getRealisateur() {
		return realisateur;
	}

	public void setRealisateur(Personne realisateur) {
		this.realisateur = realisateur;
	}

	@Override
	public String toString() {
		return "Dvd [duree=" + duree + "min , realisateur=" + realisateur + "]";
	}
}
