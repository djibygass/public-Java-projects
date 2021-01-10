
public class LocationWithChauffeur extends Location {
	private String nomChauffeur;
	private double prixServiceChauffeur;
	
	public LocationWithChauffeur(String nom, char categorie, double nbKm,  int nbJours, String nomChauffeur, double prixServiceChauffeur) {
		super(nom, categorie, nbKm, nbJours);
		this.nomChauffeur = nomChauffeur;
		this.prixServiceChauffeur = prixServiceChauffeur;
		
	}


	public String getNomChauffeur() {
		return nomChauffeur;
	}

	public void setNomChauffeur(String nomChauffeur) {
		this.nomChauffeur = nomChauffeur;
	}

	public double getPrixServiceChauffeur() {
		return prixServiceChauffeur;
	}

	public void setPrixServiceChauffeur(double prixServiceChauffeur) {
		this.prixServiceChauffeur = prixServiceChauffeur;
	}
	

	public double montantTotal() {
		return super.montantTotal() + (prixServiceChauffeur*getNbJours());
	}

	@Override
	public String toString() {
		return "LocationWithChauffeur [getNomChauffeur()=" + getNomChauffeur() + ", getPrixServiceChauffeur()="
				+ getPrixServiceChauffeur()+  "]";
	}
	

}
