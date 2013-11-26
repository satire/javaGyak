import java.util.Scanner;


public class java26_Prim1 {

	public static void main(String[] args) {
		
		// Eldöntés tétel
		// Adott egy N elemű sorozat és egy, a sorozat elemein értelmezett T tulajdonság (pl. a kettővel való oszthatóság, 
		// vagy a számjegyek összege prímszám, stb.). 
		// Az algoritmus eredménye: annak eldöntése, hogy van-e a sorozatban legalább egy T tulajdonsággal rendelkező elem.
		
		System.out.println("Kérek egy 1-nél nagyobb egész számot!");
		
		Scanner inputScanner = new Scanner(System.in);		
		int szam = inputScanner.nextInt();
		inputScanner.close();
		boolean prim;

		if(szam<2){
			prim = false;
		}else{
			int i = 2;
			//HA 'i' kisebb vagy egyenlő mint a 'szam' gyöke és nem osztója a 'szam'-nak
			//AKKOR lép tovább a ciklus 'i'-t növelve eggyel.
			while(i<=Math.sqrt(szam) && szam%i!=0){
				i++;
			}
			//HA nem teljesül valamelyik feltétel a ciklus kilép és folytatódik a program.
			//HA a ciklus végére 'i' meghaladja a 'szam' négyzetgyökét, prím számot adtunk meg,
			//Egyébként a ciklus kilépett az első egész osztó megtalálásakor.
			prim = i>Math.sqrt(szam); // Logikai értékadás kifejezéssel 'i>Math.sqrt(szam)'->true 'i<Math.sqrt(szam)'->false
		}
		System.out.println(prim?"Prím":"Nem prím!");
		
		/* ua:
		 *  
		 * if(prim){
		 * System.out.println("Prím");
		 * }else{
		 * System.out.println("Nem prím");
		 * }
		 */
		
	}

}
