package Java100Programs;

import java.text.DecimalFormat;

public class FahrenheitInCelsius {
	public static void main(String args[]) {
		FahrenheitInCelsius fc = new FahrenheitInCelsius();
		fc.FahrenheitToCelsius(25.32);
	}
	public void FahrenheitToCelsius(double d){
		double cel = (d-32)*5/9;
		DecimalFormat df = new DecimalFormat("#.000");  
		float cel2 = Float.valueOf(df.format(cel));
		System.out.println("Temp  in Fahrenheit : "+d+ " Temp in Celsius : "+cel2 );
	}
}
//FahrenheitToCelsius formula (80°F − 32) × 5/9