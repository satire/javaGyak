package javaGyak;

public class java10_MathOsztaly {

	public static void main(String[] args) {
		System.out.println("|-3| = "+Math.abs(-3)+
		"\nnégyzetgyök(16) = "+Math.sqrt(16)+
		"\nPi = "+Math.PI+
		"\nPi radián = "+Math.toDegrees(Math.PI)+
		// A kerekítés kicsit trükkös, általában erre jobb fügvények is vannak,
		// de a megoldás, hogy 0-ra normalizált számot megszorozzuk 10^n -el, ahol 
		// n a kívánt tizedesjegyek száma, majd egészre kerekítjük, aztán visszaosztunk
		// 10^n -el
		"\nPi/4 kerekítve 3 tizedesre: "+Math.floor(Math.PI/4 * 1000)/1000+	
		"\n45° radián = "+Math.toRadians(45)+		
		"\nsin(45°) = "+Math.sin(Math.toRadians(45))+
		"\nsin(Pi/4) = "+Math.sin(Math.PI/4)+
		"\nnégyzetgyök(2)/2 = "+Math.sqrt(2)/2+	
		// Mindig csak 2 számmal működik!
		// De egymásba lehet ágyazni őket pl. Math.max(Math.max(10,15), Math.max(10,21)); => 21
		"\n12 és 40.5 közül a nagyobb: " + Math.max(12,40.5)+
		"\n1 és -4.5 közül a kisebb: " + Math.min (1, -4.5) +		
		"\n5,6-hez legközelebbi egész: "+Math.round(5.6)+
		"\n5,6-hez legközelebbi egész: "+Math.rint(5.6)+
		"\n2^8 = "+Math.pow(2, 8)+
		"\ntg(45°) = "+Math.tan(Math.toRadians(45))+
		"\ntg(Pi/4) = "+Math.tan(Math.PI/4)+
		"\nlog(1000) = "+Math.log10(1000));
	}

}
