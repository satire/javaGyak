import java.util.Scanner;


public class java27_VanE0raVegzodoSzam {

	public static void main(String[] args) {
		
		// Eldöntés tétel
		// Adott egy N elemű sorozat és egy, a sorozat elemein értelmezett T tulajdonság (pl. a kettővel való oszthatóság, 
		// vagy a számjegyek összege prímszám, stb.). 
		// Az algoritmus eredménye: annak eldöntése, hogy van-e a sorozatban legalább egy T tulajdonsággal rendelkező elem.
	
		Scanner inputScanner = new Scanner(System.in);	
		System.out.println("Kérem az első számot:");
		int szam1 = inputScanner.nextInt();
		System.out.println("Kérem a második számot:");
		int szam2 = inputScanner.nextInt();
		inputScanner.close();
		
		// A sorozat a két szám közötti egész számok sorozata, 
		// el kell dönteni, van-e a sorozatnak olyan eleme, ami 
		// maradék nélkül osztható 10-el.
		
		
		int i = Math.min(szam1, szam2); // Mivel a ciklus 'i' értékét fogja a két megadott szám között növelni, célszerű a kisebbtől indulni.
		
		while(i<=Math.max(szam1, szam2) && i%10!=0){
			i++;
		}
		
		boolean van = i<=Math.max(szam1, szam2);
		System.out.println(van?"Van 0-ra végződő szám.":"Nincs 0-ra végződő szám.");
		
		// A probléma ennél könyebben is megoldható
		// HA szam1-szam2>=9 || szam1-szam2<=-9 AKKOR van 0-ra végződő szám a sorozatban.
		
	}

}
