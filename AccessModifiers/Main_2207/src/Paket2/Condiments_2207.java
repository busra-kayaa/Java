package Paket2;

import java.util.ArrayList;
import java.util.Scanner;

import Paket1.VerileriOkuma_2207;

public class Condiments_2207 extends Urun_2207 {
	private String KategoriAdi;
	private String Detay;

	public Condiments_2207(String adi, int kategori_index, String birim_agirligi, Double birim_fiyat, int stok_miktari) {
	super(adi, kategori_index, birim_agirligi, birim_fiyat, stok_miktari);
	}
	protected boolean CesniStokGuncelle(boolean Satismi, int miktar){
		if(Satismi) { //satis yapilacak ise
			int stok = getStokMiktari();
			if(stok < miktar) {
				return false;
			}
			else {
				stok-=miktar;
				setStokMiktari(stok);
				return true;
			}
		}
		else { //alis yapilacak ise
			int stok = getStokMiktari();
			stok+=miktar;
			setStokMiktari(stok);
			return true;
		}
	}

	protected static void CesniStokGuncelleFE(ArrayList<Condiments_2207> condiments_list) {		
		Scanner input = new Scanner(System.in);
		System.out.println("\n");
		System.out.print("Cesni Satmak mi istiyorsunuz? [E/H]: ");
		String secimString= input.next();
		System.out.print("Miktar giriniz: ");
		int miktar = input.nextInt();
		
		if (VerileriOkuma_2207.condiments_list.isEmpty() || VerileriOkuma_2207.condiments_list.get(0).getKategoriAdi() == null) {
		    System.out.println("\n--> Condiments kategorisi verileri eksik veya bos!");
		    return;
		}
		
		if(secimString.contains("E") || secimString.contains("e")) { //Satış yapılacak ise
			System.out.println("\n");
			
			int i;
			for(i=0; i<condiments_list.size(); i++) {
				System.out.println((i+1)+ " - "+ condiments_list.get(i).getAdi()+
						" Stok miktari: " + condiments_list.get(i).getStokMiktari() +
						" Fiyat: "+condiments_list.get(i).getBirimFiyatı());
			}
			
			int indis;
			while(true) {
				System.out.print("\nHangi cesniyi satmak istiyorsunuz (Basindaki numarayi girin): ");
				indis = input.nextInt();
				
				if (indis > i || indis <= 0) {
					System.out.println("\n\n--> Girdiginiz indis yanlis!  Tekrar deneyin.");
				}
				else break;
			}
			
			//Stok guncelleme (boolean metod ile):
			if(condiments_list.get(indis-1).CesniStokGuncelle(true, miktar)) {
				System.out.println("\n\nStok guncellendi: ");
				for (Condiments_2207 condiments : condiments_list) {
					System.out.println(" - "+ condiments.getAdi()+" Yeni Stok Miktari: "+ condiments.getStokMiktari());
				}
			}
			else System.out.println("\n--> Stokta bu kadar urun mevcut degil!");
		}
		
		else if(secimString.contains("H") || secimString.contains("h")) { //Alış  yapılaccak ise
			System.out.println("\n");
			int i;
			for(i=0; i<condiments_list.size(); i++) {
				System.out.println((i+1)+ " - "+ condiments_list.get(i).getAdi()+
						" Stok miktari: " + condiments_list.get(i).getStokMiktari() +
						" Fiyat: "+condiments_list.get(i).getBirimFiyatı());
			}
			int indis;
			while(true) {
				System.out.print("\nHangi cesniyi almak istiyorsunuz (Basindaki numarayi girin): ");
				indis = input.nextInt();
				if (indis > i || indis <= 0) {
					System.out.println("\n\n--> Girdiginiz indis yanlis!  Tekrar deneyin.");
				}
				else break;
			}
			// Stok guncelleme boolean metodu ile:
			if(condiments_list.get(indis-1).CesniStokGuncelle(true, miktar)) {
				System.out.println("\n\nStok guncellendi: ");
				for (Condiments_2207 condiments : condiments_list) {
					System.out.println(" - "+ condiments.getAdi()+" Yeni Stok Miktari: "+ condiments.getStokMiktari());
				}
			}
			else System.err.println("Bir hata olustu!");
		}
		else System.out.println("\n\n--> Hatalı secim yaptiniz!");	
	}
	
	public static void CesniStokGuncelleF(ArrayList<Condiments_2207> condiments_list) {		
		CesniStokGuncelleFE(condiments_list);
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
