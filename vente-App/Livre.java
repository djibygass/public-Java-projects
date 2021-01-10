
public class Livre extends Article {
	private double ISBN;
	private double pages;
	private Personne auteur;
	
	public Livre (String reference, String designation, double prix, double ISBN, double pages, Personne auteur) {
		super(reference, designation, prix);
		this.auteur = auteur;
		this.ISBN = ISBN;
		this.pages = pages;
	}

	public double getISBN() {
		return ISBN;
	}

	public void setISBN(double iSBN) {
		ISBN = iSBN;
	}

	public double getPages() {
		return pages;
	}

	public void setPages(double pages) {
		this.pages = pages;
	}

	public Personne getAuteur() {
		return auteur;
	}

	public void setAuteur(Personne auteur) {
		this.auteur = auteur;
	}

	@Override
	public String toString() {
		return "Livre [ISBN=" + ISBN + ", pages=" + pages + ", auteur=" + auteur + "]";
	}
	
	
}
