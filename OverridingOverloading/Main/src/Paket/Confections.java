package Paket;

import java.util.ArrayList;

public class Confections extends Urun {

	public static String KategoriAdi;
	public static String Detay;

	public Confections(String adi, int kategoriIndex, String birimAgirligi, double birimFiyatı, int stokMiktari,
			String kategoriAdi, String detay) {
		super(adi, kategoriIndex, birimAgirligi, birimFiyatı, stokMiktari);
		KategoriAdi = kategoriAdi;
		Detay = detay;
	}

	public Confections() {
	}

	@SuppressWarnings("static-access")
	public static void ListeYazdir(ArrayList<Confections> confectionsList) {

			for (int i=0; i<confectionsList.size();i++)
			{
				System.out.println("\t"+confectionsList.get(i).Adi+
								   "\t"+confectionsList.get(i).KategoriIndex+
								   "\t"+confectionsList.get(i).BirimAgirligi+
								   "\t"+confectionsList.get(i).BirimFiyatı+
								   "\t"+confectionsList.get(i).StokMiktari+
								   "\t"+confectionsList.get(i).KategoriAdi+
								   "\t"+confectionsList.get(i).Detay);
					}
			System.out.println("\n listede eleman sayisi:"+confectionsList.size());
			System.out.println("\n");
		}
		
	@Override
	public void UrunStokGuncelle(ArrayList<Beverages> beveragesList, ArrayList<Condiments> condimentsList,ArrayList<Confections> confectionsList,
			 ArrayList<DairyProducts> dairyProductsList, ArrayList<Cereals> cerealsList, int stokMiktarı, boolean girisMi) {
    	ListeYazdir(confectionsList);       
    	for (int i = 0; i < confectionsList.size(); i++) {
			if (girisMi== false) {
				if(stokMiktarı>10) {
					 if(confectionsList.get(i).StokMiktari-stokMiktarı>=0)           		
	               		 confectionsList.get(i).StokMiktari-=stokMiktarı; 
				}
			}
			else {
				if(stokMiktarı<20) {
					confectionsList.get(i).StokMiktari+=stokMiktarı;
				}
			}
		}
    	ListeYazdir(confectionsList);       
		
	}
}