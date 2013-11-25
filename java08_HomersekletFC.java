import java.util.Scanner;

public class java08_HomersekletFC {

	public static void main(String[] args) {
		
		System.out.println("Fahrenheit -> Celsius");
		
		Scanner inputScanner = new Scanner(System.in);		
		double f = inputScanner.nextDouble();
		inputScanner.close();
		
		double c=(f-32)*5/9;
		System.out.println("Celsius fok: "+c);

	}

}
