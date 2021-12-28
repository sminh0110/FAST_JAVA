package geneliclecture;

public class PowderPrinter {
	private Powder powder = new Powder();

	public Powder getPowder() {
		return powder;
	}

	public void setPowder(Powder powder) {
		this.powder = powder;
	}
	
	public String toString() {
		return "재료: Powder";
	}
}
