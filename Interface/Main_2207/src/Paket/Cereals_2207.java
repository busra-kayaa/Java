package Paket;

import java.util.ArrayList;

public class Cereals_2207 extends Urun_2207 implements IUrun_2207{
	
	public String kategoriAdi;
	public String detay;
	public int katSayi;

	 public Cereals_2207() {
	} 
	 
	 public Cereals_2207 (String Adi,int KategoriIndex,String BirimAgirligi,double BirimFiyati,int StokMiktari,
			 String kategoriAdi,String detay,int katSayi)
	 {
		 super(Adi,KategoriIndex,BirimAgirligi,BirimFiyati,StokMiktari);
		 this.kategoriAdi=kategoriAdi;
		 this.detay=detay;
		 this.katSayi=katSayi;
	 }  


	public static void ListeyiYazdir(ArrayList<Cereals_2207> cerealsList) {
		for(int i=0;i<cerealsList.size();i++) {
			System.out.println("\t"+cerealsList.get(i).Adi+
							   "\t"+cerealsList.get(i).KategoriIndex+
							   "\t"+cerealsList.get(i).BirimAgirligi+
							   "\t"+cerealsList.get(i).BirimFiyati+
							   "\t"+cerealsList.get(i).StokMiktari+
							   "\t"+cerealsList.get(i).kategoriAdi+
							   "\t"+cerealsList.get(i).detay);
		}
		System.out.println("\n listede eleman sayisi:"+cerealsList.size());
		System.out.println("\n");
	}

	@Override
	public void UrunStokGuncelle(ArrayList<Beverages_2207> beveragesList, ArrayList<Condiments_2207> condimentsList,
			ArrayList<Confections_2207> confectionsList, ArrayList<DairyProducts_2207> dairyProductsList,
			ArrayList<Cereals_2207> cerealsList, int kategori, int adet, boolean GirisMi, String islemYapilacakUrun) {
		
		int kontrol=0;
		Cereals_2207.ListeyiYazdir(cerealsList);
		for(int i=0;i<cerealsList.size();i++) {
			if (cerealsList.get(i).Adi.compareTo(islemYapilacakUrun)==0) {
				if (GirisMi= false) {
					if(cerealsList.get(i).StokMiktari-adet+cerealsList.get(i).katSayi>=0) {
						cerealsList.get(i).StokMiktari-=(adet+cerealsList.get(i).katSayi);
					}
				}
				else {
					cerealsList.get(i).StokMiktari+=adet+cerealsList.get(i).katSayi;
				}
				kontrol=1;
				break;
			}
		}
		if(kontrol==0) {
			System.out.println("Urun Bulunamadi!");
		}
		Cereals_2207.ListeyiYazdir(cerealsList);		
	}

	@Override
	public void UrunIsımGuncelle(ArrayList<Beverages_2207> Beverageslist, ArrayList<Condiments_2207> Condimentslist,
			ArrayList<Confections_2207> Confectionslist, ArrayList<DairyProducts_2207> DairyProductslist,
			ArrayList<Cereals_2207> GrainsCerealslist, int kategori, String isim, String yeniIsim, String yeniDetay) {

		int kontrol =0;
		if(kategori ==5) {
			for(int i=0;i<GrainsCerealslist.size();i++) {
				if(GrainsCerealslist.get(i).Adi.compareTo(isim)==0) {
					Cereals_2207.ListeyiYazdir(GrainsCerealslist);
					GrainsCerealslist.get(i).Adi=yeniIsim;
					GrainsCerealslist.get(i).detay=yeniDetay;
					Cereals_2207.ListeyiYazdir(GrainsCerealslist);
					kontrol=1;
					break;
				}
			}
			if(kontrol==0) {
				System.out.println("Urun bulunamadi");
			}
		}
	}

	@Override
	public void UrunSil(ArrayList<Beverages_2207> Beverageslist, ArrayList<Condiments_2207> Condimentslist,
			ArrayList<Confections_2207> Confectionslist, ArrayList<DairyProducts_2207> DairyProductslist,
			ArrayList<Cereals_2207> GrainsCerealslist, int kategori, String isim) {
		int kontrol =0;
		Cereals_2207.ListeyiYazdir(GrainsCerealslist);
		if(kategori==5) {
			for(int i=0;i<GrainsCerealslist.size();i++) {
				if(GrainsCerealslist.get(i).Adi.compareTo(isim)==0) {
					GrainsCerealslist.remove(i);
					kontrol=1;
					break;
				}
			}
			if(kontrol==0) {
				System.out.println("Urun Bulunamadi");
			}
			Cereals_2207.ListeyiYazdir(GrainsCerealslist);
		}	
	}

	@Override
	public void YeniUrunEkle(ArrayList<Beverages_2207> Beverageslist, ArrayList<Condiments_2207> Condimentslist,
			ArrayList<Confections_2207> Confectionslist, ArrayList<DairyProducts_2207> DairyProductslist,
			ArrayList<Cereals_2207> GrainsCerealslist, int kategori, String Adi, String BirimAgirligi, double BirimFiyatı,
			int StokMiktari, String Detay) {
		
		Detay=GrainsCerealslist.get(0).detay;
		Cereals_2207.ListeyiYazdir(GrainsCerealslist);
		Cereals_2207 cereals = new Cereals_2207(Adi, kategori, BirimAgirligi, BirimFiyatı, StokMiktari,
				"Cereals", Detay,kategori);
		GrainsCerealslist.add(cereals);
		Cereals_2207.ListeyiYazdir(GrainsCerealslist);		
	}

}
