package Main_2207;

import java.util.ArrayList;

public class Confections_2207 extends Urun_2207 {
	public String kategoriAdi;
	public String detay;
	
	public static void ConfectionsListGoster(ArrayList<Confections_2207> confectionsList) {
		for (Confections_2207 confections : confectionsList) {
			System.out.println(
					confections.adi+"\t"+ 
					confections.kategoriIndex+"\t"+
					confections.birimAgirligi+"\t"+
					confections.birimFiyat+"\t"+
					confections.stokMiktari+"\t"+
					confections.kategoriAdi+"\t"+
					confections.detay);
		}	
	}
	public static void SekerlemeDetayEkle(String Adi, String yeniDetay,ArrayList<Confections_2207> confectionsList){
		boolean kontrol = true;
		for (Confections_2207 confections : confectionsList) {
			if(confections.adi.compareTo(Adi) == 0) {
				kontrol = false;
				confections.detay += ", ";
				confections.detay += yeniDetay;
				break;
			}
		}
		if(kontrol) {
			System.out.println("\n\nGirdiginiz isimde Sekerleme bulunamadi");
		}
		
	}
	private String compareTo(String adi) {
		return adi;
	}
}
