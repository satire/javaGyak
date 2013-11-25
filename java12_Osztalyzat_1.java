
import java.util.Scanner;

public class java12_Osztalyzat_1 {

	public static void main(String[] args) {
		
		System.out.println ("Százalék -> Értékelés");
		System.out.println ("Add meg az elért százalékot (egész)!");
		
		Scanner inputScanner = new Scanner(System.in);		
		int szazalek = inputScanner.nextInt();
		inputScanner.close();
		
		// Az első feltétel, megvizsgálja, hogy a 0-100-ig terjedő érvényes tartományban adtuk-e meg a 'szazalek' változó értékét,
		// különben kiírja a hibát.
		if(szazalek>=0 && szazalek<=100){ 
			
			//Ha az érvényes százalék tartományban vagyunk, addig vizsgáljuk az értéket, míg meg nem találjuk a megfelelő értékelést.
			//Pl. a 85: kisebb mint 60?-nem -> kisebb mint 70?-nem -> kisebb mint 80?-nem -> kisebb mint 90?-igen -> kiírjuk hogy
			// '80%-89%-ig jó.'.
			if(szazalek<60){
				System.out.println ("60% alatt elégtelen.");
			}else if(szazalek<70){
				System.out.println ("60%-69%-ig elégséges.");
			}else if(szazalek<80){
				System.out.println ("70%-79%-ig közepes.");
			}else if(szazalek<90){
				System.out.println ("80%-89%-ig jó.");
			}else{
				System.out.println ("90% felett jeles.");
			}			
			
		}else{
			System.out.println ("Hiba: Érvénytelen százalék érték!");
		}

	}

}
