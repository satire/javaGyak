
import java.util.Scanner;

public class java18_Osztok1 {

	public static void main(String[] args) {
		
		// A program írja ki egy beolvasott pozitív egész pozitív osztóit.
		
		System.out.println("Kérek egy pozitív egész számot!");
		Scanner inputScanner = new Scanner(System.in);		
		int szam = inputScanner.nextInt();
		inputScanner.close();
		
		if (szam>0){ // Ellenőrizni kell, hogy a szám nagyobb-e 0-nál.
			
			System.out.print("A(z) "+szam+" pozitív osztói: ");
			
			for(int i=1; i<=szam; i++){
				// A beolvasott 'szam' és az 'i' ciklusszámláló aktuális értékének vizsgálata, azért, 
				// hogy megtudjuk hogy 'i' osztója-e a 'szam'-nak.
				if(szam%i==0){
					// Ha osztója, kiíratom 
					System.out.print(i + ", ");
				}// Egyébként a ciklus megy tovább...
			}// Ha i==szam a ciklus megáll!			
			
		}else{
			System.out.println("A szám nem pozitív!");
		}
		
	}

}
