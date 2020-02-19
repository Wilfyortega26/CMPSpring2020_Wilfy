/**
 * Wilfy ortega
 * 
 */




package week4weather;
import java.util.Scanner;
public class WeatherProject {

	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Welcome to coat Adviser");
		System.out.println( " Enter weather in fareinheit:");
		double weather = scnr.nextDouble();
		
		if(weather>70)
			System.out.println("It's hot");
		else if(weather>50)
			System.out.println(" It's warm");
		else if(weather>30)	
			System.out.println("It's cold, wear a jacket");
		else 	
			System.out.println("It's too cold, wear a coat");
	
	
	
	
	}
	
	
	
	
	
	
	
}
