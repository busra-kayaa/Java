package Main_2207;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Main {	
	static boolean liste_olustu = false;

	public static void main(String[] args) throws FileNotFoundException {
			
		Scanner input = new Scanner(System.in);
		String dosyaAdi="Urunler.txt";
		
		while (true) {
			System.out.println("\n\n[1] Liste Olustur / Liste Yazdir\n[2] Yeni Kategori Liste Olustur\n[3] Birim Fiyat Guncelle\n[4] Stok Guncelle\n[5] Urun sil\n[6] Cikis");
			System.out.print("Islem Numarasi Giriniz:");
			int islem = input.nextInt();
			ArrayList <Urun> urunList= ListeOlustur(dosyaAdi);

			if (islem == 1) {
				ListeYazdir(urunList);
			    liste_olustu = true;
			}
			else if (islem == 2) {
				if (liste_olustu == false) {
					System.out.println("\n--> Oncelikle bir liste Olusturun!");
					}
				
				else { 
					int N;
					do {
						System.out.println("N giriniz:");
						Scanner giris= new Scanner(System.in);
						 N = giris.nextInt();
					}while(N>=6);
					
					YeniKategoriListeOlustur(urunList,N);
				}
			}
			else if (islem == 3) {
				int x;
				if (liste_olustu == false) System.out.println("\n--> Oncelikle bir liste olusturun!");
				else {
			
					System.out.print("% kac zam/indirim yapilsin: ");
					 x = input.nextInt();
					 BirimFiyatDegistir(x, urunList); // 1. kategori indexinde bulunan en ucuz/pahalı ürüne %10 zam/indirim yapıyor.
					}
					
				}

			else if (islem == 4) {
				if (liste_olustu == true) {
					StokGuncelleVeUrunEkle(urunList);
				}
				else System.out.println("\n--> Oncelikle bir liste olusturunuz!");
			}
			else if (islem == 5) {
				if (liste_olustu == true) {
					UrunSil(urunList);
				}
				else System.out.println("\n--> Oncelikle Bir Liste Olusturunuz!");
			}
			
			else if (islem == 6) {
				System.out.println("\nProgram Kapatildi...");
				break;
			}
			else System.out.println("\nHatali bir giris yaptiniz!");
		}		
	}	 
		 static void UrunSil(ArrayList<Urun> urunList) {
		        int stok1 = 0, stok2 = 0, stok3 = 0, stok4 = 0, stok5 = 0;
		        // Kategorilere göre toplam stok miktarlarını hesapla
		        for (Urun nesne : urunList) {
		            switch (nesne.KategoriIndex) {
		                case 1:
		                    stok1 += nesne.StokMiktari;
		                    break;
		                case 2:
		                    stok2 += nesne.StokMiktari;
		                    break;
		                case 3:
		                    stok3 += nesne.StokMiktari;
		                    break;
		                case 4:
		                    stok4 += nesne.StokMiktari;
		                    break;
		                case 5:
		                    stok5 += nesne.StokMiktari;
		                    break;
		            }
		        }

		        int[] stokDizi = {stok1, stok2, stok3, stok4, stok5};
		        int minIndex = 0;

		        for (int i = 1; i < stokDizi.length; i++) {
		            if (stokDizi[i] < stokDizi[minIndex]) {
		                minIndex = i;
		            }
		        }
		        ArrayList<Double> birimFiyat = new ArrayList<>();
		        for (Urun nesne : urunList) {
		            if (nesne.KategoriIndex == (minIndex + 1)) {
		                birimFiyat.add(nesne.BirimFiyatı);
		            }
		        }
		        // Birim fiyatları sırala
		        Collections.sort(birimFiyat);

		        // En yüksek birim fiyatlı ürünü sil
		        Iterator<Urun> iterator = urunList.iterator();
		        while (iterator.hasNext()) {
		            Urun nesne = iterator.next();
		            if (nesne.KategoriIndex == (minIndex + 1) && nesne.BirimFiyatı.equals(birimFiyat.get(birimFiyat.size() - 1))) {
		            	System.out.println("Silinen Adi "+ nesne.Adi);
		                iterator.remove();
		                break; // Sadece en yüksek birim fiyatlı ürünü sil, diğerlerine dokunma
		            }
		        }

		        System.out.println("Guncel Liste:");
		        for (Urun urun : urunList) {
		            System.out.println("Adi: " + urun.Adi + ", Kategori Index: " + urun.KategoriIndex + ", Stok Miktari: " + urun.StokMiktari);
		        }
		    }

		    static void StokGuncelleVeUrunEkle(ArrayList<Urun> urunList) {
		        int stok1 = 0, stok2 = 0, stok3 = 0, stok4 = 0, stok5 = 0;

		        Scanner scanner = new Scanner(System.in);
		        
		        // Kategorilere göre toplam stok miktarlarını hesapla
		        for (Urun nesne : urunList) {
		            switch (nesne.KategoriIndex) {
		                case 1:
		                    stok1 += nesne.StokMiktari;
		                    break;
		                case 2:
		                    stok2 += nesne.StokMiktari;
		                    break;
		                case 3:
		                    stok3 += nesne.StokMiktari;
		                    break;
		                case 4:
		                    stok4 += nesne.StokMiktari;
		                    break;
		                case 5:
		                    stok5 += nesne.StokMiktari;
		                    break;
		            }
		        }

		        System.out.println("Stok1: "+ stok1 + " Stok2: " + stok2 + " Stok3: " + stok3 + " Stok4: " + stok4 + " Stok5: " + stok5);

		        int[] stokDizi = {stok1, stok2, stok3, stok4, stok5};
		        int enbuyuk = stokDizi[0];
		        int enkucuk = stokDizi[0];
		        int minIndex = 0;

		        for (int i = 1; i < stokDizi.length; i++) {
		            if (stokDizi[i] > enbuyuk) {
		            	enbuyuk = stokDizi[i];
		            }
		            if (stokDizi[i] < enkucuk) {
		            	enkucuk = stokDizi[i];
		                minIndex = i;
		            }
		        }
		        System.out.print(enbuyuk + " - " + enkucuk);
		        int fark = enbuyuk - enkucuk;
		        System.out.print(" = "+fark);

		        Urun yeni = new Urun();
		        System.out.println("\nAdini giriniz:");
		        yeni.Adi = scanner.nextLine();
		        yeni.KategoriIndex = minIndex+1;

		        System.out.println("Birim agirlik giriniz:");
		        String agirlik = scanner.nextLine();
		        yeni.BirimAgirligi = agirlik;

		        System.out.println("Fiyat giriniz:");
		        yeni.BirimFiyatı = scanner.nextDouble();

		        yeni.StokMiktari = fark;
		        urunList.add(yeni);
		        
		        ListeYazdir(urunList);
		    }

	
	static void BirimFiyatDegistir(int x, ArrayList<Urun> urunList) {
		// index 1 azalt !
				System.out.println("\n\nZam ve Indirim uygulandi:");
				Double enkucuk_fiyat = Double.MAX_VALUE;
				int enkucuk_index = 0;
				for (int i = 1; i < urunList.size(); i++) {
						if (urunList.get(i).BirimFiyatı() < enkucuk_fiyat) {
							enkucuk_fiyat = urunList.get(i).BirimFiyatı();
							enkucuk_index = i;
					}
				}
				String isim1 = urunList.get(enkucuk_index).getAdi();
				Double fiyat1 = urunList.get(enkucuk_index).getBirimFiyatı();
				Double zam = (fiyat1 * x) / 100;
				Double fiyat12 = fiyat1 + zam;
				urunList.get(enkucuk_index).setBirimFiyatı(fiyat12);
				
				
				Double enbuyuk_fiyat = Double.MIN_VALUE;
				int enbuyuk_index = 0;
				for (int i = 1; i < urunList.size(); i++) {
						if (urunList.get(i).getBirimFiyatı() > enbuyuk_fiyat) {
							enbuyuk_fiyat = urunList.get(i).getBirimFiyatı();
							enbuyuk_index = i;
						}
				}
				String isim2 = urunList.get(enbuyuk_index).getAdi();
				Double fiyat2 = urunList.get(enbuyuk_index).getBirimFiyatı();
				Double indirim = (fiyat2 * x) / 100;
				Double fiyat21 = fiyat2 - indirim;
				urunList.get(enbuyuk_index).setBirimFiyatı(fiyat2);
				
				System.out.println("\n"  + isim1 + "' isimli urune %" + x + " zam yapildi: " + fiyat1 + " --> " + fiyat12);
				System.out.println("\n" + isim2 + "' isimli urune %" + x + " indirim yapildi: " + fiyat2 + " --> " + fiyat21);
				
	}
	static void YeniKategoriListeOlustur(ArrayList<Urun> urunList,int N) {
			ArrayList<Kategori> kategori_list = new ArrayList<>();
			System.out.println("\nHangi kategori index'inde kac  tane urun oldugu gosteriliyor:");
			int a=1;
			int[] dizi = new int[6];
			
			for(int j=1;j<6;j++,a++){
				dizi[a]=0;
				for(int i=0; i<urunList.size();i++) {
					if(j==urunList.get(i).getKategoriIndex()) {
						dizi[a]++;
					}
				}
				kategori_list.add(new Kategori(a,dizi[a]));
			}
			Collections.sort(kategori_list,Comparator.comparing(Kategori::getAdet).reversed());

			System.out.println("\nIndex   Adet");
			for (int i = 0; i <N; i++) {
				System.out.println("  " + kategori_list.get(i).getIndex() + "      " + kategori_list.get(i).getAdet());
			}

	}
	 
	static ArrayList<Urun> ListeOlustur(String dosyaAdi) throws FileNotFoundException {
		ArrayList<Urun> urunList = new ArrayList<>();
		FileReader fileReader= new FileReader(dosyaAdi);
		BufferedReader bufferedReader= new BufferedReader(fileReader);
		String line= null;
		try {
			while(true) 
			{
				line = bufferedReader.readLine();
				if(line==null)
				{
					break;
				}
				
				Urun yeni= new Urun();
				String[] dizi= line.split("\t");
				yeni.Adi=dizi[0];
				yeni.KategoriIndex= Integer.valueOf(dizi[1]);
				yeni.BirimAgirligi= dizi[2];
				yeni.BirimFiyatı= Double.valueOf(dizi[3]);
				yeni.StokMiktari= Integer.valueOf(dizi[4]);
			
				urunList.add(yeni);				
			}
			
		}
		catch (IOException e) {
			System.err.println("Bir hata olustu!");
			e.printStackTrace();
		}
		return urunList;
	}
	
	static void ListeYazdir(ArrayList<Urun> urunList) {
		for (Urun urun : urunList) {
			System.out.println("\n"+urun.Adi+
					" "+urun.KategoriIndex+
					" "+urun.BirimAgirligi+
					" "+urun.BirimFiyatı+
					" "+urun.StokMiktari);
		}
	}
}	

