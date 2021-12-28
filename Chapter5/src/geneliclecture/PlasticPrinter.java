package geneliclecture;

public class PlasticPrinter {
	private Plastic plastic = new Plastic();

	public Plastic getPlastic() {
		return plastic;
	}

	public void setPlastic(Plastic plastic) {
		this.plastic = plastic;
	}
	
	public String toString() {
		return "재료: Plastic";
	}
}
