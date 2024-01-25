package paket;

import java.util.ArrayList;

public class Urun {
	
	public String Adi;
	public int KategoriIndex;
	public String BirimAgirligi;
	public double BirimFiyati;
	public int StokMiktari;
	
	public Urun() {
		
	}
	
	public Urun(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari) {
		super();
		Adi = adi;
		KategoriIndex = kategoriIndex;
		BirimAgirligi = birimAgirligi;
		BirimFiyati = birimFiyati;
		StokMiktari = stokMiktari;
	}
	
	public static void UrunStokGuncelle(ArrayList<Beverages> beveragesList, ArrayList<Condiments> condimentsList,
			ArrayList<Confections> confectionsList, ArrayList<DairyProducts> dairyProductsList,
			ArrayList<Cereals> cerealsList, String urunAdi, boolean ekleMi) {
		int sonuc=0;
		if(sonuc==0) {
				Urun.Beverages.ListeyiYazdir(beveragesList);
				for(int i=0;i<beveragesList.size();i++) {
					if(beveragesList.get(i).Adi.compareTo(urunAdi)==0) {

						if(ekleMi==true) {
							beveragesList.get(i).StokMiktari+=beveragesList.get(i).StokMiktari*50/100;
							sonuc=1;
		     				break;
						}
						else {
							beveragesList.get(i).StokMiktari-=beveragesList.get(i).StokMiktari*50/100;
							sonuc=1;
		     				break;
						}
					}
				}
					Urun.Beverages.ListeyiYazdir(beveragesList);
		}
		
		if(sonuc==0) {
				Urun.Condiments.ListeyiYazdir(condimentsList);
				for(int i=0;i<condimentsList.size();i++) {
					if(condimentsList.get(i).Adi.compareTo(urunAdi)==0) {

						if(ekleMi==true) {
							condimentsList.get(i).StokMiktari+=condimentsList.get(i).StokMiktari*50/100;
							sonuc=1;
		     				break;
						}
						else {
							condimentsList.get(i).StokMiktari-=condimentsList.get(i).StokMiktari*50/100;
							sonuc=1;
		     				break;
						}
					}
				}
				
			Urun.Condiments.ListeyiYazdir(condimentsList);
		}
		
		if(sonuc==0) {
			
				Urun.Confections.ListeyiYazdir(confectionsList);
				for(int i=0;i<confectionsList.size();i++) {
					if(confectionsList.get(i).Adi.compareTo(urunAdi)==0) {
						if(ekleMi==true) {
							confectionsList.get(i).StokMiktari+=confectionsList.get(i).StokMiktari*50/100;
							sonuc=1;
		     				break;
						}
						else {
							confectionsList.get(i).StokMiktari-=confectionsList.get(i).StokMiktari*50/100;
							sonuc=1;
		     				break;
						}
					}
				}
				Urun.Confections.ListeyiYazdir(confectionsList);
			}
		
		if(sonuc==0) {
				Urun.DairyProducts.ListeyiYazdir(dairyProductsList);
				for(int i=0;i<dairyProductsList.size();i++) {
					if(dairyProductsList.get(i).Adi.compareTo(urunAdi)==0) {
					
						if(ekleMi==true) {
							dairyProductsList.get(i).StokMiktari+=dairyProductsList.get(i).StokMiktari*50/100;
							sonuc=1;
		     				break;
						}
						else {
							dairyProductsList.get(i).StokMiktari-=dairyProductsList.get(i).StokMiktari*50/100;
							sonuc=1;
		     				break;
						}
					}
				}
			Urun.DairyProducts.ListeyiYazdir(dairyProductsList);
		}
		
		if(sonuc==0) {
				Urun.Cereals.ListeyiYazdir(cerealsList);
				for(int i=0;i<cerealsList.size();i++) {
					if(cerealsList.get(i).Adi.compareTo(urunAdi)==0) {
						if(ekleMi==true) {
							cerealsList.get(i).StokMiktari+=cerealsList.get(i).StokMiktari*50/100;
							sonuc=1;
		     				break;
						}
						else {
							cerealsList.get(i).StokMiktari-=cerealsList.get(i).StokMiktari*50/100;
							sonuc=1;
		     				break;
						}
					}
				}
			Urun.Cereals.ListeyiYazdir(cerealsList);
		}
		
		if(sonuc==0)
     	{
     		System.out.println("Girdiginiz isimde urun bulunmamaktadir");
     	}
		
	}
	
