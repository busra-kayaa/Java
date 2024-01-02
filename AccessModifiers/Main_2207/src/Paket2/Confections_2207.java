package Paket2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Confections_2207 extends Urun_2207{
	private String KategoriAdi;
	private String Detay;

	public Confections_2207(String adi, int kategori_index, String birim_agirligi, Double birim_fiyat, int stok_miktari) {
		super(adi, kategori_index, birim_agirligi, birim_fiyat, stok_miktari);
	}

	public static void SekerlemeUrunEkleF(ArrayList<Confections_2207> confections_list) {
		SekerlemeUrunEkleFE(confections_list);
	}

	protected static void SekerlemeUrunEkleFE (ArrayList<Confections_2207> confections_list){
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nEklencek olan urunun adini giriniz: ");
		String adi = input.nextLine();
		System.out.print("Birim agirligini girin: ");
		String agirlik = input.nextLine();
		System.out.print("Birim fiyati girin: ");
		Double fiyat = input.nextDouble();
		System.out.print("Stok miktarini girin: ");
		int miktar = input.nextInt();
		
		int kategori_index = 0;
		String kategori_adi = null;
		String detay = null;
		// Dosyadan; detay, kategori adi ve kategori index'i okunuyor.
				File file = new File("UrunGrubu.txt");
				FileReader filereader = null;
				try {
					filereader = new FileReader(file);
					BufferedReader bf = new BufferedReader(filereader);
					String satir = bf.readLine();
					
					while ((satir = bf.readLine()) != null) {
						String[] dizi = satir.split("\t",3);
						
						if (Integer.valueOf(dizi[0]) == 3) {
							kategori_index = Integer.valueOf(dizi[0]);
							kategori_adi = dizi[1];
							detay = dizi[2];
							break;
						}
					}
					
					confections_list.add(new Confections_2207(adi, kategori_index, agirlik, fiyat, miktar));
					confections_list.get(confections_list.size()-1).setKategoriAdi(kategori_adi);
					confections_list.get(confections_list.size()-1).setDetay(detay);
					System.out.println("\n\n Guncellenen Sekerleme listesi:");
					System.out.println("(Format: Adi,Kategori indeksi, Birim Ağırlığı, Birim Fiyatı, Stok Miktarı)");
					for (Confections_2207 confections : confections_list) {
						System.out.println("- " + confections.getAdi() + " \t"
								+ confections.getKategoriIndex() + " \t"
								+ confections.getBirimAgirligi() + " \t" 
								+ confections.getBirimFiyatı() + " \t" 
								+ confections.getStokMiktari());
					}
					System.out.println();
				}
				catch (IOException e) {
					System.err.println("Bir hata olustu!");
					e.printStackTrace();
				}

				finally {
					try {
						filereader.close();
					} catch (IOException e) {
						System.err.println("FileReader kapatilamadi!");
						e.printStackTrace();
					}
				}
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
