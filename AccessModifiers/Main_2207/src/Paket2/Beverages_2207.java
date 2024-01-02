package Paket2;

import java.util.ArrayList;
import java.util.Scanner;

import Paket1.VerileriOkuma_2207;

public class Beverages_2207 extends Urun_2207{

	private String KategoriAdi;
	private String Detay;

	public Beverages_2207(String adi, int kategori_index, String birim_agirligi, Double birim_fiyat, int stok_miktari) {
		super(adi, kategori_index, birim_agirligi, birim_fiyat, stok_miktari);
	}
	protected void IcecekBirimAgirlikGuncelle(String yeniAgirlik) {		
		setBirimAgirligi(yeniAgirlik);
	}
	
	protected static void IcecekBirimAgirlikGuncelleFE(ArrayList<Beverages_2207> beverages_list) {		
		// Listedeki en son içeceğin ağırlığı değiştiriliyor:
		if (VerileriOkuma_2207.beverages_list.isEmpty() || VerileriOkuma_2207.beverages_list.get(0).getKategoriAdi() == null) {
		    System.out.println("\n--> Beverages kategorisi verileri eksik veya bos!");
		    return;
		}
		System.out.println("\nIcecek listesi:");
		for (Beverages_2207 beverages : beverages_list) {
			System.out.println("Adi: "+ beverages.getAdi()+ "  Birim Agirlik: "+ beverages.getBirimAgirligi());
		}
		System.out.println();
		
		Scanner input = new Scanner(System.in);
		System.out.println("\nYeni agirligi giriniz: ");
		String yeniAgirlik = input.nextLine();
		
		beverages_list.get(beverages_list.size()-1).IcecekBirimAgirlikGuncelle(yeniAgirlik);
		System.out.println("\n\n Guncellenen icecek ismi: "+beverages_list.get(beverages_list.size()-1).getAdi() + "\n-> Yeni Agirlik: "+ beverages_list.get(beverages_list.size()-1).getBirimAgirligi());
		System.out.println("\nYeni icecek listesi:");
		for (Beverages_2207 beverages : beverages_list) {
			System.out.println("Adi: "+ beverages.getAdi()+ "  Birim Agirlik: "+ beverages.getBirimAgirligi());
		}
		System.out.println();
	}
	
	public static void IcecekBirimAgirlikGuncelleF(ArrayList<Beverages_2207> beverages_list) {		
		IcecekBirimAgirlikGuncelleFE(beverages_list);
	}
	
	public String getKategoriAdi() {
		if (KategoriAdi == null) {
	        return KategoriAdi;
	    }

	    return KategoriAdi;
	}

	public void setKategoriAdi(String kategoriAdi) {
		KategoriAdi = kategoriAdi;
	}

	public String getDetay() {
		return Detay;
	}

	public void setDetay(String detay) {
		Detay = detay;
	}

}