package jenerics.threed;

public class ThreeDPrinter<T extends Meteriel> {
	private T meterial;

	public String toString() {
		return meterial.toString();
	}
	
	public void print() {
		meterial.doPrint();
	}
	public T getMeterial() {
		return meterial;
	}

	public void setMeterial(T meterial) {
		this.meterial = meterial;
	}
	
}
