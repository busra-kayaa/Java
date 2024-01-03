package Main_2207;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Urun_2207 {
	
	public String adi;
	public int kategoriIndex;
	public String birimAgirligi;
	public Double birimFiyat;
	public int stokMiktari;
	
	public static void StokMiktarinaGoreUrunFiyatlariGuncelle(int stokAdedi, Double guncelFiyat,
			ArrayList<Urun_2207> urunList) {
		boolean kontrol = true;
		
		for (Urun_2207 urun : urunList) {
			if(urun.stokMiktari<stokAdedi) {
				kontrol= false;
				urun.birimFiyat=guncelFiyat* (1+ (50 - stokAdedi)/100);
			}
		}
	}

	public static void UrunZamYap (int X,ArrayList<Urun_2207> urunList) {
		System.out.println("\n\nZam uygulandi:");
		Double enkucuk_fiyat = Double.MAX_VALUE;
		int enkucuk_index = 0;
		for (int i = 1; i < urunList.size(); i++) {
				if (urunList.get(i).getbirimFiyat() < enkucuk_fiyat) {
					enkucuk_fiyat = urunList.get(i).getbirimFiyat();
					enkucuk_index = i;
			}
		}
		String isim = urunList.get(enkucuk_index).getadi();
		Double fiyat = urunList.get(enkucuk_index).getbirimFiyat();
		Double zam = (fiyat * X) / 100;
		Double fiyat1 = fiyat + zam;
		urunList.get(enkucuk_index).setbirimFiyatı(fiyat1);
		System.out.println("\n"  + isim + "' isimli urune %" + X + " zam yapildi: " + fiyat + " --> " + fiyat1);
		
	}
	
		private Double getbirimFiyat() {
		return birimFiyat;
	}

		protected String getadi() {
		return adi;
	}

		private void setbirimFiyatı(Double birimFiyatı) {
			this.birimFiyat=birimFiyatı;
	}
}
