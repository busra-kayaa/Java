package Main_2207;

import java.util.ArrayList;

public class Condiments_2207 extends Urun_2207 {
	public String kategoriAdi;
	public String detay;
	
	public static void CondimentsListGoster(ArrayList<Condiments_2207> condimentsList ) {
		for (Condiments_2207 condiments : condimentsList) {
			System.out.println(
					condiments.adi+"\t"+ 
					condiments.kategoriIndex+"\t"+
					condiments.birimAgirligi+"\t"+
					condiments.birimFiyat+"\t"+
					condiments.stokMiktari+"\t"+
					condiments.kategoriAdi+"\t"+
					condiments.detay);
		}
	}
	@SuppressWarnings("unused")
	public static void CesniBirimAgirlikGuncelle(int N, String yeniAgirlik,ArrayList<Condiments_2207> condimentsList){
		boolean kontrol = true;
		int i=1;
		for (Condiments_2207 condiments : condimentsList) {
			if (i == N) {
				kontrol = false;
				condiments.birimAgirligi= yeniAgirlik;
			}
			i++;
		}
		
		if(kontrol) {
			System.out.println("\n\nGirdiginiz indexte cesni bulunamadi.");
		}
		
	}
}