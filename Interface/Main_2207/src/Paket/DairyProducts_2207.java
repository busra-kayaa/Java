package Paket;

import java.util.ArrayList;
import java.util.Iterator;

public class DairyProducts_2207 extends Urun_2207 implements IUrun_2207{
	
	public String kategoriAdi;
	public String detay;
	public int katSayi;
	
	 public DairyProducts_2207() {
	}
	 
	 public DairyProducts_2207 (String Adi,int KategoriIndex,String BirimAgirligi,double BirimFiyati,int StokMiktari,
			 String kategoriAdi,String detay,int katSayi)
	 {
		 super(Adi,KategoriIndex,BirimAgirligi,BirimFiyati,StokMiktari);
		 this.kategoriAdi=kategoriAdi;
		 this.detay=detay;
		 this.katSayi=katSayi;
	 }  

	public static void ListeyiYazdir(ArrayList<DairyProducts_2207> dairyProductsList) {
		for(int i=0;i<dairyProductsList.size();i++) {
			System.out.println("\t"+dairyProductsList.get(i).Adi+
							   "\t"+dairyProductsList.get(i).KategoriIndex+
							   "\t"+dairyProductsList.get(i).BirimAgirligi+
							   "\t"+dairyProductsList.get(i).BirimFiyati+
							   "\t"+dairyProductsList.get(i).StokMiktari+
							   "\t"+dairyProductsList.get(i).kategoriAdi+
							   "\t"+dairyProductsList.get(i).detay);
		}
		System.out.println("\n listede eleman sayisi:"+dairyProductsList.size());
		System.out.println("\n");			
	}

	@Override
	public void UrunStokGuncelle(ArrayList<Beverages_2207> beveragesList, ArrayList<Condiments_2207> condimentsList,
			ArrayList<Confections_2207> confectionsList, ArrayList<DairyProducts_2207> dairyProductsList,
			ArrayList<Cereals_2207> cerealsList, int kategori, int adet, boolean GirisMi, String islemYapilacakUrun) {
		
		int kontrol=0;
		DairyProducts_2207.ListeyiYazdir(dairyProductsList);
		for(int i=0;i<dairyProductsList.size();i++) {
			if (dairyProductsList.get(i).Adi.compareTo(islemYapilacakUrun)==0) {
				if (GirisMi= false) {
					if(dairyProductsList.get(i).StokMiktari-adet+dairyProductsList.get(i).katSayi>=0) {
						dairyProductsList.get(i).StokMiktari-=(adet+dairyProductsList.get(i).katSayi);
					}
				}
				else {
					dairyProductsList.get(i).StokMiktari+=adet+dairyProductsList.get(i).katSayi;
				}
				kontrol=1;
				break;
			}
		}
		if(kontrol==0) {
			System.out.println("Urun Bulunamadi!");
		}
		DairyProducts_2207.ListeyiYazdir(dairyProductsList);
	}

	@Override
	public void UrunIsımGuncelle(ArrayList<Beverages_2207> Beverageslist, ArrayList<Condiments_2207> Condimentslist,
			ArrayList<Confections_2207> Confectionslist, ArrayList<DairyProducts_2207> DairyProductslist,
			ArrayList<Cereals_2207> GrainsCerealslist, int kategori, String isim, String yeniIsim, String yeniDetay) {
		
		int kontrol=0;
		if(kategori==4)
		{
			for(int i=0;i<DairyProductslist.size();i++) {
				if(DairyProductslist.get(i).Adi.compareTo(isim)==0) {
					DairyProducts_2207.ListeyiYazdir(DairyProductslist);
					DairyProductslist.get(i).Adi=yeniIsim;
					DairyProductslist.get(i).detay=yeniDetay;
					DairyProducts_2207.ListeyiYazdir(DairyProductslist);
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
		DairyProducts_2207.ListeyiYazdir(DairyProductslist);
		if(kategori==4) {
			for(int i=0;i<DairyProductslist.size();i++) {
				if(DairyProductslist.get(i).Adi.compareTo(isim)==0) {
					DairyProductslist.remove(i);
					kontrol=1;
					break;
				}
			}
			if(kontrol==0) {
				System.out.println("Urun Bulunamadi");
			}
			DairyProducts_2207.ListeyiYazdir(DairyProductslist);
		}	
	}

	@Override
	public void YeniUrunEkle(ArrayList<Beverages_2207> Beverageslist, ArrayList<Condiments_2207> Condimentslist,
			ArrayList<Confections_2207> Confectionslist, ArrayList<DairyProducts_2207> DairyProductslist,
			ArrayList<Cereals_2207> GrainsCerealslist, int kategori, String Adi, String BirimAgirligi, double BirimFiyatı,
			int StokMiktari, String Detay) {
		
		Detay=DairyProductslist.get(0).detay;
		DairyProducts_2207.ListeyiYazdir(DairyProductslist);
		DairyProducts_2207 dairyProducts=new DairyProducts_2207(Adi, kategori, BirimAgirligi, BirimFiyatı, StokMiktari,
				"DairyProducts", Detay,kategori);
		DairyProductslist.add(dairyProducts);
		DairyProducts_2207.ListeyiYazdir(DairyProductslist);
	}

}
