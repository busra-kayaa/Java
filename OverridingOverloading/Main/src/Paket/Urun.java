package Paket;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Iterator;

public class Urun {

	public String Adi;
	public int KategoriIndex;
	public String BirimAgirligi;
	public double BirimFiyatı;
	public int StokMiktari;
	
	public Urun() {
		
	}

	public Urun(String adi, int kategoriIndex, String birimAgirligi, double birimFiyatı, int stokMiktari) {
		super();
		Adi = adi;
		KategoriIndex = kategoriIndex;
		BirimAgirligi = birimAgirligi;
		BirimFiyatı = birimFiyatı;
		StokMiktari = stokMiktari;
	}
	
	public void UrunFiyatGuncelle(ArrayList<Beverages> beveragesList,
    		ArrayList<Condiments> condimentsList,ArrayList<Confections> confectionsList,
    		ArrayList<DairyProducts> dairyProductsList,ArrayList<Cereals> cerealsList,
			int oran) {
		
		for(int i= 0; i < beveragesList.size();i++) {
			beveragesList.get(i).BirimFiyatı+= beveragesList.get(i).BirimFiyatı * oran/100;
		}
		for(int i= 0; i < condimentsList.size();i++) {
			condimentsList.get(i).BirimFiyatı+=condimentsList.get(i).BirimFiyatı * oran/100;
		}
		for(int i= 0; i < confectionsList.size();i++ ) {
			confectionsList.get(i).BirimFiyatı+= confectionsList.get(i).BirimFiyatı * oran/100;
		}
		for(int i= 0; i < dairyProductsList.size(); i++) {
			dairyProductsList.get(i).BirimFiyatı+= dairyProductsList.get(i).BirimFiyatı * oran/100;
		}
		for(int i= 0; i<cerealsList.size();i++) {
			cerealsList.get(i).BirimFiyatı+= cerealsList.get(i).BirimFiyatı * oran/100;
		}
		
	}

	public static void UrunFiyatGuncelle(ArrayList<Beverages> beveragesList,
    		ArrayList<Condiments> condimentsList,ArrayList<Confections> confectionsList,
    		ArrayList<DairyProducts> dairyProductsList,ArrayList<Cereals> cerealsList,
			int oran, int stokMiktari) {
		
		for(int i= 0; i < beveragesList.size();i++) {
			if(stokMiktari > beveragesList.get(i).StokMiktari) {
				beveragesList.get(i).BirimFiyatı+= beveragesList.get(i).BirimFiyatı * oran/100;
			}
		}
		
		for(int i= 0; i < condimentsList.size();i++) {
			if (stokMiktari > condimentsList.get(i).StokMiktari) {
				condimentsList.get(i).BirimFiyatı+=condimentsList.get(i).BirimFiyatı * oran/100;
			}
		}
		
		for(int i= 0; i < confectionsList.size();i++ ) {
			if(stokMiktari > confectionsList.get(i).StokMiktari) {
				confectionsList.get(i).BirimFiyatı+= confectionsList.get(i).BirimFiyatı * oran/100;
			}
		}
		
		for(int i= 0; i < dairyProductsList.size(); i++) {
			if (stokMiktari > dairyProductsList.get(i).StokMiktari) {
				dairyProductsList.get(i).BirimFiyatı+= dairyProductsList.get(i).BirimFiyatı * oran/100;
			}
		}
		
		for(int i= 0; i<cerealsList.size(); i++) {
			if(stokMiktari > cerealsList.get(i).StokMiktari) {
				cerealsList.get(i).BirimFiyatı+= cerealsList.get(i).BirimFiyatı * oran/100;
			}
		}
		
		
	}
	
