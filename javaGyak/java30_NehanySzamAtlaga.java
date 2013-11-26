package javaGyak;

import java.util.Scanner;

public class java30_NehanySzamAtlaga {

	public static void main(String[] args) {
		
		// Összegzés és Megszámlálás tétel együtt
		// A program olvasson be 0 végjelig számokat és írja ki az átlagukat.
		
		Scanner inputScanner = new Scanner(System.in);	
		
		final int VEGJEL = 0; 		
		int szam, osszeg=0, db=0;
		
		System.out.println("Kérek egy egész számot!");
		
		while ((szam = inputScanner.nextInt()) != VEGJEL) {
			System.out.println("Kérek egy egész számot!");
			osszeg+=szam;
			db++;
		}
		inputScanner.close();
		if (db>0){ // Ne osszunk 0-val
			System.out.println("A megadott számok átlaga: " + (double)osszeg/db);
		}else{
			System.out.println("A megadott számoknak nincs átlaga!");
		}
		
	}

}
