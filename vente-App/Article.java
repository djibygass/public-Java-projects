
public class Article {
	private String reference;
	private String designation;
	private double prix;
	
	
	public Article(String reference, String designation, double prix) {
		this.reference = reference;
		this.designation = designation;
		this.prix = prix;
	}
	
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	@Override
	public String toString() {
		return "Article [reference=" + reference + ", designation=" + designation + ", prix=" + prix + " €" + "]";
	}
}
