package javaGyak;

import java.util.Scanner;

public class java32_DuplaSzam7_Eljaras {

	// Az eljárás a meghívását követően végrehajt egy algoritmust a bemenő paraméterekkel,
	// majd a vezérlést visszaadja az őt hívó metódusnak.
	static void dupla(int a){
		System.out.println("A szám kétszerese: "+2*a);
	}
	
	// A programok végrehajtása mindig ebben az eljárásban kezdődik
	public static void main(String[] args) { 
		
		System.out.println("Kérek egy egész számot!");
		Scanner inputScanner = new Scanner(System.in);			
		int szam = inputScanner.nextInt();
		inputScanner.close();
		
		// A 'dupla' eljárás meghívása 'szam' paraméterrel. 
		// A paraméterek típusának rendre egyezniük kell, az eljárásban deklarált típusokkal!
		// Azaz a dupla() eljárás egy darab egész számot vár paraméterül, azt is kell kapjon.
		// Az eljárás végén a vezérlés visszakerül a 'main()'-hez.
		dupla(szam); 
	}

}
