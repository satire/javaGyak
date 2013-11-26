package javaGyak;

import java.util.Scanner;

public class java05_Logikai2_0 {

	public static void main(String[] args) {
		System.out.println("Pozitív-e a szám?");
		
		//Valós szám beolvasása.
		//A Java tizedes pontot használ tizedes vessző helyett pl: 10,5 nem jó! 10.5 a helyes.
		//Ha nem tizedes ponttal adjuk meg a számot, karakterként fogja értelmezni és
		//kivételt képez a double típusú 'szam' deklarációjában. Ekkor a program azonnal leáll.
		//(Exception in thread "main" java.util.InputMismatchException)
		Scanner inputScanner = new Scanner(System.in);		
		double szam = inputScanner.nextDouble();
		inputScanner.close();
		
		boolean pozitiv_e = szam > 0;	//Logikai típusú változó deklarálása + értékadás kifejezéssel ('szam>0' -> true, 'szam<0' -> false)
		
		System.out.println("A szám pozitív? " + pozitiv_e);	
		
		//A 0 nem pozitív, bár van pozitív 0.	
		
		
	}

}
