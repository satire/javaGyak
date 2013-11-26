package javaGyak;

import java.util.Scanner;

public class java20_WHILE_ParosSzamBeolvasasa_0 {

	public static void main(String[] args) {
		
		System.out.println("Páros szám ellenőrzött beolvasása.");
		
		Scanner inputScanner = new Scanner(System.in);		
		int szam = inputScanner.nextInt();	// Beolvas egy egész számot.
		
		// Ha a beolvasott szám páros, a 'while' nem fut le, mivel a feltétel egyből hamis lesz.
		// A 'while' mindig IGAZ ágon működik, tehát ha páros számot szeretnék, addig kell
		// beolvasnom új számot, amíg a szám páratlan azaz 'szam%2 != 0'.
		
		while (szam%2 != 0) {			
			System.out.println("Nem páros. Újra!");
			szam = inputScanner.nextInt();
			// Ha a megadott szám nem páros, a ciklus megakasztja a program futását, és addig kér be 
			// újabb számot, amíg 'szam%2 != 0' feltétel teljesűl, azaz a szám páratlan.
			// Ha a szám páros akkor 'szam%2 == 0' ezért 'while' feltétele hamis lesz, és véget ér a ciklus.
		}
		
		inputScanner.close();
		
		System.out.println("Elfogadva, a szám páros: " + szam);
		
		
	}

}
