package geneliclecture;

public class GenelicPrinterTest {
	public static void main(String[] args) {
		
		Powder powder = new Powder();
		GenericPrinter<Powder> powderprinter = new GenericPrinter<>();
		powderprinter.setMeterial(powder);
		
		Powder p = powderprinter.getMeterial(); //Object형을 쓰면 형변환이 필요하다
		System.out.println(p.toString());
	}
}
