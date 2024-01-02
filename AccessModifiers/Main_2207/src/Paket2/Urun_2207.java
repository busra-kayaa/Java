package Paket2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import Paket1.*;

public class Urun_2207 {

	private String Adi;
	private int KategoriIndex;
	private String BirimAgirligi;
	private double BirimFiyatı;
	private int StokMiktari;
	
	public Urun_2207(String adi, int kategoriIndex, String birimAgirligi, double birimFiyatı, int stokMiktari) {
		super();
		Adi = adi;
		KategoriIndex = kategoriIndex;
		BirimAgirligi = birimAgirligi;
		BirimFiyatı = birimFiyatı;
		StokMiktari = stokMiktari;
	}
	
	protected static void UrunleriFiyataGoreSil() {
		Scanner input = new Scanner(System.in);
		System.out.print("\nMin fiyati giriniz: ");
		Double MinFiyat = input.nextDouble();
		System.out.print("Max fiyati giriniz: ");
		Double MaxFiyat = input.nextDouble();
		
		System.out.println("\n");
        ArrayList<Urun_2207> silinecekUrunler = new ArrayList<>();
		
		for (Beverages_2207 beverages : VerileriOkuma_2207.beverages_list) {
			if (beverages.getBirimFiyatı() > MinFiyat && MaxFiyat > beverages.getBirimFiyatı() ) {
				silinecekUrunler.add(beverages);
			}
		}
		for (Condiments_2207 condiments : VerileriOkuma_2207.condiments_list) {
			if(condiments.getBirimFiyatı() > MinFiyat && MaxFiyat > condiments.getBirimFiyatı()) {
				silinecekUrunler.add(condiments);
			}
		}
		
		for (Confections_2207 confections : VerileriOkuma_2207.confections_list) {
			if(confections.getBirimFiyatı() > MinFiyat && MaxFiyat > confections.getBirimFiyatı()) {
				silinecekUrunler.add(confections);
			}
		}
		
		for(DairyProducts_2207 dairyProducts : VerileriOkuma_2207.dairy_products_list) {
			if(dairyProducts.getBirimFiyatı()> MinFiyat && MaxFiyat > dairyProducts.getBirimFiyatı()) {
				silinecekUrunler.add(dairyProducts);
			}
		}
		for(Cereals_2207 cereals : VerileriOkuma_2207.cereals_list) {
			if(cereals.getBirimFiyatı()> MinFiyat && MaxFiyat > cereals.getBirimFiyatı()) {
				silinecekUrunler.add(cereals);
			}
		}
		if (silinecekUrunler.isEmpty()) {
            System.out.println("\n\nGirdiginiz araliktaki urun bulunamadi.");
        } 
		else {
	
			VerileriOkuma_2207.beverages_list.removeAll(silinecekUrunler);
			VerileriOkuma_2207.condiments_list.removeAll(silinecekUrunler);
			VerileriOkuma_2207.confections_list.removeAll(silinecekUrunler);
			VerileriOkuma_2207.dairy_products_list.removeAll(silinecekUrunler);
			VerileriOkuma_2207.cereals_list.removeAll(silinecekUrunler);
            System.out.println("\nGirdiginiz araliktaki urunler silindi.");
            System.out.println("\n\nGuncel Urun Listeleri\n");
            
            for (Beverages_2207 beverages : VerileriOkuma_2207.beverages_list) {
    			System.out.println("Adi: "+ beverages.getAdi()+ "  Birim Fiyati: "+ beverages.getBirimFiyatı());
    		}
    		System.out.println();
            
    		for (Condiments_2207 condiments : VerileriOkuma_2207.condiments_list) {
				System.out.println("Adi: "+ condiments.getAdi()+"  Birim Fiyati: "+ condiments.getBirimFiyatı());
			}
    		System.out.println();
    		
    		for (Confections_2207 confections : VerileriOkuma_2207.confections_list) {
				System.out.println("Adi: "+ confections.getAdi() + "  Birim Fiyati: "+ confections.getBirimFiyatı());
			}
			System.out.println();
			
			for (DairyProducts_2207 dairyProducts : VerileriOkuma_2207.dairy_products_list) {
				System.out.println("Adi: "+ dairyProducts.getAdi()+"  Birim Fiyati: "+ dairyProducts.getBirimFiyatı());
			}
			System.out.println();
			
			for(Cereals_2207 cereals : VerileriOkuma_2207.cereals_list) {
				System.out.println("Adi: "+ cereals.getAdi()+"  Birim Fiyati: "+ cereals.getBirimFiyatı());
			}
			System.out.println();
            
		}
	}

