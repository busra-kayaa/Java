package Paket;

import java.util.ArrayList;

public class Cereals extends Urun{

	public static String KategoriAdi;
	public static String Detay;
	
	public Cereals(String adi, int kategoriIndex, String birimAgirligi, double birimFiyatı, int stokMiktari,
			String kategoriAdi, String detay) {
		super(adi, kategoriIndex, birimAgirligi, birimFiyatı, stokMiktari);
		KategoriAdi = kategoriAdi;
		Detay = detay;
	}

	public Cereals(String adi, String birimAgirligi, double birimFiyati, int stokMiktari) {

	}

	public Cereals(String adi, String birimAgirligi, double birimFiyati, int stokMiktari , String Detay) {

	}

	@SuppressWarnings("static-access")
	public static void ListeYazdir(ArrayList<Cereals> cerealsList) {
		for (int i=0; i<cerealsList.size();i++)
		{
			System.out.println("\t"+cerealsList.get(i).Adi+
							   "\t"+cerealsList.get(i).KategoriIndex+
							   "\t"+cerealsList.get(i).BirimAgirligi+
							   "\t"+cerealsList.get(i).BirimFiyatı+
							   "\t"+cerealsList.get(i).StokMiktari+
							   "\t"+cerealsList.get(i).KategoriAdi+
							   "\t"+cerealsList.get(i).Detay);
				}
		System.out.println("\n listede eleman sayisi:"+cerealsList.size());
		System.out.println("\n");
	}
	
	public static void TahilUrunEkle(ArrayList<Cereals> cerealList,String Adi ,double BirimFiyati,int StokMiktari) {
		ListeYazdir(cerealList);
		Cereals urun=new Cereals(Adi,"10", BirimFiyati, StokMiktari);
		cerealList.add(urun);
		ListeYazdir(cerealList);
	}
	
	public static void TahilUrunEkle(ArrayList<Cereals> cerealList,String Adi, String BirimAgirligi, double birimFiyati, String Detay) {
		ListeYazdir(cerealList);
		Cereals urun = new Cereals(Adi, BirimAgirligi, birimFiyati , 20, Detay);
		cerealList.add(urun);
		ListeYazdir(cerealList);
	}
}