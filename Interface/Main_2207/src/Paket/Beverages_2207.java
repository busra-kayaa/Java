package Paket;

import java.security.PublicKey;
import java.util.ArrayList;

public class Beverages_2207 extends Urun_2207 implements IUrun_2207{
	
	public String kategoriAdi;
	public String detay;
	public int katSayi;
	
	public Beverages_2207() {
		
	}
	 public Beverages_2207(String Adi,int KategoriIndex,String BirimAgirligi,double BirimFiyati,int StokMiktari,
			 String kategoriAdi,String detay,int katSayi)
	 {
		 super(Adi,KategoriIndex,BirimAgirligi,BirimFiyati,StokMiktari);
		 this.kategoriAdi=kategoriAdi;
		 this.detay=detay;
		 this.katSayi=katSayi;
	 }  


	public static void ListeyiYazdir(ArrayList<Beverages_2207> beveragesList) {
		for(int i=0;i<beveragesList.size();i++) {
			System.out.println("\t"+beveragesList.get(i).Adi+
							   "\t"+beveragesList.get(i).KategoriIndex+
							   "\t"+beveragesList.get(i).BirimAgirligi+
							   "\t"+beveragesList.get(i).BirimFiyati+
							   "\t"+beveragesList.get(i).StokMiktari+
							   "\t"+beveragesList.get(i).kategoriAdi+
							   "\t"+beveragesList.get(i).detay);
		}
		System.out.println("\n listede eleman sayisi:"+beveragesList.size());
		System.out.println("\n");
	}

	@Override
	public void UrunStokGuncelle(ArrayList<Beverages_2207> beveragesList, ArrayList<Condiments_2207> condimentsList,
			ArrayList<Confections_2207> confectionsList, ArrayList<DairyProducts_2207> dairyProductsList,
			ArrayList<Cereals_2207> cerealsList, int kategori, int adet, boolean GirisMi, String islemYapilacakUrun) {
	
		int kontrol=0;
		Beverages_2207.ListeyiYazdir(beveragesList);
		for(int i=0;i<beveragesList.size();i++) {
			if (beveragesList.get(i).Adi.compareTo(islemYapilacakUrun)==0) {
				if (GirisMi= false) {
					if(beveragesList.get(i).StokMiktari-adet+beveragesList.get(i).katSayi>=0) {
						beveragesList.get(i).StokMiktari-=(adet+beveragesList.get(i).katSayi);
					}
				}
				else {
					beveragesList.get(i).StokMiktari+=adet+beveragesList.get(i).katSayi;
				}
				kontrol=1;
				break;
			}
		}
		if(kontrol==0) {
			System.out.println("Urun Bulunamadi!");
		}
		Beverages_2207.ListeyiYazdir(beveragesList);		
	}

	@Override
	public void UrunIsımGuncelle(ArrayList<Beverages_2207> Beverageslist, ArrayList<Condiments_2207> Condimentslist,
			ArrayList<Confections_2207> Confectionslist, ArrayList<DairyProducts_2207> DairyProductslist,
			ArrayList<Cereals_2207> GrainsCerealslist, int kategori, String isim, String yeniIsim, String yeniDetay) {
		
		int kontrol=0;
		if(kategori==1)
		{
			for(int i=0;i<Beverageslist.size();i++) {
				if(Beverageslist.get(i).Adi.compareTo(isim)==0) {
					Beverages_2207.ListeyiYazdir(Beverageslist);
					Beverageslist.get(i).Adi=yeniIsim;
					Beverageslist.get(i).detay=yeniDetay;
					Beverages_2207.ListeyiYazdir(Beverageslist);
					kontrol=1;
					break;
				}
			}
			if(kontrol==0)
				System.out.println("Urun bulunamadi");
		}		
	}

	@Override
	public void UrunSil(ArrayList<Beverages_2207> Beverageslist, ArrayList<Condiments_2207> Condimentslist,
			ArrayList<Confections_2207> Confectionslist, ArrayList<DairyProducts_2207> DairyProductslist,
			ArrayList<Cereals_2207> GrainsCerealslist, int kategori, String isim) {
		int kontrol =0;
		Beverages_2207.ListeyiYazdir(Beverageslist);
		if(kategori==1) {
			for(int i=0;i<Beverageslist.size();i++) {
				if(Beverageslist.get(i).Adi.compareTo(isim)==0) {
					Beverageslist.remove(i);
					kontrol=1;
					break;
				}
			}
			if(kontrol==0) {
				System.out.println("Urun Bulunamadi");
			}
			Beverages_2207.ListeyiYazdir(Beverageslist);
		}	
	}
	
	@Override
	public void YeniUrunEkle(ArrayList<Beverages_2207> Beverageslist, ArrayList<Condiments_2207> Condimentslist,
			ArrayList<Confections_2207> Confectionslist, ArrayList<DairyProducts_2207> DairyProductslist,
			ArrayList<Cereals_2207> GrainsCerealslist, int kategori, String Adi, String BirimAgirligi, double BirimFiyatı,
			int StokMiktari, String Detay) {
		
		Detay=Beverageslist.get(0).detay;
		Beverages_2207.ListeyiYazdir(Beverageslist);
		Beverages_2207 beverages = new Beverages_2207(Adi, kategori, BirimAgirligi, BirimFiyatı, StokMiktari,
				"Beverages", Detay,kategori);
		Beverageslist.add(beverages);
		Beverages_2207.ListeyiYazdir(Beverageslist);		
	}

}