	protected static void UrunKategorikStokGuncelleFE(ArrayList<Beverages_2207> beverages_list, ArrayList<Condiments_2207> condiments_list, ArrayList<Confections_2207> confections_list, ArrayList<DairyProducts_2207> dairy_products_list, ArrayList<Cereals_2207> cereals_list) {
		
		Scanner girdi = new Scanner(System.in);
		
		System.out.print("\nStok arttirimi yapilacak kategorinin adini giriniz [ilk karakter buyuk]:");
		String KategoriAdi = girdi.nextLine();
		System.out.print("% kac arttirma yapilsin:");
		int X = girdi.nextInt();
		boolean kontrol = false;
		
		if (VerileriOkuma_2207.beverages_list.isEmpty() || VerileriOkuma_2207.beverages_list.get(0).getKategoriAdi() == null) {
		    System.out.println("\n--> Beverages kategorisi verileri eksik veya bos!");
		    return;
		}
		if(VerileriOkuma_2207.beverages_list.get(0).getKategoriAdi().contains(KategoriAdi)) {
			kontrol= true;
			for(Beverages_2207 beverages : VerileriOkuma_2207.beverages_list) {
				System.out.print("\nArttirma yapilan urun:  " + beverages.getAdi() + "  Eski stok: " + beverages.getStokMiktari());;
				beverages.UrunKategorikStokGuncelle(X);
				System.out.print("  Yeni stok: " + beverages.getStokMiktari());
			}		
		}
		if (VerileriOkuma_2207.condiments_list.isEmpty() || VerileriOkuma_2207.condiments_list.get(0).getKategoriAdi() == null) {
		    System.out.println("\n--> Condiments kategorisi verileri eksik veya bos!");
		    return;
		}
		else if(VerileriOkuma_2207.condiments_list.get(0).getKategoriAdi().contains(KategoriAdi)) {
			kontrol= true;
			for(Condiments_2207 condiments : VerileriOkuma_2207.condiments_list) {
				System.out.print("\nArttirma yapilan urun:  " + condiments.getAdi() + "  Eski stok: " + condiments.getStokMiktari());;
				condiments.UrunKategorikStokGuncelle(X);
				System.out.print("  Yeni stok: " + condiments.getStokMiktari());
			}			
		}
		if (VerileriOkuma_2207.confections_list.isEmpty() || VerileriOkuma_2207.confections_list.get(0).getKategoriAdi() == null) {
		    System.out.println("\n--> Confections kategorisi verileri eksik veya bos!");
		    return;
		}
		else if(VerileriOkuma_2207.confections_list.get(0).getKategoriAdi().contains(KategoriAdi)) {
			kontrol= true;
			for(Confections_2207 confections : VerileriOkuma_2207.confections_list) {
				System.out.print("\nArttirma yapilan urun:  " + confections.getAdi() + "  Eski stok: " + confections.getStokMiktari());;
				confections.UrunKategorikStokGuncelle(X);
				System.out.print("  Yeni stok: " + confections.getStokMiktari());
			}			
		}
		if (VerileriOkuma_2207.dairy_products_list.isEmpty() || VerileriOkuma_2207.dairy_products_list.get(0).getKategoriAdi() == null) {
		    System.out.println("\n--> Dairy Products kategorisi verileri eksik veya bos!");
		    return;
		}
		else if(VerileriOkuma_2207.dairy_products_list.get(0).getKategoriAdi().contains(KategoriAdi)) {
			kontrol= true;
			for(DairyProducts_2207 dairyProducts : VerileriOkuma_2207.dairy_products_list) {
				System.out.print("\nArttirma yapilan urun:  " + dairyProducts.getAdi() + "  Eski stok: " + dairyProducts.getStokMiktari());;
				dairyProducts.UrunKategorikStokGuncelle(X);
				System.out.print("  Yeni stok: " + dairyProducts.getStokMiktari());
			}			
		}
		if (VerileriOkuma_2207.cereals_list.isEmpty() || VerileriOkuma_2207.cereals_list.get(0).getKategoriAdi() == null) {
		    System.out.println("\n--> Cereals kategorisi verileri eksik veya bos!");
		    return;
		}
		else if(VerileriOkuma_2207.cereals_list.get(0).getKategoriAdi().contains(KategoriAdi)) {
			kontrol= true;
			for(Cereals_2207 cereals : VerileriOkuma_2207.cereals_list) {
				System.out.print("\nArttirma yapilan urun:  " + cereals.getAdi() + "  Eski stok: " + cereals.getStokMiktari());;
				cereals.UrunKategorikStokGuncelle(X);
				System.out.print("  Yeni stok: " + cereals.getStokMiktari());
			}			
		}
		
		if (kontrol == false) System.out.println("\n--> Girdiginiz kategori bulunamadi!");
		System.out.println("\n");
	}
	
	protected void UrunKategorikStokGuncelle(int X) {
		int stok = this.StokMiktari;
		stok += ((stok * X) / 100);
		this.StokMiktari = stok;
	}
	
	public static void UrunleriFiyataGoreSilF(ArrayList<Beverages_2207> beverages_list, ArrayList<Condiments_2207> condiments_list, ArrayList<Confections_2207> confections_list, ArrayList<DairyProducts_2207> dairy_products_list, ArrayList<Cereals_2207> cereals_list) {
		UrunleriFiyataGoreSil();
	}
	
	public static void UrunKategorikStokGuncelleF(ArrayList<Beverages_2207> beverages_list, ArrayList<Condiments_2207> condiments_list, ArrayList<Confections_2207> confections_list, ArrayList<DairyProducts_2207> dairy_products_list, ArrayList<Cereals_2207> cereals_list) {
		UrunKategorikStokGuncelleFE(beverages_list,condiments_list,confections_list,dairy_products_list,cereals_list);
	}

	public String getAdi() {
		return Adi;
	}
	public void setAdi(String adi) {
		Adi = adi;
	}
	
	public int getKategoriIndex() {
		return KategoriIndex;
	}
	public void setKategoriIndex(int kategoriIndex) {
		KategoriIndex = kategoriIndex;
	}
	
	public String getBirimAgirligi() {
		return BirimAgirligi;
	}
	public void setBirimAgirligi(String birimAgirligi) {
		BirimAgirligi = birimAgirligi;
	}
	
	public double getBirimFiyatı() {
		return BirimFiyatı;
	}
	public void setBirimFiyatı(double birimFiyatı) {
		BirimFiyatı = birimFiyatı;
	}
	
	public int getStokMiktari() {
		return StokMiktari;
	}
	public void setStokMiktari(int stokMiktari) {
		StokMiktari = stokMiktari;
	}
}
