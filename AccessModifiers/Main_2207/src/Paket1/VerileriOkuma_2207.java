package Paket1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import Paket2.*;

public class VerileriOkuma_2207 {
		// Listeler:
	
		public static ArrayList<Beverages_2207> beverages_list = new ArrayList<>();
		public static ArrayList<Condiments_2207> condiments_list = new ArrayList<>();
		public static ArrayList<Confections_2207> confections_list = new ArrayList<>();
		public static ArrayList<DairyProducts_2207> dairy_products_list = new ArrayList<>();
		public static ArrayList<Cereals_2207> cereals_list = new ArrayList<>();
		
		public static void ListeleriOlusturF(String dosya_adi) {
			ListeleriOlustur(dosya_adi);
		}

		protected static void ListeleriOlustur(String dosya_adi) {
			File file1 = new File(dosya_adi);
			File file2 = new File("UrunGrubu.txt");
			FileReader fileReader1 = null;
			FileReader fileReader2 = null;
			
			// Ürünlerin bilgilerini listelerine kaydediyor:
			try {
				fileReader1 = new FileReader(file1);
				
				BufferedReader bf1 = new BufferedReader(fileReader1);
				String satir1 = bf1.readLine(); // ilk satırı fazladan alıyor. Çünki kayıt altına alınmayacak
			
				while ((satir1 = bf1.readLine()) != null) {
					
					String[] dizi = satir1.split("\t", 5);
					
					String adi = dizi[0];
					int kategori_index = Integer.parseInt(dizi[1]);
					String birim_agirligi = dizi[2];
					Double birim_fiyat = Double.parseDouble(dizi[3]);
					int stok_miktari = Integer.parseInt(dizi[4]);
					
					if (kategori_index == 1) { // beverages listesine eklenecek:
						beverages_list.add(new Beverages_2207(adi, kategori_index, birim_agirligi, birim_fiyat, stok_miktari));
					}
					else if (kategori_index == 2) {
						condiments_list.add(new Condiments_2207(adi, kategori_index, birim_agirligi, birim_fiyat, stok_miktari));
					}
					else if (kategori_index == 3) {
						confections_list.add(new Confections_2207(adi, kategori_index, birim_agirligi, birim_fiyat, stok_miktari));
					}
					else if (kategori_index == 4) {
						dairy_products_list.add(new DairyProducts_2207(adi, kategori_index, birim_agirligi, birim_fiyat, stok_miktari));
					}
					else if (kategori_index == 5) {
						cereals_list.add(new Cereals_2207(adi, kategori_index, birim_agirligi, birim_fiyat, stok_miktari));
					}
				}
		
			// Ürünlerin kategori adinı ve detay bilgisini listelerine kaydediyor:
						fileReader2 = new FileReader(file2);
						BufferedReader bf2 = new BufferedReader(fileReader2);
						String satir2 = bf2.readLine();
						
						while ((satir2 = bf2.readLine()) != null) {
							String[] dizi = satir2.split("\t", 3);
							
							if (Integer.parseInt(dizi[0]) == 1) {
								for (Beverages_2207 beverages : beverages_list) {
									beverages.setDetay(dizi[2]);
									beverages.setKategoriAdi(dizi[1]);
								}
							}
							else if (Integer.parseInt(dizi[0]) == 2) {
								for (Condiments_2207 condiments : condiments_list) {
									condiments.setDetay(dizi[2]);
									condiments.setKategoriAdi(dizi[1]);
								}
							}
							else if (Integer.parseInt(dizi[0]) == 3) {
								for (Confections_2207 confections : confections_list) {
									confections.setDetay(dizi[2]);
									confections.setKategoriAdi(dizi[1]);
								}
							}
							else if (Integer.parseInt(dizi[0]) == 4) {
								for (DairyProducts_2207 dairyProducts : dairy_products_list) {
									dairyProducts.setDetay(dizi[2]);
									dairyProducts.setKategoriAdi(dizi[1]);
								}
							}
							else if (Integer.parseInt(dizi[0]) == 5) {
								for (Cereals_2207 grainsCereals : cereals_list) {
									grainsCereals.setDetay(dizi[2]);
									grainsCereals.setKategoriAdi(dizi[1]);
								}
							}
						}
						System.out.println("\n--> Listeler Olusturuldu!");
					}
					
					catch (IOException e) {
						System.err.println("Bir hata olustu-1!");
						e.printStackTrace();
					}
					
					finally {
						try {
							fileReader1.close();
							fileReader2.close();
						} catch (IOException e) {
							System.err.println("Bir hata olustu-2!");
							e.printStackTrace();
						}
					}
			}
}
