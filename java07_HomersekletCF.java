
import java.util.Scanner;

public class java07_HomersekletCF {

	public static void main(String[] args) {
		
		System.out.println("Celsius -> Fahrenheit");
		
		Scanner inputScanner = new Scanner(System.in);		
		double c = inputScanner.nextDouble();
		inputScanner.close();
		
		double f=c*9/5+32;	//értékadás kifejezéssel
		System.out.println("Fahrenheit fok: "+f);
		
	}

}

