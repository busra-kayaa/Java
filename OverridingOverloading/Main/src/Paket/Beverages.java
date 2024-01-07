package Paket;

import java.util.ArrayList;

public class Beverages extends Urun {

	public static String KategoriAdi;
	public static String Detay;
	
	public Beverages()
	{
		
	}
	
	public Beverages(String adi, int kategoriIndex, String birimAgirligi, double birimFiyatı, int stokMiktari,
			String kategoriAdi, String detay) {
		super(adi, kategoriIndex, birimAgirligi, birimFiyatı, stokMiktari);
		KategoriAdi = kategoriAdi;
		Detay = detay;
	}
	@SuppressWarnings("static-access")
	public static void ListeYazdir(ArrayList<Beverages> beveragesList) {
		System.out.println();
		for (int i=0; i<beveragesList.size();i++)
		{
			System.out.println("\t"+beveragesList.get(i).Adi+
							   "\t"+beveragesList.get(i).KategoriIndex+
							   "\t"+beveragesList.get(i).BirimAgirligi+
							   "\t"+beveragesList.get(i).BirimFiyatı+
							   "\t"+beveragesList.get(i).StokMiktari+
							   "\t"+beveragesList.get(i).KategoriAdi+
							   "\t"+beveragesList.get(i).Detay);
				}
		System.out.println("\n listede eleman sayisi:"+beveragesList.size());
		System.out.println("\n");
		}
	@Override
	public void UrunFiyatGuncelle(ArrayList<Beverages> beveragesList,
    		ArrayList<Condiments> condimentsList,ArrayList<Confections> confectionsList,
    		ArrayList<DairyProducts> dairyProductsList,ArrayList<Cereals> cerealsList,
			int oran) {
			ListeYazdir(beveragesList);
		
		for(int i=0; i<beveragesList.size();i++) {
			if(beveragesList.get(i).StokMiktari< 20) {
				oran=oran/2;
				beveragesList.get(i).BirimFiyatı+= beveragesList.get(i).BirimFiyatı * oran/100;
			}
			
			else if(50> beveragesList.get(i).StokMiktari && beveragesList.get(i).StokMiktari  >20) {
				beveragesList.get(i).BirimFiyatı+= beveragesList.get(i).BirimFiyatı * oran/100;
			}
			
			else if(beveragesList.get(i).StokMiktari > 50) {
				oran = (int) (Math.pow(oran,2));
				beveragesList.get(i).BirimFiyatı+= beveragesList.get(i).BirimFiyatı * oran/100;
			}
		}
		ListeYazdir(beveragesList);
		
	}
}