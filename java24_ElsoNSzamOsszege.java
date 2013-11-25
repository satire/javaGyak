
import java.util.Scanner;

public class java24_ElsoNSzamOsszege {

	public static void main(String[] args) {
		
		//Az összegzés tétele
		// N elemű sorozat elemeinek összege, szorzata.
		
		System.out.println("Kérek egy pozitív egész számot!");

		Scanner inputScanner = new Scanner(System.in);		
		int N = inputScanner.nextInt();
		inputScanner.close();
		
		int osszeg = 0;
		int i;
		// for cikklussal 'i=0'->N-ig
		for(i=0;i<=N;i++){
			osszeg += i; 
		}
		
		System.out.println("A számok összege 0-"+N+"-ig: "+osszeg+" ("+(i-1)/*Azért i-1 mert az utolsó lépésben i értéke növekszik 1-el, de összegzés már nem történik.*/+" lépésből)");
		
		//A ciklus gyorsítása Gauss megoldásával
		osszeg = 0;
		for(i=1;i<=(int)(N/2);i++){
			osszeg += i + (N-i+1);
		}
		// A ciklus csak páros 'N'-ekre működik jól, páratlan 'N' értéknél korrigálni kell az eredményt.
		if(N%2 != 0)
			osszeg += (int)N/2+1;
			
		System.out.println("A számok összege 0-"+N+"-ig: "+osszeg+" ("+(i-1)+" lépésből)");
		
		// Megoldás 1 lépésben
		System.out.println("A számok összege 0-"+N+"-ig: "+((1+N)*N/2)+" (1 lépésből)");
		
		
	}

}
