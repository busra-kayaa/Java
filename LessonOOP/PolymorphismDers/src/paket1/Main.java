package paket1;

import paket2.*;

// çok biçimlilik
// metotların nesneye göre farklı çıktılar üretmesi ve farklı işler yapması
// not-visible
public class Main {

	public static void main(String[] args) {
		personel personel =new personel();
		// personel.adi="agsagfs"; // boyle değiştiremeyiz .vi
		personel.setAdi("ali");
		System.out.println("personel.getAdi(): "+personel.getAdi());
		
		personel.setYasi(-10);
		System.out.println("personel.getYasi(): "+personel.getYasi());
		
		personel.setMaasi(10000);
		System.out.println("personel.getMaasi(): "+personel.getMaasi());
		
		System.out.println("personel.MaasHesapla():"+personel.MaasHesapla());
		System.out.println("maas guncellendi: personel.getMaasi(): "+personel.getMaasi());

		
		//personel mudur = new mudur(); //personel gibi davranır.
		mudur mudur = new mudur();
	

		mudur.setMaasi(10000);
		System.out.println("mudur.getMaasi(): "+mudur.getMaasi());
		System.out.println("mudur.MaasHesapla(): "+mudur.MaasHesapla()); //mudur.MaasHesapla bir çağrıdır
		System.out.println("guncel data: mudur.getMaasi(): "+mudur.getMaasi());

		isci isci = new isci();
		isci.setMaasi(10000);
		System.out.println("isci.getMaasi(): "+isci.getMaasi());
		System.out.println("isci.MaasHesapla(): "+isci.MaasHesapla());
		System.out.println("guncel data: isci.getMaasi(): "+isci.getMaasi());
	}

}
