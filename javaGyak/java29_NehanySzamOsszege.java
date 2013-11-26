package javaGyak;

import java.util.Scanner;

public class java29_NehanySzamOsszege {
	
	public static void main(String[] args) {
		
		// Az összegzés tétele
		// A program 0 végjelig olvasson be számokat, és írja ki az összegüket.
		
		Scanner inputScanner = new Scanner(System.in);		
		
		final int VEGJEL = 0; //A 'final' kulcsszó olyan konstanst hoz létre, mely értékét a program futása során nem változtathatjuk.
		
		int szam, osszeg=0;
		
		System.out.println("Kérek egy egész számot!");
		
		while ((szam = inputScanner.nextInt()) != VEGJEL) { //AMIG nem adunk 0-t
			System.out.println("Kérek egy egész számot!");
			osszeg+=szam; 
		}
		inputScanner.close();
		System.out.println("A megadott számok összege: " + osszeg);

	}

}
