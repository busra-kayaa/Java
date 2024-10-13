package Paket1;

// kapsülleme veya sarmalama prensibi sınıfın özelliklerini korumaya almasıdır.
// bu korumayı sağlamak için private ve protected kullanılır.
// kapsülleme prensibinin amacı sınıfa ait özelliklere her sınıfın istediği gibi erişmesini ve değiştirmesini engellemektedir.

public class Main {

	public static void main(String[] args) {
		Personel personel =new Personel();
		// personel.adi="agsagfs"; // boyle değiştiremeyiz .vi
		personel.setAdi("ali");
		System.out.println("personel.getAdi(): "+personel.getAdi());
		
		personel.setYasi(-10);
		System.out.println("personel.getYasi(): "+personel.getYasi());
		
		personel.setMaasi(10000);
		System.out.println("personel.getYasi(): "+personel.getMaasi());	
		
		Personel personel2 =new Personel();
		personel2.setAdi("veli");
		System.out.println("personel2.getAdi(): "+personel2.getAdi());
		
		personel2.setYasi(5);
		System.out.println("personel2.getYasi(): "+personel2.getYasi());
	}

}
