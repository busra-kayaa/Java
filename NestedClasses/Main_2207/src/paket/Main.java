package paket;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import paket.Urun.Beverages;

public class Main {

	public static void main(String[] args) throws IOException {
			
		Scanner input = new Scanner(System.in);
		String fileString = "Urunler.txt";
		String file2String = "UrunGrubu.txt";
		String file3String = "File.txt";

		
		ArrayList<Urun.Beverages> beveragesList = new ArrayList<Urun.Beverages>();
		ArrayList<Urun.Condiments> condimentsList = new ArrayList<Urun.Condiments>();
		ArrayList<Urun.Confections> confectionsList = new ArrayList<Urun.Confections>();
		ArrayList<Urun.DairyProducts> dairyProductsList = new ArrayList<Urun.DairyProducts>();
		ArrayList<Urun.Cereals> cerealsList = new ArrayList<Urun.Cereals>();
		
		DosyaIslemleri.DosyaOkuma.ListeleriOlustur(beveragesList, condimentsList,confectionsList,dairyProductsList,cerealsList,fileString,file2String);
		
		Urun.Beverages.ListeyiYazdir(beveragesList);
		Urun.Condiments.ListeyiYazdir(condimentsList);
		Urun.Confections.ListeyiYazdir(confectionsList);
		Urun.DairyProducts.ListeyiYazdir(dairyProductsList);
		Urun.Cereals.ListeyiYazdir(cerealsList);
		
		boolean kontrol =true;
		while(kontrol) {
			
			System.out.println("\nYapmak istediginiz islemi seciniz:\n");
			System.out.println("1: UrunStokGuncelle\n"
							 + "2: UrunKategorikIndirimYap\n"
							 + "3. IcecekUrunuSil\n"
							 + "4. CesniUrunEkle\n"
							 + "5. SekerlemeDetayEkle\n"
							 + "6. SutUrunuStokGuncelle\n"
							 + "7. TahilBirimAgirlikGuncelle\n"
							 + "8. DosyayaYaz\n"
							 + "9. Cikis\n");
			
			int secim = input.nextInt();
			switch (secim) {
			case 1:
				input.nextLine();
				System.out.println("Stogunu guncellemek istediginiz urunun adini giriniz");
		    	String UrunAdi=input.nextLine();
				System.out.print("Urun Girecekseniz true, Urun Alacaksaniz false Giriniz:");
				boolean ekleMi=input.nextBoolean();
				Urun.UrunStokGuncelle(beveragesList,condimentsList,confectionsList,dairyProductsList,cerealsList,UrunAdi,ekleMi);
				break;
				
			case 2:
            	System.out.println("Beverages\nCondiments\nConfections\nDairy Products\nGrains/Cereals");
            	input.nextLine();
            	System.out.print("Yukaridaki kataloglardan Indirim yapmak istediginiz katalog adini giriniz:");
				String KategoriAdi= input.nextLine();
				System.out.println("Yuzde kac indirim yapmak istersiniz?");
				int X= input.nextInt();
				Urun.UrunKategorikIndirimYap(beveragesList,condimentsList,confectionsList,dairyProductsList,cerealsList,KategoriAdi, X);

				break;
				
			case 3:
				Urun.Beverages.ListeyiYazdir(beveragesList);
				input.nextLine();
				System.out.println("Silmek istediginiz urunun adini giriniz:");
				String urunAdi= input.nextLine();
				Urun.Beverages.IcecekUrunuSil(beveragesList, urunAdi);
				break;
				
			case 4:
				input.nextLine();
				System.out.println("Ekleyeceginiz urunun adini giriniz:");
				String Adi =input.nextLine();
				
				System.out.println("Ekleyeceginiz urunun birim agirligini giriniz:");
				String BirimAgirligi=input.nextLine();

				System.out.println("Ekleyeceginiz urunun birim fiyatini giriniz (kusurlu fiyatlar icin virgulle giriniz):");
				double BirimFiyati = input.nextDouble();
				
				System.out.println("Ekleyeceginiz urunun stok miktarini giriniz:");
				int StokMiktari= input.nextInt();
				Urun.Condiments.CesniUrunEkle (condimentsList,Adi, BirimAgirligi, BirimFiyati, StokMiktari);
				break;
				
			case 5:
				input.nextLine();
				System.out.println("Yeni detay giriniz:");
				String detay=input.nextLine();
				
				Urun.Confections.SekerlemeDetayEkle(confectionsList, detay);
				break;
				
			case 6:
				Urun.DairyProducts.ListeyiYazdir(dairyProductsList);
				input.nextLine();
				System.out.println("DairyProducts katalogundan guncellemek istediginiz indexi giriniz");
				int urunIndexi=input.nextInt();
				System.out.println("Satin alacaksaniz 1 satis yapacaksaniz 1 disinda sayi giriniz");
				int islem = input.nextInt();
				System.out.println("Miktar giriniz:");
				int miktar = input.nextInt();

				if(islem==1) {
					Urun.DairyProducts.SutUrunuStokGuncelle (dairyProductsList,urunIndexi,true, miktar);
				}
				else {
					Urun.DairyProducts.SutUrunuStokGuncelle (dairyProductsList,urunIndexi,false, miktar);
				}
				break;
				
			case 7:
				Urun.Cereals.ListeyiYazdir(cerealsList);
				input.nextLine();
				System.out.println("Urunun yeni birim fiyatini giriniz:");
				double yeniFiyat=input.nextDouble();
				Urun.Cereals.TahilBirimAgirlikGuncelle(cerealsList,yeniFiyat);
				break;
				
			case 8:
				System.out.println("Dosyaya Yazma Islemi yapildi");
				DosyaIslemleri.DosyayaYazma.ListeyiYaz(beveragesList, condimentsList,confectionsList,dairyProductsList,cerealsList,file3String);
				break;
				
			case 9:
				System.out.println("Cikis Yapildi.");
				return;

			default:
				System.out.println("Hatali bir SECENEK sectiniz!!");
				break;
			}
		}
	}

}
