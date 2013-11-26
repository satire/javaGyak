package javaGyak;

public class java14_FOR_EgyjegyuSzamok {

	public static void main(String[] args) {

		System.out.print("Egyjegyű Természetes számok: "); //System.out.print()-parancs sortörés nélkül irat ki.
		
		// A 'for' ciklus, mindig valamilyen véges intervallumon, meghatározott számú lépésben hajtódik végre,
		// ezért fontos hogy helyes kezdő értéket, vég feltételt és lépésközt állítsunk a ciklusszámlálónak (i).
		// A ciklus szintaktikája lehetővé teszi, hogy egy sorban hozzuk létre és adjunk értéket a ciklusszámlálónak,
		// adjuk meg azt a feltételt, ameddig a ciklusnak futnia kell, és állítsuk be a ciklusszámláló lépésszámonkénti változását.		
		//A leggyakoribb léptetés az eggyel való növelés vagy csökkentés, de a Java megengedi más lépésszám alkalmazását is.
		
		for(int i=0; i<10; i++){
			System.out.print(i+", ");
		}
		
		System.out.println();
		System.out.print("\nEgyjegyű Pozitív számok: ");		
		for(int i=1; i<10; i++){
			System.out.print(i+", ");
		}
		
		System.out.println();
		System.out.print("\nEgyjegyű Negatív számok: ");		
		for(int i=-1; i>-10; i--){
			System.out.print(i+", ");
		}		
		
		System.out.println();
		System.out.print("\n100-nál kisebb páros Természetes számok: ");
		for(int i=0; i<100; i+=2){
			System.out.print(i+", ");
		}
		
		System.out.println();
		System.out.print("\n100-nál kisebb pozitív páros számok: ");
		for(int i=2; i<100; i+=2){
			System.out.print(i+", ");
		}		
		
		System.out.println();
		System.out.print("\n2 10000-nél kisebb egész hatványai: ");
		for(int i=1; i<10000; i*=2){
			System.out.print(i+", ");
		}
		
		System.out.println();
		System.out.print("\n2 első 14 egész hatványa: ");
		for(int i=0; i<14; i++){
			System.out.print((int)Math.pow(2, i)+", ");
		}
		
	}

}
