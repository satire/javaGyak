
public class java19_3jegyuSzamokKepzeseIsmNelkul {

	public static void main(String[] args) {
		
		// A program írja ki a 2, 3, 4 számjegyekből ismétlés nélkül képezhető összes 3 jegyű számot.
		
		// 'for' ciklusok egymásba ágyazása.
		
		System.out.println("A program írja ki a 2, 3, 4 számjegyekből képezhető összes 3 jegyű számot."); 
		// Ismétléses variáció: 3^3 = 27 a lehetséges három jegyű számok száma.
		// mindegyik ciklus önmagában 3-szor futna le, de mindhárom alkalommal lefuttatja a beágyazott ciklusokat is.
		
		int összesLepes = 0;
		
		for(int i=2; i<=4; i++){ // A 100-asok helyiértékét lépteti, rendre 2,3 vagy 4
			for(int j=2; j<=4; j++){ // A 10-esek helyiértékét lépteti, rendre 2,3 vagy 4
				for (int k=2; k<=4; k++){ // A 1-esek helyiértékét lépteti, rendre 2,3 vagy 4
					System.out.print(""+i+j+k+", ");// A számjegyeket most karakterként kell kiíratni.
					összesLepes++;
				}
			}
		}		
		System.out.println("\nÖsszes lépés: " + összesLepes);
		System.out.println();
		System.out.println("A program írja ki a 2, 3, 4 számjegyekből ismétlés nélkül képezhető összes 3 jegyű számot."); 
		
		összesLepes = 0;
		
		// Ismétlés nélküli variáció: 3!/(3-3)!
		for(int i=2; i<=4; i++){
			for(int j=2; j<=4; j++){
				for (int k=2; k<=4; k++){
					// Ismétlés nélkül azt jelenti, hogy ha az egyik helyiértéket már elfoglalta egy szám,
					// akkor az más helyiértéken már nem szerepelhet újra. Ehez az szükséges, hogy az összesen 3^3
					// lehetséges számból kikeressük azokat ahol i!=j!=k.
					if(i!=j && j!=k && i!=k){ 
						System.out.print(""+i+j+k+", ");						
					}
					összesLepes++;
				}
			}
		}
		// A ciklusok lépésszáma nem változik, csak az eredményeket szűrjük meg.
		System.out.println("\nÖsszes lépés: " + összesLepes);		
		
	}

}
