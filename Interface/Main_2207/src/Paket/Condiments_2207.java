package Paket;

import java.util.ArrayList;

public class Condiments_2207 extends Urun_2207 implements IUrun_2207{
	
	public String kategoriAdi;
	public String detay;
	public int katSayi;
	
	 public Condiments_2207() {
	}
	 
	 public Condiments_2207 (String Adi,int KategoriIndex,String BirimAgirligi,double BirimFiyati,int StokMiktari,
			 String kategoriAdi,String detay,int katSayi)
	 {
		 super(Adi,KategoriIndex,BirimAgirligi,BirimFiyati,StokMiktari);
		 this.kategoriAdi=kategoriAdi;
		 this.detay=detay;
		 this.katSayi=katSayi;
	 }  

	
	public static void ListeYazdir(ArrayList<Condiments_2207> condimentsList) {
		for(int i=0;i<condimentsList.size();i++) {
			System.out.println("\t"+condimentsList.get(i).Adi+
							   "\t"+condimentsList.get(i).KategoriIndex+
							   "\t"+condimentsList.get(i).BirimAgirligi+
							   "\t"+condimentsList.get(i).BirimFiyati+
							   "\t"+condimentsList.get(i).StokMiktari+
							   "\t"+condimentsList.get(i).kategoriAdi+
							   "\t"+condimentsList.get(i).detay);
		}
		System.out.println("\n listede eleman sayisi:"+condimentsList.size());
		System.out.println("\n");		
	}

	@Override
	public void UrunStokGuncelle(ArrayList<Beverages_2207> beveragesList, ArrayList<Condiments_2207> condimentsList,
			ArrayList<Confections_2207> confectionsList, ArrayList<DairyProducts_2207> dairyProductsList,
			ArrayList<Cereals_2207> cerealsList, int kategori, int adet, boolean GirisMi, String islemYapilacakUrun) {
		
		int kontrol=0;
		Condiments_2207.ListeYazdir(condimentsList);
		for(int i=0;i<condimentsList.size();i++) {
			if (condimentsList.get(i).Adi.compareTo(islemYapilacakUrun)==0) {
				if (GirisMi= false) {
					if(condimentsList.get(i).StokMiktari-adet+condimentsList.get(i).katSayi>=0) {
						condimentsList.get(i).StokMiktari-=(adet+condimentsList.get(i).katSayi);
					}
				}
				else {
					condimentsList.get(i).StokMiktari+=adet+condimentsList.get(i).katSayi;
				}
				kontrol=1;
				break;
			}
		}
		if(kontrol==0) {
			System.out.println("Urun Bulunamadi!");
		}
		Condiments_2207.ListeYazdir(condimentsList);			
	}

	@Override
	public void UrunIsımGuncelle(ArrayList<Beverages_2207> Beverageslist, ArrayList<Condiments_2207> Condimentslist,
			ArrayList<Confections_2207> Confectionslist, ArrayList<DairyProducts_2207> DairyProductslist,
			ArrayList<Cereals_2207> GrainsCerealslist, int kategori, String isim, String yeniIsim, String yeniDetay) {
		int kontrol=0;
		if(kategori==2)
		{
			for(int i=0;i<Condimentslist.size();i++) {
				if(Condimentslist.get(i).Adi.compareTo(isim)==0) {
					Condiments_2207.ListeYazdir(Condimentslist);
					Condimentslist.get(i).Adi=yeniIsim;
					Condimentslist.get(i).detay=yeniDetay;
					Condiments_2207.ListeYazdir(Condimentslist);
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
		Condiments_2207.ListeYazdir(Condimentslist);
		if(kategori==2) {
			for(int i=0;i<Condimentslist.size();i++) {
				if(Condimentslist.get(i).Adi.compareTo(isim)==0) {
					Condimentslist.remove(i);
					kontrol=1;
					break;
				}
			}
			if(kontrol==0) {
				System.out.println("Urun Bulunamadi");
			}
			Condiments_2207.ListeYazdir(Condimentslist);
		}	
	}

	@Override
	public void YeniUrunEkle(ArrayList<Beverages_2207> Beverageslist, ArrayList<Condiments_2207> Condimentslist,
			ArrayList<Confections_2207> Confectionslist, ArrayList<DairyProducts_2207> DairyProductslist,
			ArrayList<Cereals_2207> GrainsCerealslist, int kategori, String Adi, String BirimAgirligi, double BirimFiyatı,
			int StokMiktari, String Detay) {
		
		Detay=Condimentslist.get(0).detay;
		Condiments_2207.ListeYazdir(Condimentslist);
		Condiments_2207 condiments=new Condiments_2207(Adi, kategori, BirimAgirligi, BirimFiyatı, StokMiktari,
				"Condiments", Detay,kategori);
		Condimentslist.add(condiments);
		Condiments_2207.ListeYazdir(Condimentslist);
	}

}
