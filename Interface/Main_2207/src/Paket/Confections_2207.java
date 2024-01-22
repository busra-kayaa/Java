package Paket;

import java.util.ArrayList;

public class Confections_2207 extends Urun_2207 implements IUrun_2207{
	
	public String kategoriAdi;
	public String detay;
	public int katSayi;
	 public Confections_2207() {
	}
	 
	 public Confections_2207 (String Adi,int KategoriIndex,String BirimAgirligi,double BirimFiyati,int StokMiktari,
			 String kategoriAdi,String detay,int katSayi)
	 {
		 super(Adi,KategoriIndex,BirimAgirligi,BirimFiyati,StokMiktari);
		 this.kategoriAdi=kategoriAdi;
		 this.detay=detay;
		 this.katSayi=katSayi;
	 }  

	public static void ListeyiYazdir(ArrayList<Confections_2207> confectionsList) {
		for(int i=0;i<confectionsList.size();i++) {
			System.out.println("\t"+confectionsList.get(i).Adi+
							   "\t"+confectionsList.get(i).KategoriIndex+
							   "\t"+confectionsList.get(i).BirimAgirligi+
							   "\t"+confectionsList.get(i).BirimFiyati+
							   "\t"+confectionsList.get(i).StokMiktari+
							   "\t"+confectionsList.get(i).kategoriAdi+
							   "\t"+confectionsList.get(i).detay);
		}
		System.out.println("\n listede eleman sayisi:"+confectionsList.size());
		System.out.println("\n");		
	}

	@Override
	public void UrunStokGuncelle(ArrayList<Beverages_2207> beveragesList, ArrayList<Condiments_2207> condimentsList,
			ArrayList<Confections_2207> confectionsList, ArrayList<DairyProducts_2207> dairyProductsList,
			ArrayList<Cereals_2207> cerealsList, int kategori, int adet, boolean GirisMi, String islemYapilacakUrun) {
		
		int kontrol=0;
		Confections_2207.ListeyiYazdir(confectionsList);
		for(int i=0;i<confectionsList.size();i++) {
			if (confectionsList.get(i).Adi.compareTo(islemYapilacakUrun)==0) {
				if (GirisMi= false) {
					if(confectionsList.get(i).StokMiktari-adet+confectionsList.get(i).katSayi>=0) {
						confectionsList.get(i).StokMiktari-=(adet+confectionsList.get(i).katSayi);
					}
				}
				else {
					confectionsList.get(i).StokMiktari+=adet+confectionsList.get(i).katSayi;
				}
				kontrol=1;
				break;
			}
		}
		if(kontrol==0) {
			System.out.println("Urun Bulunamadi!");
		}
		Confections_2207.ListeyiYazdir(confectionsList);	
	}

	@Override
	public void UrunIsımGuncelle(ArrayList<Beverages_2207> Beverageslist, ArrayList<Condiments_2207> Condimentslist,
			ArrayList<Confections_2207> Confectionslist, ArrayList<DairyProducts_2207> DairyProductslist,
			ArrayList<Cereals_2207> GrainsCerealslist, int kategori, String isim, String yeniIsim, String yeniDetay) {
		int kontrol=0;
		if(kategori==3)
		{
			for(int i=0;i<Confectionslist.size();i++) {
				if(Confectionslist.get(i).Adi.compareTo(isim)==0) {
					Confections_2207.ListeyiYazdir(Confectionslist);
					Confectionslist.get(i).Adi=yeniIsim;
					Confectionslist.get(i).detay=yeniDetay;
					Confections_2207.ListeyiYazdir(Confectionslist);
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
		Confections_2207.ListeyiYazdir(Confectionslist);
		if(kategori==3) {
			for(int i=0;i<Confectionslist.size();i++) {
				if(Confectionslist.get(i).Adi.compareTo(isim)==0) {
					Confectionslist.remove(i);
					kontrol=1;
					break;
				}
			}
			if(kontrol==0) {
				System.out.println("Urun Bulunamadi");
			}
			Confections_2207.ListeyiYazdir(Confectionslist);
		}	
	}

	@Override
	public void YeniUrunEkle(ArrayList<Beverages_2207> Beverageslist, ArrayList<Condiments_2207> Condimentslist,
			ArrayList<Confections_2207> Confectionslist, ArrayList<DairyProducts_2207> DairyProductslist,
			ArrayList<Cereals_2207> GrainsCerealslist, int kategori, String Adi, String BirimAgirligi, double BirimFiyatı,
			int StokMiktari, String Detay) {

		Detay=Confectionslist.get(0).detay;
		Confections_2207.ListeyiYazdir(Confectionslist);
		Confections_2207 confections=new Confections_2207(Adi, kategori, BirimAgirligi, BirimFiyatı, StokMiktari,
				"Confections", Detay,kategori);
		Confectionslist.add(confections);
		Confections_2207.ListeyiYazdir(Confectionslist);
	}

}
