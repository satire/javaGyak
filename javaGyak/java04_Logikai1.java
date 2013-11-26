package javaGyak;

public class java04_Logikai1 {

	public static void main(String[] args) {
		boolean szepAzIdo = false; 								//Logikai típusú változó deklarálása + értékadás (true/false)
		System.out.println("Szép az idő?" + "\t" + szepAzIdo); 	//Kiírja a 'Szép az idő?' kérdést és egy tabulator után a 'szepAzIdo' változó értékét.
		szepAzIdo = true; 										//A deklarált változó értékének módosítása
		System.out.println("Szép az idő?" + "\t" + szepAzIdo); 	//Újbóli kiíratás	
	}

}
