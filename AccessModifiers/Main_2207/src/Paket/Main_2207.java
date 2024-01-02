package Paket;

import java.util.ArrayList;
import java.util.Scanner;

import Paket1.VerileriOkuma_2207;
import Paket2.Beverages_2207;
import Paket2.Cereals_2207;
import Paket2.Condiments_2207;
import Paket2.Confections_2207;
import Paket2.DairyProducts_2207;
import Paket2.*;

public class Main_2207 {

	public static void main(String[] args) {
		boolean hububat_urun_kontrol= true;
		Scanner girdi= new Scanner(System.in);
		boolean kontrol = true;
		String dosya_adi = "Urunler.txt";
		
		VerileriOkuma_2207.ListeleriOlusturF(dosya_adi);
		
		while(kontrol) {
			System.out.println("\n Yapmak istediginiz islemi seciniz:\n");
			System.out.println(""
					+ " 1: Urunleri Fiyata Gore Sil\n"
					+ " 2: Urun Kategorik Stok Guncelle\n"
					+ " 3. Icecek Birim Agirlik Guncelle\n"
					+ " 4. Cesni Stok Guncelle\n"
					+ " 5. Sekerleme Urun Ekle\n"
					+ " 6. Sut Urunleri Detay Ekle\n"
					+ " 7. Hububat Sil\n"
					+ " 8. Cikis\n");
			int secim = girdi.nextInt();
			switch (secim) {
			case 1: 
				Urun_2207.UrunleriFiyataGoreSilF(VerileriOkuma_2207.beverages_list, VerileriOkuma_2207.condiments_list,VerileriOkuma_2207.confections_list,VerileriOkuma_2207.dairy_products_list,VerileriOkuma_2207.cereals_list);
				break;
				
			case 2:
				Urun_2207.UrunKategorikStokGuncelleF(VerileriOkuma_2207.beverages_list, VerileriOkuma_2207.condiments_list,VerileriOkuma_2207.confections_list,VerileriOkuma_2207.dairy_products_list,VerileriOkuma_2207.cereals_list);
				break;
				
			case 3:
				Beverages_2207.IcecekBirimAgirlikGuncelleF(VerileriOkuma_2207.beverages_list);
				break;
				
			case 4:
				Condiments_2207.CesniStokGuncelleF(VerileriOkuma_2207.condiments_list);
				break;
				
			case 5:
				Confections_2207.SekerlemeUrunEkleF(VerileriOkuma_2207.confections_list);
				break;
				
			case 6:
				DairyProducts_2207.SutUrunleriDetayEkleF(VerileriOkuma_2207.dairy_products_list);
				break;
				
			case 7:
				if (hububat_urun_kontrol == true) {
					hububat_urun_kontrol =Cereals_2207.HububatSilF(VerileriOkuma_2207.cereals_list);
				}
				else { 
					System.out.println("\n\n--> Listede hicbir urun kalmadi!");
				}
			
				break;
				
			case 8:
				System.out.println("Cikis Yapildi.");
				kontrol = false;
				break;
				
			default:
				System.out.println("Hatali bir sayi girdiniz ");
			}
		}
	  }
	}