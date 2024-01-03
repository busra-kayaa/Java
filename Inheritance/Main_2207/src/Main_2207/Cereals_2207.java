package Main_2207;

import java.util.ArrayList;

public class Cereals_2207 extends Urun_2207 {
	public String kategoriAdi;
	public String detay;
	
	public static void CerealsListGoster(ArrayList<Cereals_2207> cerealsList) {
		for (Cereals_2207 cereals : cerealsList) {
			System.out.println(
					cereals.adi+"\t"+ 
					cereals.kategoriIndex+"\t"+
					cereals.birimAgirligi+"\t"+
					cereals.birimFiyat+"\t"+
					cereals.stokMiktari+"\t"+
					cereals.kategoriAdi+"\t"+
					cereals.detay);
		}
	}
	
	public static void TahilUrunEkle(String Adi, String BirimAgirligi,Double BirimFiyatı, int StokMiktari,
			ArrayList<Cereals_2207> cerealsList) {
		Cereals_2207 yeniCereals= new Cereals_2207();
		yeniCereals.adi=Adi;
		yeniCereals.kategoriIndex=5;
		yeniCereals.birimAgirligi=BirimAgirligi;
		yeniCereals.birimFiyat=BirimFiyatı;
		yeniCereals.stokMiktari=StokMiktari;
		yeniCereals.kategoriAdi="Cere"+"als";
		yeniCereals.detay=" ";
		cerealsList.add(yeniCereals);
		
		
	}
}