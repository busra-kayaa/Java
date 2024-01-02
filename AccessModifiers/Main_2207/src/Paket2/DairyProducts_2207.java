package Paket2;

import java.util.ArrayList;
import java.util.Scanner;

public class DairyProducts_2207 extends Urun_2207 {
	private String KategoriAdi;
	private String Detay;

	public DairyProducts_2207(String isim, int kategori_index, String birim_agirligi, Double birim_fiyat, int stok_miktari) {
		super(isim, kategori_index, birim_agirligi, birim_fiyat, stok_miktari);
	}

	protected static void SutUrunleriDetayEkleFE(ArrayList<DairyProducts_2207> dairy_products_list) {
		Scanner input = new Scanner(System.in);
		System.out.print("\nEklencek olan yeni detayi giriniz: ");
		String yeni_detay = input.nextLine();
		for (DairyProducts_2207 dairyProducts : dairy_products_list) {
			dairyProducts.SutUrunleriDetayEkle(yeni_detay);
		}
		System.out.println("\n\n-> Yeni detay: "+ dairy_products_list.get(0).getDetay());
		System.out.println("\nYeni sut urunleri listesi:");
		for (DairyProducts_2207 dairyProducts : dairy_products_list) {
			System.out.println("Adi: "+ dairyProducts.getAdi()+"\tDetay: "+ dairyProducts.getDetay());
		}
		System.out.println();
	}
	
	protected void SutUrunleriDetayEkle(String yeni_detay) {
		Detay = Detay.concat(", " + yeni_detay);
	}

	public static void SutUrunleriDetayEkleF(ArrayList<DairyProducts_2207> dairy_products_list) {
		SutUrunleriDetayEkleFE(dairy_products_list);
	}

	public String getKategoriAdi() {
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
