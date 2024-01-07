package Paket;

import java.util.ArrayList;
import java.util.Collections;

public class Condiments extends Urun {

	public static String KategoriAdi;
	public static String Detay;

	public Condiments(String adi, int kategoriIndex, String birimAgirligi, double birimFiyatı, int stokMiktari,
			String kategoriAdi, String detay) {
		super(adi, kategoriIndex, birimAgirligi, birimFiyatı, stokMiktari);
		KategoriAdi = kategoriAdi;
		Detay = detay;
	}

	@SuppressWarnings("static-access")
	public static void ListeYazdir(ArrayList<Condiments> condimentsList) {
		for (int i=0; i<condimentsList.size();i++)
		{
			System.out.println("\t"+condimentsList.get(i).Adi+
							   "\t"+condimentsList.get(i).KategoriIndex+
							   "\t"+condimentsList.get(i).BirimAgirligi+
							   "\t"+condimentsList.get(i).BirimFiyatı+
							   "\t"+condimentsList.get(i).StokMiktari+
							   "\t"+condimentsList.get(i).KategoriAdi+
							   "\t"+condimentsList.get(i).Detay);
				}
		System.out.println("\n listede eleman sayisi:"+condimentsList.size());
		System.out.println("\n");
	}
	
	public static void CesniBirimAgirlikGuncelle(ArrayList<Condiments> condimentsList , String yeniAgirlik) {
		ListeYazdir(condimentsList);
		int enbuyuk_stok = Integer.MIN_VALUE;
		int enbuyuk_index = 0;
		for (int i = 1; i < condimentsList.size(); i++) {
				if (condimentsList.get(i).StokMiktari > enbuyuk_stok) {
					enbuyuk_stok = condimentsList.get(i).StokMiktari;
					enbuyuk_index = i;
				}
		}
		condimentsList.get(enbuyuk_index).BirimAgirligi= yeniAgirlik;
	}
	
	
	public static void CesniBirimAgirlikGuncelle(ArrayList<Condiments> condimentsList, String yeniAgirlik, int stokMiktarı) {
		ListeYazdir(condimentsList);
		// Stok miktarına göre sırala
        Collections.sort(condimentsList, (c1, c2) -> Integer.compare(c1.getStokMiktari(), c2.getStokMiktari()));
        // En yakın stok miktarına sahip nesneyi bul
        Condiments enYakinCesni = null;
        int enKucukFark = Integer.MAX_VALUE;

        for (Condiments cesni : condimentsList) {
            int fark = Math.abs(cesni.getStokMiktari() - stokMiktarı);
            if (fark < enKucukFark) {
                enKucukFark = fark;
                enYakinCesni = cesni;
            }
        }

        if (enYakinCesni != null) {
            enYakinCesni.setBirimAgirlik(yeniAgirlik);
            System.out.println("Güncellenen Cesni: " + enYakinCesni);
        } else {
            System.out.println("Cesni bulunamadı.");
        }
	}

	private void setBirimAgirlik(String yeniAgirlik) {
			this.BirimAgirligi= yeniAgirlik;
	}

	private int getStokMiktari() {
		return StokMiktari;
	}
}