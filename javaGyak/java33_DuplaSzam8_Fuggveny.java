package javaGyak;

import java.util.Scanner;

public class java33_DuplaSzam8_Fuggveny {
	
	// A függvényeknek meghatározott típusú visszatérési értékük van.
	// A függvény a meghívását követően végrehajt egy algoritmust a bemenő paraméterekkel,
	// majd az eredményt és a vezérlést is visszaadja az őt hívó metódusnak.
	static int dupla(int a){
		return 2*a;
	}
	
	public static void main(String[] args) { 
		
		System.out.println("Kérek egy egész számot!");
		Scanner inputScanner = new Scanner(System.in);			
		int szam = inputScanner.nextInt();
		inputScanner.close();
		
		// Egész változó deklarálása és értékadás függvénnyel.
		// A létrehozandó változó típusának és a fügvény visszatérési értékének típusának egyeznie kell.
		int duplaszam = dupla(szam); 	
		System.out.println("A szám kétszerese: "+duplaszam);
		
	}
}
