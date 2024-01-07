package Paket;

import java.util.ArrayList;

public class DairyProducts extends Urun{

	public static String KategoriAdi;
	public static String Detay;
	
	public DairyProducts(String adi, int kategoriIndex, String birimAgirligi, double birimFiyatı, int stokMiktari,
			String kategoriAdi, String detay) {
		super(adi, kategoriIndex, birimAgirligi, birimFiyatı, stokMiktari);
		KategoriAdi = kategoriAdi;
		Detay = detay;
	}

	@SuppressWarnings("static-access")
	public static void ListeYazdir(ArrayList<DairyProducts> dairyProductsList) {
		for (int i=0; i<dairyProductsList.size();i++)
		{
			System.out.println("\t"+dairyProductsList.get(i).Adi+
							   "\t"+dairyProductsList.get(i).KategoriIndex+
							   "\t"+dairyProductsList.get(i).BirimAgirligi+
							   "\t"+dairyProductsList.get(i).BirimFiyatı+
							   "\t"+dairyProductsList.get(i).StokMiktari+
							   "\t"+dairyProductsList.get(i).KategoriAdi+
							   "\t"+dairyProductsList.get(i).Detay);
				}
		System.out.println("\n listede eleman sayisi:"+dairyProductsList.size());
		System.out.println("\n");
	}
	
	public static void SutUrunuSil(ArrayList<DairyProducts> dairyProductsList,int minStok, int MaxStok, double fiyat) {
		int i;
		for(i=0;i<dairyProductsList.size();i++)
		{
			if(dairyProductsList.get(i).StokMiktari>minStok && dairyProductsList.get(i).StokMiktari<MaxStok)
			{
				if(dairyProductsList.get(i).BirimFiyatı <fiyat) {
					dairyProductsList.remove(i);
					i--;
				}
			
			}
		}
	}
	
	public static void SutUrunuSil(ArrayList<DairyProducts> dairyProductsList,double fiyat) {
		ListeYazdir(dairyProductsList);
		int i;
		for(i=0;i<dairyProductsList.size();i++)
		{
			if(fiyat< dairyProductsList.get(i).BirimFiyatı  )
			{
				dairyProductsList.remove(i);
				i--;
			}
		}
		ListeYazdir(dairyProductsList);
	}

	public static void SutUrunuSil(ArrayList<DairyProducts> dairyProductsList) {
		int enkucuk_stok = Integer.MAX_VALUE;
		int enkucuk_index = 0;
		for (int i = 1; i < dairyProductsList.size(); i++) {
				if (dairyProductsList.get(i).StokMiktari< enkucuk_stok) {
					enkucuk_stok = dairyProductsList.get(i).StokMiktari;
					enkucuk_index = i;
			}
		}
		dairyProductsList.remove(enkucuk_index);
		ListeYazdir(dairyProductsList);

	}
}