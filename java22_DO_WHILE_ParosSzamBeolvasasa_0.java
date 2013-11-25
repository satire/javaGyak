
import java.util.Scanner;

public class java22_DO_WHILE_ParosSzamBeolvasasa_0 {

	public static void main(String[] args) {
		
		System.out.println("Páros szám ellenőrzött beolvasása.");
		
		Scanner inputScanner = new Scanner(System.in);		
		int szam;		
		
		do{
			szam = inputScanner.nextInt();
			// Mivel a ciklus előbb lefut, és csak aztán teszteli a feltételt,
			// ezért ha nem vizsgálom meg a feltételt a ciklus magjában, akkor is
			// kiírná, hogy 'Nem páros. Újra!', ha páros számot adunk meg.
			// Ezt elkerülendő van itt egy feleslegesnek tűnő plusz vizsgálat.
			// Ha javítani kéne a ciklus teljesítményét, legalább a 'szam%2' művelet
			// két felesleges elvégzését meg kéne szűntetni. 
			if(szam%2 != 0){ 
				System.out.println("Nem páros. Újra!");	
			}
		}
		while (szam%2 != 0);
		
		inputScanner.close();
		
		System.out.println("Elfogadva, a szám páros: " + szam);
		
		
	}

}
