
public class java17_Fibonacci_1 {

	public static void main(String[] args) {
		
		// Fibonacci sorozat első 20 tagja tömbbel
		// Előnye, hogy a kiszámolt tagok megmaradnak, és később a tömbből egyszerűen kiszedhetők.
		
		int db = 20;
		int[] fibonacci = new int[db]; // A tömb hosszát változóval is be lehet állítani.
		
		System.out.println("Fibonacci-sorozat első "+db+" tagja:");
		
		fibonacci[0] = 1;
		fibonacci[1] = 1;
		
		// A 'fibonacci' tömb feltöltése
		for (int i=2; i<db; i++){
			// A tömb [i]-edik eleme legyen egyenlő a tömb [i-1]. elemének és [i-2]. elemének összegével, amíg i<db.
			// Fontos, hogy 2-től indítsuk a ciklust, hogy az első lépésben is értelmes [i-2]. elemet kapjunk.
			// Ezért kell a [0]. és az [1]. elemnek értéket adni.
			fibonacci[i] = fibonacci[i-1]+fibonacci[i-2];  			
		}
		
		// A 'fibonacci' tömb kiíratása
		for (int i=0; i<db; i++){
			System.out.print(fibonacci[i]+", ");			
		}
		
		// Egy elem kiírása
		System.out.println();
		System.out.println("\nA sorozat 1. tagja a tömb 0. eleme: " + fibonacci[0]);		
		System.out.println("A sorozat 5. tagja a tömb 4. eleme: " + fibonacci[4]);
		System.out.println("A sorozat 20. tagja a tömb 19. eleme: " + fibonacci[19]);
		
	}

}
