package ders1;

//KALITIM (INHERITANCE)

public class main {

	public static void main(String[] args) 
	{
		sekil s = new sekil();
		s.Goster();
		System.out.println("AlanHesapla():"+s.AlanHesapla());
		
		daire benimDaire= new daire(10);
		benimDaire.Goster();
		System.out.println("benimDaire.AlanHesapla(): "+benimDaire.AlanHesapla());
		
		dikdörtgen dd1= new dikdörtgen(10,20);
		dd1.Goster();
		System.out.println("dd1.AlanHesapla():"+dd1.AlanHesapla());
		
		sekil dd2= new dikdörtgen(20,30);
		dd2.Goster();
		System.out.println("dd2.AlanHesapla():"+dd2.AlanHesapla());
		
		kare k1=new kare(10);
		System.out.println();
		k1.AlanHesapla();
	}

}
