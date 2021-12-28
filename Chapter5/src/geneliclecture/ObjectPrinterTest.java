package geneliclecture;

public class ObjectPrinterTest {
	public static void main(String[] args) {
		
		Powder powder = new Powder();
		ObjectPrinter printer = new ObjectPrinter();
		
		printer.setMeterial(powder);
		
		Powder p = (Powder)printer.getMeterial();
	}
}
