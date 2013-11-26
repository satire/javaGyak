package javaGyak;

import java.util.Scanner;

public class java06_Logikai2_1 {

	public static void main(String[] args) {
		
		System.out.println("Pozitív-e a szám?");
		
		//Valós szám beolvasása.
		Scanner inputScanner = new Scanner(System.in);		
		double szam = inputScanner.nextDouble();
		inputScanner.close();
		
		//1.
		if (szam > 0){	//Kiírja hogy pozitív-e a szám
			System.out.println("1:"+"\t"+"A szám pozitív!"); 
		}else{
			System.out.println("1:"+"\t"+"A szám nem pozitív!");
		}
		
		//2.
		boolean pozitiv_e = szam > 0;	//Logikai típusú változó deklarálása + értékadás kifejezéssel ('szam>0' => true, 'szam<0' => false)
		
		if (pozitiv_e){	//Egyenértékű az 'if(szam>0)' kifejezéssel, csak itt a 'pozitiv_e' változó értékét vizsgálja.
			System.out.println("2:"+"\t"+"A szám pozitív!");
		}else{
			System.out.println("2:"+"\t"+"A szám nem pozitív!");
		}
		
		//3.
		//A 0 se nem pozitív, se nem negatív
		//A feltétel 3 ágra bomlik. A megadott valós szám VAGY > 0; VAGY < 0; VAGY == 0 
		if (szam > 0){
			System.out.println("3:"+"\t"+"A szám pozitív!"); 
		}else if(szam < 0){
			System.out.println("3:"+"\t"+"A szám negatív!");
		}else{
			System.out.println("3:"+"\t"+"A szám 0!");
		}	
		
	}

}
