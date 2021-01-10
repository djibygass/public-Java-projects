
public class Location {
	
	private String nom;
	private char categorie;
	private double nbKm;
	private int nbJours;   //Nom chauffeur / prixChauffeurJour
	
	public Location(String nom, char categorie, double nbKm, int nbJours) {
		this.nom = nom;
		this.categorie = categorie;
		this.nbKm = nbKm;
		this.nbJours = nbJours;
	}

	public double montantJour()
	{
		if(categorie == 'e' || categorie=='E')
		{
			return 30;
		}else if(categorie=='c' || categorie=='C')
		{
			return 50;
		}else {
			return 75;
		}
	}
	
	public double montantLocation()
	{
		return montantJour() * nbJours;
	}
	
	/**
	 * Calcule le nombre de km supplementaires
	 * @return
	 */
	public int kmSupplementaire()
	{
		int nbS = nbJours / 7;
		int nbJ = nbJours % 7;
		int nbKmInclus = nbS * 1000 + (nbJ * 100);
		if(nbJours == 30) nbKmInclus = 5000;
		
		if(nbKm > nbKmInclus) {
			return (int)nbKm - nbKmInclus;
		}
		
		return 0;
	}
	
	public double prixKmSupplementaire()
	{
		return kmSupplementaire() * 0.5;
	}
	
	public double montantTotal()
	{
		return montantLocation() + prixKmSupplementaire();
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public char getCategorie() {
		return categorie;
	}

	public void setCategorie(char categorie) {
		this.categorie = categorie;
	}

	public double getNbKm() {
		return nbKm;
	}

	public void setNbKm(double nbKm) {
		this.nbKm = nbKm;
	}

	public int getNbJours() {
		return nbJours;
	}

	public void setNbJours(int nbJours) {
		this.nbJours = nbJours;
	}

	@Override
	public String toString() {
		return "Location [nom=" + nom + ", categorie=" + categorie + ", nbKm=" + nbKm + ", nbJours=" + nbJours + "]";
	}
	
	

}
