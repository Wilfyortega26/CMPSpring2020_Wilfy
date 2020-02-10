/**
 * 
 * @ Wilfy Ortega
 * description: BMI of 3 different users.
 */
import java.util.Scanner;
public class CMPWeek3 {
	    public static void main(String[] Strings) {

	        Scanner input = new Scanner(System.in);
            // Finding first person's BMI
	         System.out.print("Maria's weight in pounds: ");
	        double weight = input.nextDouble();

	         System.out.print("Maria's height in inches: ");
	        double inches = input.nextDouble();

	        double BMI = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254);
	        System.out.print("Body Mass Index is " + BMI+"\n");
            // Finding 3rd person's BMI
	        
	         System.out.print("David's weight in pounds: ");
	        double weight2 = input.nextDouble();

	         System.out.print("David's height in inches: ");
	        double inches2 = input.nextDouble();

	        double BMI2 = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254);
	        System.out.print("Body Mass Index is " + BMI+"\n");
           
	        // Finding 3rd person's BMI
           System.out.print("Joe's weight in pounds: ");
	        double weight3 = input.nextDouble();

	        System.out.print("Joe's height in inches: ");
	        double inches3 = input.nextDouble();

	        double BMI3 = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254);
	        System.out.print("Body Mass Index is " + BMI+"\n");



}
}