package javaGyak;

import java.util.Scanner;

public class java31_NehanySzamMaximuma {

	public static void main(String[] args) {
				
				// Maximumkiválasztás tétele
				// A program olvasson be 0 végjelig számokat és írja ki a legnagyobbat.
				
				Scanner inputScanner = new Scanner(System.in);	
				
				final int VEGJEL = 0; 		
				// maximumnak a legkisebb lehetséges int értéket adva, bármely először beolvasott 'szam >= max'
				int szam, max=-2147483648, db=0; 
				
				System.out.println("Kérek egy egész számot!");
				
				while ((szam = inputScanner.nextInt()) != VEGJEL) {
					
					System.out.println("Kérek egy egész számot!");
					// Ahhoz, hogy meg tudjuk mondani, adott sorozatban melyik a legnagyobb érték,
					// végig kell menni az elemein, és a 'max' változóban tárolt értékkel összehasonlítani minden elemet.
					// HA adott elem nagyobb mint a 'max' AKKOR kicserélem a 'max' értéket az elemre,
					// EGYÉBKÉNT folytatom a vizsgálatot a következő elemmel.
					// A ciklus végére a 'max' változó a legnagyobb elem értékét fogja tárolni.
					if(szam>max){
						max=szam;
					}
					db++;					
				}
				
				inputScanner.close();
				
				if (db>0){
					System.out.println("A legnagyobb érték a sorozatban: " + max);
				}else{
					System.out.println("Nem adtál meg számokat!");
				}
	}

}