	public void UrunStokGuncelle(ArrayList<Beverages> beveragesList, ArrayList<Condiments> condimentsList,ArrayList<Confections> confectionsList,
			 ArrayList<DairyProducts> dairyProductsList, ArrayList<Cereals> cerealsList, int stokMiktarı, boolean girisMi) {
		for(int i=0;i< beveragesList.size();i++) {
				if(girisMi== false) {
					if(beveragesList.get(i).StokMiktari-stokMiktarı>=0) {
						beveragesList.get(i).StokMiktari-=stokMiktarı;
					}
					else {
						beveragesList.get(i).StokMiktari+=stokMiktarı;
					}
				}
		}
		
		for(int i=0;i< condimentsList.size();i++) {
			if(girisMi== false) {
				if(condimentsList.get(i).StokMiktari-stokMiktarı>=0) {
					condimentsList.get(i).StokMiktari-=stokMiktarı;
				}
				else {
					condimentsList.get(i).StokMiktari+=stokMiktarı;
				}
			}
		}
		
		for(int i=0; i<confectionsList.size(); i++) {
			if(girisMi== false) {
				if(confectionsList.get(i).StokMiktari-stokMiktarı>=0) {
					confectionsList.get(i).StokMiktari-=stokMiktarı;

				}
			}
			else {
				confectionsList.get(i).StokMiktari+=stokMiktarı;
			}
		}
		
		for(int i=0; i<dairyProductsList.size(); i++) {
			if(girisMi== false) {
				if(dairyProductsList.get(i).StokMiktari-stokMiktarı>=0) {
					dairyProductsList.get(i).StokMiktari-=stokMiktarı;
				}
			}
			else {
				dairyProductsList.get(i).StokMiktari+=stokMiktarı;
			}
		}
		
		for(int i=0; i<cerealsList.size(); i++) {
			if(girisMi== false) {
				if(cerealsList.get(i).StokMiktari-stokMiktarı>=0) {
					cerealsList.get(i).StokMiktari-=stokMiktarı;
				}
			}
			else {
				cerealsList.get(i).StokMiktari+=stokMiktarı;
			}
		}
	}
	public static void UrunKategorikZamYap (ArrayList<Beverages> beveragesList, ArrayList<Condiments> condimentsList, 
											ArrayList<Confections> confectionsList, ArrayList<DairyProducts> dairyProductsList, ArrayList<Cereals> cerealsList, 
											String kategoriAdi, int stokKontrol) {
		
		if(beveragesList.get(0).KategoriAdi.compareTo(kategoriAdi)==0)
    	{
			int uzunluk = kategoriAdi.length();
	        double zamOrani = uzunluk;

	        for(int i= 0; i < beveragesList.size();i++) {
				if(stokKontrol > 10) {
					beveragesList.get(i).BirimFiyatı+= beveragesList.get(i).BirimFiyatı * zamOrani/100;
				}
				else {
					beveragesList.get(i).BirimFiyatı+= beveragesList.get(i).BirimFiyatı * 2*zamOrani/100;
				}
			}
    		Beverages.ListeYazdir(beveragesList);
    	}
		
		else if(condimentsList.get(0).KategoriAdi.compareTo(kategoriAdi)==0)
    	{
			int uzunluk = kategoriAdi.length();
	        double zamOrani = uzunluk;

    		for(int i=0;i<condimentsList.size();i++)
    		{
				if(stokKontrol > 10) {
					condimentsList.get(i).BirimFiyatı+= condimentsList.get(i).BirimFiyatı * zamOrani/100;
				}
				else {
					condimentsList.get(i).BirimFiyatı+= condimentsList.get(i).BirimFiyatı * 2*zamOrani/100;
				}    		
			}
    		Condiments.ListeYazdir(condimentsList);
    	}
		
		else if(confectionsList.get(0).KategoriAdi.compareTo(kategoriAdi)==0)
    	{
			int uzunluk = kategoriAdi.length();
	        double zamOrani = uzunluk;

    		for(int i=0;i<confectionsList.size();i++)
    		{
    			if(stokKontrol > 10) {
					confectionsList.get(i).BirimFiyatı+= confectionsList.get(i).BirimFiyatı * zamOrani/100;
				}
				else {
					confectionsList.get(i).BirimFiyatı+= confectionsList.get(i).BirimFiyatı * 2*zamOrani/100;
				}        		
    		}
    		Confections.ListeYazdir(confectionsList);
    	}
		
		else if(dairyProductsList.get(0).KategoriAdi.compareTo(kategoriAdi)==0)
    	{
			int uzunluk = kategoriAdi.length();
	        double zamOrani = uzunluk;

    		for(int i=0;i<dairyProductsList.size();i++)
    		{
    			if(stokKontrol > 10) {
					dairyProductsList.get(i).BirimFiyatı+= dairyProductsList.get(i).BirimFiyatı * zamOrani/100;
				}
				else {
					dairyProductsList.get(i).BirimFiyatı+= dairyProductsList.get(i).BirimFiyatı * 2*zamOrani/100;
				}        	    		
    		}
    		DairyProducts.ListeYazdir(dairyProductsList);
    	}
		
		else if(cerealsList.get(0).KategoriAdi.compareTo(kategoriAdi)==0)
    	{
			int uzunluk = kategoriAdi.length();
	        double zamOrani = uzunluk;

    		for(int i=0;i<cerealsList.size();i++)
    		{
    			if(stokKontrol > 10) {
					cerealsList.get(i).BirimFiyatı+= cerealsList.get(i).BirimFiyatı * zamOrani/100;
				}
				else {
					cerealsList.get(i).BirimFiyatı+= cerealsList.get(i).BirimFiyatı * 2*zamOrani/100;
				}        	
    		}
    		Cereals.ListeYazdir(cerealsList);
    	}
		else {
			System.out.println("Girdiginiz katalog bulunmamaktadir!");
		}	 
	}
	
