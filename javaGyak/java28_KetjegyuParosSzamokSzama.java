package javaGyak;

public class java28_KetjegyuParosSzamokSzama {

	public static void main(String[] args) {
		
		// Megszámlálás tétel
		// Rendelkezésre áll egy N elemű sorozat, és egy, a sorozat elemein értelmezett T tulajdonság. 
		// Most a T tulajdonsággal rendelkező elemek megszámlálása a feladat.
		
		System.out.print("A kétjegyű páros számok száma: ");
		int db = 0; // A 'db' változó értéke minden esetben, ha páros számot találunk nőni fog 1-el.
		for (int i=10; i<=99; i++){ //10 a legkisebb kétjegyű szám, 99 a legnagyobb, közöttük fog futni a ciklus
			if(i%2==0){ //Eldöntöm hogy a szám páros-e
				//HA igen 'db'-t növelem
				db++;
			}
		}
		System.out.println(db);
		
		
	}

}
