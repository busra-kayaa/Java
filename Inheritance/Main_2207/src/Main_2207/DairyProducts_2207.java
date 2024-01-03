package Main_2207;

import java.util.ArrayList;

public class DairyProducts_2207 extends Urun_2207{
	public String kategoriAdi;
	public String detay;
	
	public static void DairyProductsListGoster(ArrayList<DairyProducts_2207> dairyProductsList) {
		for (DairyProducts_2207 dairyProducts : dairyProductsList) {
			System.out.println(
					dairyProducts.adi+"\t"+ 
					dairyProducts.kategoriIndex+"\t"+
					dairyProducts.birimAgirligi+"\t"+
					dairyProducts.birimFiyat+"\t"+
					dairyProducts.stokMiktari+"\t"+
					dairyProducts.kategoriAdi+"\t"+
					dairyProducts.detay);
		}
	}
	public static void SutUrunuSil(int minFiyat, int maxFiyat, ArrayList<DairyProducts_2207> dairyProductsList) {
        ArrayList<DairyProducts_2207> silinecekUrunler = new ArrayList<>();

        for (DairyProducts_2207 dairyProducts : dairyProductsList) {
            if (dairyProducts.birimFiyat > minFiyat && maxFiyat > dairyProducts.birimFiyat) {
                silinecekUrunler.add(dairyProducts);
            }
        }
        if (silinecekUrunler.isEmpty()) {
            System.out.println("\n\nGirdiginiz aralıkta sut urunu bulunamadi.");
        } else {
            dairyProductsList.removeAll(silinecekUrunler);
            System.out.println("\n\ngirdiginiz aralıktaki sut urunleri silindi.");
        }
    }
}