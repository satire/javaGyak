
public class java16_Fibonacci_0 {

	public static void main(String[] args) {
		
		//Fibonacci sorozat első 20 tagja változó cserével (b=>a, a=>c) 
		
		int db = 20;		
		int a=0, b=1, c;
		
		System.out.println("Fibonacci-sorozat első "+db+" tagja:");
		
		for (int i=1; i<=db; i++){
			c=a+b;
			System.out.print(c+", ");
			b=a;
			a=c;
		}
		
	}

}
