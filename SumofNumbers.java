/**
 * 
 * @author wilfy ortega
 *
**/
import java.util.Scanner;
public class SumofNumbers {
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		
	int sum=0;
	int n =10;
	int count =1;
	
	while(count<=n)
	{
		sum=sum + count;
		count++;
	}
	System.out.println("The sum of the first 10 natural numbers is: "+sum);
	}


}