	public static void UrunKategorikIndirimYap(ArrayList<Beverages> beveragesList, ArrayList<Condiments> condimentsList,
			ArrayList<Confections> confectionsList, ArrayList<DairyProducts> dairyProductsList,
			ArrayList<Cereals> cerealsList, String kategoriAdi, int x) {
		
		if(beveragesList.get(0).KategoriAdi.compareTo(kategoriAdi)==0) {
			
			Urun.Beverages.ListeyiYazdir(beveragesList);

			double toplamBirimFiyati=0,ortalamaBirimFiyati=0;
			int toplamNesneSayisi=beveragesList.size();

			for (Beverages beverages : beveragesList) {
				toplamBirimFiyati=toplamBirimFiyati+beverages.BirimFiyati;
			}
			ortalamaBirimFiyati=toplamBirimFiyati/toplamNesneSayisi;
			System.out.println("Beverages listesi ortalama birim fiyati: "+ortalamaBirimFiyati);
			
			for(int i=0;i<beveragesList.size();i++) {
				if(beveragesList.get(i).BirimFiyati > ortalamaBirimFiyati) {
					beveragesList.get(i).BirimFiyati-=beveragesList.get(i).BirimFiyati*x/100;
				}
			}
			System.out.println("Guncellenmis Liste");
			Urun.Beverages.ListeyiYazdir(beveragesList);
		}
		
		else if(condimentsList.get(0).KategoriAdi.compareTo(kategoriAdi)==0) {
			
			Urun.Condiments.ListeyiYazdir(condimentsList);
			
			double toplamBirimFiyati=0,ortalamaBirimFiyati=0;
			int toplamNesneSayisi=condimentsList.size();

			for (Condiments condiments : condimentsList) {
				toplamBirimFiyati=toplamBirimFiyati+condiments.BirimFiyati;
			}
			ortalamaBirimFiyati=toplamBirimFiyati/toplamNesneSayisi;
			System.out.println("Condiments listesi ortalama birim fiyati: "+ortalamaBirimFiyati);
			
			for(int i=0;i<condimentsList.size();i++) {
				if(condimentsList.get(i).BirimFiyati > ortalamaBirimFiyati) {
					condimentsList.get(i).BirimFiyati-=condimentsList.get(i).BirimFiyati*x/100;
				}
			}
			System.out.println("Guncellenmis Liste");
			Urun.Condiments.ListeyiYazdir(condimentsList);
		}
		
		else if(confectionsList.get(0).KategoriAdi.compareTo(kategoriAdi)==0) {
			
			Urun.Confections.ListeyiYazdir(confectionsList);
			
			double toplamBirimFiyati=0,ortalamaBirimFiyati=0;
			int toplamNesneSayisi=confectionsList.size();

			for (Confections confections : confectionsList) {
				toplamBirimFiyati=toplamBirimFiyati+confections.BirimFiyati;
			}
			ortalamaBirimFiyati=toplamBirimFiyati/toplamNesneSayisi;
			System.out.println("Confections listesi ortalama birim fiyati: "+ortalamaBirimFiyati);
			
			for(int i=0;i<confectionsList.size();i++) {
				if(confectionsList.get(i).BirimFiyati > ortalamaBirimFiyati) {
					confectionsList.get(i).BirimFiyati-=confectionsList.get(i).BirimFiyati*x/100;
				}
			}
			System.out.println("Guncellenmis Liste");
			Urun.Confections.ListeyiYazdir(confectionsList);

		}
		
		else if(dairyProductsList.get(0).KategoriAdi.compareTo(kategoriAdi)==0) {
			
			Urun.DairyProducts.ListeyiYazdir(dairyProductsList);
			
			double toplamBirimFiyati=0,ortalamaBirimFiyati=0;
			int toplamNesneSayisi=dairyProductsList.size();

			for (DairyProducts dairyProducts : dairyProductsList) {
				toplamBirimFiyati=toplamBirimFiyati+dairyProducts.BirimFiyati;
			}
			ortalamaBirimFiyati=toplamBirimFiyati/toplamNesneSayisi;
			System.out.println("DairyProducts listesi ortalama birim fiyati: "+ortalamaBirimFiyati);
			
			for(int i=0;i<dairyProductsList.size();i++) {
				if(dairyProductsList.get(i).BirimFiyati > ortalamaBirimFiyati) {
					dairyProductsList.get(i).BirimFiyati-=dairyProductsList.get(i).BirimFiyati*x/100;
				}
			}
			System.out.println("Guncellenmis Liste");
			Urun.DairyProducts.ListeyiYazdir(dairyProductsList);

		}
		
		else if(cerealsList.get(0).KategoriAdi.compareTo(kategoriAdi)==0) {
			
			Urun.Cereals.ListeyiYazdir(cerealsList);

			double toplamBirimFiyati=0,ortalamaBirimFiyati=0;
			int toplamNesneSayisi=cerealsList.size();

			for (Cereals cereals : cerealsList) {
				toplamBirimFiyati=toplamBirimFiyati+cereals.BirimFiyati;
			}
			ortalamaBirimFiyati=toplamBirimFiyati/toplamNesneSayisi;
			System.out.println("Cereals listesi ortalama birim fiyati: "+ortalamaBirimFiyati);
			
			for(int i=0;i<cerealsList.size();i++) {
				if(cerealsList.get(i).BirimFiyati > ortalamaBirimFiyati) {
					cerealsList.get(i).BirimFiyati-=cerealsList.get(i).BirimFiyati*x/100;
				}
			}
			System.out.println("Guncellenmis Liste");
			Urun.Cereals.ListeyiYazdir(cerealsList);
		}
    	else
    	{
    		System.out.println("Girdiginiz katalog bulunmamaktadir");
    	}
	}
	