	public static void UrunKategorikZamYap (ArrayList<Beverages> beveragesList,
											ArrayList<Condiments> condimentsList, ArrayList<Confections> confectionsList,
											ArrayList<DairyProducts> dairyProductsList, ArrayList<Cereals> cerealsList, String kategoriAdi) {

		if(beveragesList.get(0).KategoriAdi.compareTo(kategoriAdi)==0)
    	{
			int uzunluk = kategoriAdi.length();
	        double zamOrani = uzunluk;

    		for(int i=0;i<beveragesList.size();i++)
    		{
    			beveragesList.get(i).BirimFiyatı+=beveragesList.get(i).BirimFiyatı* zamOrani/100;
    		}
    		Beverages.ListeYazdir(beveragesList);
    	}
		
		else if(condimentsList.get(0).KategoriAdi.compareTo(kategoriAdi)==0)
    	{
			int uzunluk = kategoriAdi.length();
	        double zamOrani = uzunluk;

    		for(int i=0;i<condimentsList.size();i++)
    		{
    			condimentsList.get(i).BirimFiyatı+=condimentsList.get(i).BirimFiyatı* zamOrani/100;
    		}
    		Condiments.ListeYazdir(condimentsList);
    	}
		
		else if(confectionsList.get(0).KategoriAdi.compareTo(kategoriAdi)==0)
    	{
			int uzunluk = kategoriAdi.length();
	        double zamOrani = uzunluk;

    		for(int i=0;i<confectionsList.size();i++)
    		{
    			confectionsList.get(i).BirimFiyatı+=confectionsList.get(i).BirimFiyatı* zamOrani/100;
    		}
    		Confections.ListeYazdir(confectionsList);
    	}
		
		else if(dairyProductsList.get(0).KategoriAdi.compareTo(kategoriAdi)==0)
    	{
			int uzunluk = kategoriAdi.length();
	        double zamOrani = uzunluk;

    		for(int i=0;i<dairyProductsList.size();i++)
    		{
    			dairyProductsList.get(i).BirimFiyatı+=dairyProductsList.get(i).BirimFiyatı* zamOrani/100;
    		}
    		DairyProducts.ListeYazdir(dairyProductsList);
    	}
		
		else if(cerealsList.get(0).KategoriAdi.compareTo(kategoriAdi)==0)
    	{
			int uzunluk = kategoriAdi.length();
	        double zamOrani = uzunluk;

    		for(int i=0;i<cerealsList.size();i++)
    		{
    			cerealsList.get(i).BirimFiyatı+=cerealsList.get(i).BirimFiyatı* zamOrani/100;
    		}
    		Cereals.ListeYazdir(cerealsList);
    	}
     
		else {
			System.out.println("Girdiginiz katalog bulunmamaktadir!");
		} 
	}
}
