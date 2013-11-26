package javaGyak;

public class java11_MathRandom {

	public static void main(String[] args) {
		/*
		 Math.random() függvény egy valós (double) típusú véletlenszámot (például 0.5678) 
		 ad vissza a [0; 1) intervallumból. Ez az intervallum balról zárt, jobbról nyitott, 
		 vagyis a fuggvény visszaadhat 0.0-t, de nem adhat vissza 1.0-t.
		 Ahhoz hogy megfelelő típusú ill. tetszőleges értékhatárok közötti véletlenszámot kapjunk, 
		 a generált számot kell manipulálni, így kiterjesztve a intervallumot, esetleg típus kényszerítéssel 
		 megfelelő típusú változóba rakni.
		*/
		System.out.println("Math.random() függvény: " + Math.random() +
		"\negyjegyű szám: " + (int) (Math.random()*10)+
		"\nkétjegyű szám: " + (int) (Math.random()*90+10)+
		"\nháromjegyű szám: " + (int) (Math.random()*900+100)+
		"\nszám a [-20;+30] zárt intervallumból: " + (int) (Math.random()*(30-(-20)+1)+(-20))+
		"\nszám a [-20;+30] zárt intervallumból: " + (int) (Math.random()*(51)-20)+
		"\nötöslottó egyik száma: " + (int) (Math.random()*90+1)+
		"\nkétjegyű páros szám: " + (int) ((Math.random()*45)*2+10)+
		"\nháromjegyű páratlan szám: " + (int) (Math.random()*450)*2+101);
	}

}
