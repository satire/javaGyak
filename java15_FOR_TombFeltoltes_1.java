
public class java15_FOR_TombFeltoltes_1 {

	public static void main(String[] args) {
		
		int[] kettoHatvanyai = new int[14]; //2 első 14 hatványa
		
		for(int i=0; i<14; i++){
			kettoHatvanyai[i] = (int) Math.pow(2, i);
			System.out.println("kettoHatvanyai["+i+"] = "+kettoHatvanyai[i]);
		}
		System.out.println();
		System.out.println("2^0 = "+kettoHatvanyai[0]);
		System.out.println("2^3 = "+kettoHatvanyai[3]);
		System.out.println("2^8 = "+kettoHatvanyai[8]);
		System.out.println("2^10 = "+kettoHatvanyai[10]);

	}

}
