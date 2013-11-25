
import java.util.Scanner;

public class java23_DO_WHILE_ParosSzamBeolvasasa_1 {

	public static void main(String[] args) {
		
		System.out.println("Páros szám ellenőrzött beolvasása.");
		
		Scanner inputScanner = new Scanner(System.in);		
		int szam;		
		boolean paros = false; // Páros? -> Nem ill. most még nem tudjuk.
		
		do{
			szam = inputScanner.nextInt();
			
			paros = szam%2 == 0; // 'szam%2 == 0' -> true, 'szam%2 != 0' -> false
			
			// Így a 'szam%2' művelet már csak 1x hajtódik végre, a továbbiakban
			// már csak a 'paros' Logikai változó értékét kell vizsgálni. Azt még így is 2x.
			if(!paros){ 
				System.out.println("Nem páros. Újra!");	
			}
		}
		while (!paros);			
		
		inputScanner.close();
		
		System.out.println("Elfogadva, a szám páros: " + szam);
		
		
	}

}
