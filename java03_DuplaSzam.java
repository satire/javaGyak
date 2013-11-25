
import java.util.Scanner;

public class java03_DuplaSzam {

	public static void main(String[] args) {

		System.out.println("Kérek egy egész számot!");
		
		//Beolvas a konzolról bármit és megpróbálja egész (int) számként értelmezni.
		//Ha nem egész számot adunk, nem tudja berakni az értéket a változóba és kivétellel megáll a program. 
		//(Exception in thread "main" java.util.InputMismatchException)
		Scanner inputScanner = new Scanner(System.in);		
		int szam = inputScanner.nextInt();
		inputScanner.close(); //close() után nem lehet több változót beolvasni.
		
		System.out.println(szam*2); //Kiírja a 'szam' változó kétszeresét.
		
		
	}

}
