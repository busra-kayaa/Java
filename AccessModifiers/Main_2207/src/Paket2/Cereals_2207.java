package Paket2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Cereals_2207 extends Urun_2207 {
	private String Kategoriadi;
	private String Detay;
	
	public Cereals_2207(String adi, int kategori_index, String birim_agirligi, Double birim_fiyat, int stok_miktari) {
		super(adi, kategori_index, birim_agirligi, birim_fiyat, stok_miktari);
	}
	
	protected static boolean HububatSilFE(ArrayList<Cereals_2207> cereals_list) {
		System.out.println("\n\n Hububat urunu listesi: ");
		for (Cereals_2207 cereals : cereals_list) {
			System.out.println("- "+ cereals.getAdi());
		}
		System.out.println();
		
		if(cereals_list.size()==0) {
			System.out.println("Listede hicbir hububat urunu kalmadi");
			return false;
		}
		Scanner input = new Scanner(System.in);
		System.out.println("Silmek istediginiz urunun adini giriniz: ");
		String urun_adi = input.nextLine();
		boolean kontrol = false;
		
		for(int i = 0; i <cereals_list.size(); i++) {
			if(cereals_list.get(i).getAdi().contains(urun_adi)) {
				cereals_list.remove(i);
				kontrol=true;
				break;
			}
		}
		
		if(kontrol) {
			System.out.println("\n\n--> " + urun_adi + " isimli urun silindi .");
			if(cereals_list.size()==0) {
				System.out.println("Listede hicbir urun kalmadi !");
				return false;
			}
			System.out.println("\nYeni hububat listesi: ");
			for (Cereals_2207 cereals : cereals_list) {
				System.out.println("- "+ cereals.getAdi());
			}
			System.out.println();
		}
		else System.out.println("\n\n--> " + urun_adi + " isimli urun bulunamadi !");
		return true;

	}
	public static boolean HububatSilF(ArrayList<Cereals_2207> cereals_list) {
		return HububatSilFE(cereals_list);
	}
	
	public String getKategoriAdi() {
		return Kategoriadi;
	}

	public void setKategoriAdi(String kategoriadi) {
		Kategoriadi = kategoriadi;
	}

	public String getDetay() {
		return Detay;
	}

	public void setDetay(String detay) {
		Detay = detay;
	}
}
