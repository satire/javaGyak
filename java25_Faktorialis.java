import java.util.Scanner;


public class java25_Faktorialis {

	public static void main(String[] args) {
		
		//Az összegzés tétele
		// N elemű sorozat elemeinek összege, szorzata.
		
		System.out.println("n! kiszámítása");
		
		System.out.println("Kérek egy Természetes számot!");
		
		Scanner inputScanner = new Scanner(System.in);		
		int n;
		long fact = 1;
		do{
			n = inputScanner.nextInt();
		}while(n<=0);
		
		inputScanner.close();
		
		for(int i=1; i<=n; i++){
			fact*=i; 
		}
		
		System.out.println(n+"! = "+fact);
		
	}

}
