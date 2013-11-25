
import java.util.Scanner; //betölti a Scanner osztályt, amivel consolról lehet beolvasni.

public class java02_HelloNev {

	public static void main(String[] args) {
		
		System.out.println("Hogy hívnak?");
		
		//Beolvas a conzolról bármit és eltárolja a 'nev' String-be
		Scanner inputScanner = new Scanner(System.in);		
		String nev = inputScanner.next();
		
		//Kiirja a tárolt változót Hello_'nev'! formában.
		System.out.println("Hello " + nev + "!");	
		
		inputScanner.close();	//Nem fontos, csak megszabadít a warningoktól.
	}

}
