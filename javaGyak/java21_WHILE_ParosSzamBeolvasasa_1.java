package javaGyak;

import java.util.Scanner;

public class java21_WHILE_ParosSzamBeolvasasa_1 {

	public static void main(String[] args) {
		
		System.out.println("Páros szám ellenőrzött beolvasása.");
		
		Scanner inputScanner = new Scanner(System.in);		
		int szam;
		
		// A 'while' feltételében a kiértékelendő kifejezés változóját beolvastatjuk, addíg amíg a kifejezés igaz.
		// Ez elég szép és rövid, bár nem biztos hogy más nyelvek is megengedik
		while ((szam = inputScanner.nextInt())%2 !=0) { 
			System.out.println("Nem páros. Újra!");	
		}
		
		inputScanner.close();
		
		System.out.println("Elfogadva, a szám páros: " + szam);
		
		
	}

}
