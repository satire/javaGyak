
public class java09_Operatorok {

	public static void main(String[] args) {
		
		final int x=7, y=3;			
		
		//A Java fontosabb aritmetikai műveletei
		System.out.println("Összeg (7+3): "+(x+y));
		System.out.println("Különbség (7-3): "+(x-y));
		System.out.println("Szorzat (7*3): "+x*y);
		System.out.println("Egész osztás (7/3): "+x/y);
		System.out.println("Valós osztás (7/3): "+(double)x/y);
		System.out.println("Valós osztás (7/3): "+(1.0*x/y));
		System.out.println("Maradékképzés (7%3): "+x%y);
		System.out.println(x+" ellentettje: "+-x);
		System.out.println(y+" ellentettje: "+-1*y);
		
		System.out.println();
		
		System.out.println("Egy utasításban:");
		//A 9 kiírató utasítás egybe fűzve, \n sortöréssel
		System.out.println("Összeg (7+3): "+(x+y)+
		"\n"+"Különbség (7-3): "+(x-y)+
		"\n"+"Szorzat (7*3): "+x*y+
		"\n"+"Egész osztás (7/3): "+x/y+
		"\n"+"Valós osztás (7/3): "+(double)x/y+
		"\n"+"Valós osztás (7/3): "+(1.0*x/y)+
		"\n"+"Maradékképzés (7%3): "+x%y+
		"\n"+x+" ellentettje: "+-x+
		"\n"+y+" ellentettje: "+-1*y);
	}

}
