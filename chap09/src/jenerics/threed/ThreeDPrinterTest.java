package jenerics.threed;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		ThreeDPrinter<Powder> printer1 = new ThreeDPrinter<>();
		printer1.setMeterial(new Powder());
		System.out.println(printer1);
		
		ThreeDPrinter<Plastic> printer2 = new ThreeDPrinter<>();
		printer2.setMeterial(new Plastic());
		System.out.println(printer2.toString());
		
		
	}

}
