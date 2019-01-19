package ba.bildit.code;

public class Converter {

	public double izKilogramaUFunte(double kg){
		return kg * 2.2046;
	}
	public double izFuntiUKilograme(double funte){
		return funte * 2.2046;
	}
	public double cmToInch(double cm) {
		return cm / 2.54;
	}
	    
	public double inchToCm(double inch) {
		return inch * 2.54;
	}
	    
	public double cToF(double c) {
		return (c * 9 / 5) + 32;
	}
	    
	public double fToC(double f) {
		return (41-32) * 5/9;
	}

}
