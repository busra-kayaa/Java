package Main_2207;

import java.util.ArrayList;

public class Beverages_2207 extends Urun_2207 {
	public String kategoriAdi;
	public String detay;
	
	public static void  BeveragesListGoster(ArrayList<Beverages_2207> beveragesList) {
		for (Beverages_2207 beverages : beveragesList) {
			System.out.println(
					beverages.adi+"\t"+ 
					beverages.kategoriIndex+"\t"+
					beverages.birimAgirligi+"\t"+
					beverages.birimFiyat+"\t"+
					beverages.stokMiktari+"\t"+
					beverages.kategoriAdi+"\t"+
					beverages.detay);
		}
	}
	
	public static void TumIceceklerStokGuncelle(int miktar,ArrayList<Beverages_2207> beveragesList){
		boolean kontrol = true;
		for (Beverages_2207 beverages : beveragesList) {
				kontrol = false;
				beverages.stokMiktari+=miktar;
			if(beverages.stokMiktari>0) {
				System.out.println("\n\n Guncellenmis Icecek Listesi\n");
				BeveragesListGoster(beveragesList);
			}
			else if(beverages.stokMiktari<0) {
				System.out.println("Stok negatif olamaz. Baska bir miktar giriniz!");
				break;
			}
		}
		if(kontrol) {
			System.out.println("\n\nGirdiginiz indexte icecek bulunmadi.");
		}
	}
}