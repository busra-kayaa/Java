package Paket;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.text.Position.Bias;

public abstract class Urun_2207 {
	
	public String Adi;
    public int KategoriIndex;
    public String BirimAgirligi;
    public double BirimFiyati;
    public int StokMiktari;
    
    public Urun_2207()
    {
    	
    }
    
    public Urun_2207(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari) {
		
    	this.Adi = adi;
		this.KategoriIndex = kategoriIndex;
		this.BirimAgirligi = birimAgirligi;
		this.BirimFiyati = birimFiyati;
		this.StokMiktari = stokMiktari;
	}

	public static void UrunFiyatGuncelle(ArrayList<Beverages_2207> beveragesList, ArrayList<Condiments_2207> condimentsList,
			ArrayList<Confections_2207> confectionsList, ArrayList<DairyProducts_2207> dairyProductsList,
			ArrayList<Cereals_2207> cerealsList,int kategori,int oran, boolean indirimMi,String islemYapilacakUrun) {
		
		int kontrol=0;
		if(kategori==1) {
			Beverages_2207.ListeyiYazdir(beveragesList);
			for(int i=0; i<beveragesList.size(); i++) {
				
				if(beveragesList.get(i).Adi.compareTo(islemYapilacakUrun)==0) {
					if(indirimMi== true) {
						if(beveragesList.get(i).BirimFiyati-beveragesList.get(i).BirimFiyati*(oran+beveragesList.get(i).katSayi)/100>=0) {
	 	     				 beveragesList.get(i).BirimFiyati-=beveragesList.get(i).BirimFiyati*(oran+beveragesList.get(i).katSayi)/100;     					

						}
	 				}
					else {
						beveragesList.get(i).BirimFiyati+=beveragesList.get(i).BirimFiyati*(oran+beveragesList.get(i).katSayi)/100;
					}
					kontrol = 1;
					break;
				}
			}
			
			if(kontrol==0) {
				System.out.println("Urun Bulunamadi!");
			}
			Beverages_2207.ListeyiYazdir(beveragesList);		
		}
			

		else if(kategori==2) {
			Condiments_2207.ListeYazdir(condimentsList);
			for(int i=0; i<condimentsList.size(); i++) {
				
				if(condimentsList.get(i).Adi.compareTo(islemYapilacakUrun)==0) {
					if(indirimMi== true) {
						if(condimentsList.get(i).BirimFiyati-condimentsList.get(i).BirimFiyati*(oran+condimentsList.get(i).katSayi)/100>=0) {
							condimentsList.get(i).BirimFiyati-=condimentsList.get(i).BirimFiyati*(oran+condimentsList.get(i).katSayi)/100;     					
						}
	 				}
					else {
						condimentsList.get(i).BirimFiyati+=condimentsList.get(i).BirimFiyati*(oran+condimentsList.get(i).katSayi)/100;
					}
					kontrol = 1;
					break;
				}
			}
			if(kontrol==0) {
				System.out.println("Urun Bulunamadi!");
			}	
			Condiments_2207.ListeYazdir(condimentsList);
		}
			
		else if(kategori==3) {
			Confections_2207.ListeyiYazdir(confectionsList);
			for(int i=0; i<confectionsList.size(); i++) {
				
				if(confectionsList.get(i).Adi.compareTo(islemYapilacakUrun)==0) {
					if (indirimMi== true) {
						if(confectionsList.get(i).BirimFiyati-confectionsList.get(i).BirimFiyati*(oran+confectionsList.get(i).katSayi)/100>=0) {
							confectionsList.get(i).BirimFiyati-=confectionsList.get(i).BirimFiyati*(oran+confectionsList.get(i).katSayi)/100;
						}
					}
					else {
						confectionsList.get(i).BirimFiyati+=confectionsList.get(i).BirimFiyati*(oran+confectionsList.get(i).katSayi)/100;
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
		
		else if(kategori==4) {
			DairyProducts_2207.ListeyiYazdir(dairyProductsList);
			for(int i=0; i<dairyProductsList.size(); i++) {
				
				if(dairyProductsList.get(i).Adi.compareTo(islemYapilacakUrun)== 0) {
					if (indirimMi== true) {
						if(dairyProductsList.get(i).BirimFiyati-dairyProductsList.get(i).BirimFiyati*(oran+dairyProductsList.get(i).katSayi)/100>=0) {
							dairyProductsList.get(i).BirimFiyati-=dairyProductsList.get(i).BirimFiyati*(oran+dairyProductsList.get(i).katSayi)/100;
						}
					}
					else {
						dairyProductsList.get(i).BirimFiyati+=dairyProductsList.get(i).BirimFiyati*(oran+dairyProductsList.get(i).katSayi)/100;
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
		else if(kategori==5) {
		Cereals_2207.ListeyiYazdir(cerealsList);
			for(int i=0; i<cerealsList.size(); i++) {
				if(cerealsList.get(i).Adi.compareTo(islemYapilacakUrun)==0) {
					if (indirimMi== true) {
						if(cerealsList.get(i).BirimFiyati-cerealsList.get(i).BirimFiyati*(oran+cerealsList.get(i).katSayi)/100>=0) {
							cerealsList.get(i).BirimFiyati-=cerealsList.get(i).BirimFiyati*(oran+cerealsList.get(i).katSayi)/100;
						}
					}
					else {
						cerealsList.get(i).BirimFiyati+=cerealsList.get(i).BirimFiyati*(oran+cerealsList.get(i).katSayi)/100;
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
	}
	public static void UrunKategorikZamYap (ArrayList<Beverages_2207> beveragesList, ArrayList<Condiments_2207> condimentsList,
			ArrayList<Confections_2207> confectionsList, ArrayList<DairyProducts_2207> dairyProductsList,
			ArrayList<Cereals_2207> cerealsList,int kategori,int X) {
		
		int kontrol=0;
		
		if(kategori==1) {
			Beverages_2207.ListeyiYazdir(beveragesList);
			for(int i=0; i<beveragesList.size(); i++) {
				beveragesList.get(i).BirimFiyati+=beveragesList.get(i).BirimFiyati*(X+beveragesList.get(i).katSayi)/100;
			}
			Beverages_2207.ListeyiYazdir(beveragesList);
		}
		else if(kategori==2) {
			Condiments_2207.ListeYazdir(condimentsList);
			for(int i=0; i<condimentsList.size(); i++) {
				condimentsList.get(i).BirimFiyati+=condimentsList.get(i).BirimFiyati*(X+condimentsList.get(i).katSayi)/100;
			}
			Condiments_2207.ListeYazdir(condimentsList);
		}
		else if(kategori==3) {
			Confections_2207.ListeyiYazdir(confectionsList);
			for(int i=0; i<confectionsList.size(); i++) {
				confectionsList.get(i).BirimFiyati+=condimentsList.get(i).BirimFiyati*(X+confectionsList.get(i).katSayi)/100;
			}
			Confections_2207.ListeyiYazdir(confectionsList);
		}
		else if(kategori==4) {
			
			DairyProducts_2207.ListeyiYazdir(dairyProductsList);
			for(int i=0; i<dairyProductsList.size(); i++) {
				dairyProductsList.get(i).BirimFiyati+=dairyProductsList.get(i).BirimFiyati*(X+dairyProductsList.get(i).katSayi)/100;
			}
			DairyProducts_2207.ListeyiYazdir(dairyProductsList);
		}
		else if(kategori==5) {
			Cereals_2207.ListeyiYazdir(cerealsList);
			for(int i=0; i<cerealsList.size();i++) {
				cerealsList.get(i).BirimFiyati+=cerealsList.get(i).BirimFiyati*(X+cerealsList.get(i).katSayi)/100;
			}
			Cereals_2207.ListeyiYazdir(cerealsList);
			
		}
		
	}
	
}