	public static class Beverages extends Urun {

		public String KategoriAdi;
		public String detay;
		
		public Beverages() {
			
		}
		
		public Beverages(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari,
				String kategoriAdi, String detay) {
			
			super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari);
			KategoriAdi = kategoriAdi;
			this.detay = detay;
		}

		public static void ListeyiYazdir(ArrayList<Beverages> urunlist) {
			
			for(int i=0; i< urunlist.size(); i++) {
				System.out.println("\t "+urunlist.get(i).Adi+
								   "\t "+urunlist.get(i).KategoriIndex+
								   "\t "+urunlist.get(i).BirimAgirligi+
								   "\t "+urunlist.get(i).BirimFiyati+
								   "\t "+urunlist.get(i).StokMiktari+
								   "\t "+urunlist.get(i).KategoriAdi+
								   "\t "+urunlist.get(i).detay);
			}
			System.out.println("Listedeki eleman sayisi :"+ urunlist.size());
			System.out.println();
		}

		public static void IcecekUrunuSil(ArrayList<Beverages> beveragesList,String urunAdi) {
			ListeyiYazdir(beveragesList);
			int i;
			for(i=0;i<beveragesList.size();i++) {
				if(beveragesList.get(i).Adi.compareTo(urunAdi)==0) {
					beveragesList.remove(i);
					break;
					
				}
			}
			if(beveragesList.size()==i) {
				System.out.println("Girilen isimde urun bulunmamaktaddir.");
			}
			ListeyiYazdir(beveragesList);
		}
		
	}
	public static class Condiments extends Urun {

		static String KategoriAdi;
		static String detay;
		
		public Condiments() {
			
		}
		
		public Condiments(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari,
				String kategoriAdi, String detay) {
			
			super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari);
			KategoriAdi = kategoriAdi;
			this.detay = detay;
		}

		public static void ListeyiYazdir(ArrayList<Condiments> urunlist) {
			
			for(int i=0; i< urunlist.size(); i++) {
				System.out.println("\t "+urunlist.get(i).Adi+
								   "\t "+urunlist.get(i).KategoriIndex+
								   "\t "+urunlist.get(i).BirimAgirligi+
								   "\t "+urunlist.get(i).BirimFiyati+
								   "\t "+urunlist.get(i).StokMiktari+
								   "\t "+urunlist.get(i).KategoriAdi+
								   "\t "+urunlist.get(i).detay);
			}
			System.out.println("Listedeki eleman sayisi :"+ urunlist.size());
			System.out.println();
		}

		public static void CesniUrunEkle(ArrayList<Condiments> condimentsList, String adi, String birimAgirligi, double birimFiyati, int stokMiktari) {
			Condiments urunCondiments = new Condiments(adi, 2, birimAgirligi, birimFiyati, stokMiktari,KategoriAdi,detay);
			Condiments.ListeyiYazdir(condimentsList);
			condimentsList.add(urunCondiments);
			Condiments.ListeyiYazdir(condimentsList);
		}
		
	}
	
	public static class Confections extends Urun {

		public String KategoriAdi;
		public static String detay;
		
		public Confections() {
			
		}
		
		public Confections(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari,
				String kategoriAdi, String detay) {
			
			super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari);
			KategoriAdi = kategoriAdi;
			this.detay = detay;
		}

		public static void ListeyiYazdir(ArrayList<Confections> urunlist) {
			
			for(int i=0; i< urunlist.size(); i++) {
				System.out.println("\t "+urunlist.get(i).Adi+
								   "\t "+urunlist.get(i).KategoriIndex+
								   "\t "+urunlist.get(i).BirimAgirligi+
								   "\t "+urunlist.get(i).BirimFiyati+
								   "\t "+urunlist.get(i).StokMiktari+
								   "\t "+urunlist.get(i).KategoriAdi+
								   "\t "+urunlist.get(i).detay);
			}
			System.out.println("Listedeki eleman sayisi :"+ urunlist.size());
			System.out.println();
		}

		public static void SekerlemeDetayEkle(ArrayList<Confections> confectionsList, String yeniDetay) {
			 ListeyiYazdir(confectionsList);
			 detay=detay.concat(","+yeniDetay);
			 ListeyiYazdir(confectionsList);
		}
		
	}
	public static class DairyProducts extends Urun {

		public String KategoriAdi;
		public String detay;
		
		public DairyProducts() {
			
		}
		
		public DairyProducts(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari,
				String kategoriAdi, String detay) {
			
			super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari);
			KategoriAdi = kategoriAdi;
			this.detay = detay;
		}

		public static void ListeyiYazdir(ArrayList<DairyProducts> urunlist) {
			
			for(int i=0; i< urunlist.size(); i++) {
				System.out.println("\t "+urunlist.get(i).Adi+
								   "\t "+urunlist.get(i).KategoriIndex+
								   "\t "+urunlist.get(i).BirimAgirligi+
								   "\t "+urunlist.get(i).BirimFiyati+
								   "\t "+urunlist.get(i).StokMiktari+
								   "\t "+urunlist.get(i).KategoriAdi+
								   "\t "+urunlist.get(i).detay);
			}
			System.out.println("Listedeki eleman sayisi :"+ urunlist.size());
			System.out.println();
		}

		public static void SutUrunuStokGuncelle(ArrayList<DairyProducts> dairyProductsList, int urunIndexi, boolean Satismi,
				int miktar) {
			int sayac=0;
			ListeyiYazdir(dairyProductsList);
			for(int i=0; i<dairyProductsList.size();i++) {
				if (urunIndexi==i) {
					if(Satismi) {
						int yedek = dairyProductsList.get(i).StokMiktari-miktar;
						if(yedek<0) {
							System.out.println("Istediginiz miktarda urun bulunmamaktadir.");
						}
							else {
								dairyProductsList.get(i).StokMiktari-=miktar;							
						}
					}
					else {
						dairyProductsList.get(i).StokMiktari+=miktar;
					}
				}
			}

			if(sayac==0) {
				System.out.println("Girdiginiz index bulunamamaktadir.");
			}
			ListeyiYazdir(dairyProductsList);
		}
		
	}
	
	public static class Cereals extends Urun {

		public String KategoriAdi;
		public String detay;
		
		public Cereals() {
			
		}
		
		public Cereals(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari,
				String kategoriAdi, String detay) {
			
			super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari);
			KategoriAdi = kategoriAdi;
			this.detay = detay;
		}

		public static void ListeyiYazdir(ArrayList<Cereals> urunlist) {
			
			for(int i=0; i< urunlist.size(); i++) {
				System.out.println("\t "+urunlist.get(i).Adi+
								   "\t "+urunlist.get(i).KategoriIndex+
								   "\t "+urunlist.get(i).BirimAgirligi+
								   "\t "+urunlist.get(i).BirimFiyati+
								   "\t "+urunlist.get(i).StokMiktari+
								   "\t "+urunlist.get(i).KategoriAdi+
								   "\t "+urunlist.get(i).detay);
			}
			System.out.println("Listedeki eleman sayisi :"+ urunlist.size());
			System.out.println();
		}

		public static void TahilBirimAgirlikGuncelle(ArrayList<Cereals> cerealsList, double yeniFiyat) {
			
			double toplamBirimFiyati = 0 ,ortalamaFiyat=0;
			int toplamNesneSayisi= cerealsList.size();

			for (Cereals cereals : cerealsList) {
				toplamBirimFiyati =toplamBirimFiyati+ cereals.BirimFiyati;
			}
			System.out.println("toplam: "+toplamBirimFiyati);
			System.out.println("boyut: "+toplamNesneSayisi);
			
			ortalamaFiyat=toplamBirimFiyati/toplamNesneSayisi;
			System.out.println("ortalama birim fiyati: "+ ortalamaFiyat);
			
			Cereals enYakinCereals =cerealsList.get(0);
			double enKucukFark = Math.abs(enYakinCereals.BirimFiyati-ortalamaFiyat);
			
			for (Cereals cereals : cerealsList) {
				double fark =Math.abs(cereals.BirimFiyati-ortalamaFiyat);
				if(fark<enKucukFark) {
					enKucukFark=fark;
					enYakinCereals= cereals;
				}
			}
			enYakinCereals.BirimFiyati=yeniFiyat;
			System.out.println("Guncellenen cereals: "+enYakinCereals.Adi);
			ListeyiYazdir(cerealsList);
		}
		
	}

}
