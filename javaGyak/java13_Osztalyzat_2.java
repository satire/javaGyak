package javaGyak;

import java.util.Scanner;

public class java13_Osztalyzat_2 {

	public static void main(String[] args) {
		
		System.out.println ("Osztályzat számmal -> Osztályzat szöveggel");
		System.out.println ("Add meg az érdemjegyet (egész)!");
		
		Scanner inputScanner = new Scanner(System.in);		
		int jegy = inputScanner.nextInt();
		inputScanner.close();		
		
		// A switch szerkezet feltételes ugró utasítást hajt végre. 
		// Megvizsgálja adott változó értékét és a 'case' (esetek) szerinti utasításblokkot hajtja végre.
		// A szerkezet a sok ágú 'if-else if-...-else' szerkezetek egyszerű leírására való, de működésében eltér  
		// azoktól. Ilyen eltérés, hogy fontos a case blokkokat a 'break;' paranccsal zárni, különben a végrehajtás 
		// folytatódik a többi blokkal.
		// A 'default' eset jelenti a töbszörös elágazás 'else' ágát, azaz a minden más esetben végrehajtandó
		// utasítást.
		// A switch csak byte, short, int, char és a 7-es Java óta String vagy ENUM típusú változókkal használható.
		// Csak értékek egyezésének vizsgálatára képes, ezért bonyolultabb feltétel rendszerhez mindenképpen az
		// 'if-else if-...-else' szerkezetet kell használni.
		
		switch(jegy){
		case 1: System.out.println("elégtelen");break;
		case 2: System.out.println("elégséges");break;
		case 3: System.out.println("közepes");break;
		case 4: System.out.println("jó");break;
		case 5: System.out.println("jeles");break;
		
		default: System.out.println("Érvénytelen osztályzat!");break;
		}
		
		
	}

}
