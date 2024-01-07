package Paket;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		String dosyaAdi ="Urunler.txt";
		
		ArrayList<Beverages> beveragesList = new ArrayList<Beverages>();
		ArrayList<Condiments> condimentsList = new ArrayList<Condiments>();
		ArrayList<Confections> confectionsList = new ArrayList<Confections>();
		ArrayList<DairyProducts> dairyProductsList = new ArrayList<DairyProducts>();
		ArrayList<Cereals> cerealsList = new ArrayList<Cereals>();
		
		ListeleriOlustur(beveragesList,condimentsList,confectionsList, dairyProductsList,cerealsList, dosyaAdi);
		
		Beverages.ListeYazdir(beveragesList);
		Condiments.ListeYazdir(condimentsList);
		Confections.ListeYazdir(confectionsList);
		DairyProducts.ListeYazdir(dairyProductsList);
		Cereals.ListeYazdir(cerealsList);
		
		System.out.println("1: UrunFiyatGuncelle\r\n"
						 + "2: UrunKategorikZamYap\r\n"
						 + "3: UrunFiyatGuncelle (Beverages)\r\n"
						 + "4: CesniBirimAgirlikGuncelle\r\n"
						 + "5: UrunStokGuncelle (Confections)\r\n"
						 + "6: SutUrunuSil\r\n"
						 + "7: TahilUrunEkle\r\n"
						 + "8: Cikis");
		
		int islem = input.nextInt();
		do {

			switch (islem) {
			
				case 1:
					input.nextLine();
					System.out.println("Stok miktari kontrol edilmeycekse 1 edilecekse 1 disinda bir sayi giriniz:\n");			    	
					int kontrol =input.nextInt();
					
					if(kontrol == 1) { // Stok Miktarı kontrol edilmiyor
						
					   System.out.println(" Urunu % kac zam uygulansin?");
					   int oran = input.nextInt();
					   
					   Urun urunNesne = new Urun();
					   urunNesne.UrunFiyatGuncelle(beveragesList, condimentsList, confectionsList, dairyProductsList, cerealsList, oran);
					}
					else { // Stok miktarı kontrol edilecek
						
						System.out.println(" Urunu % kac zam uygulansin?");
						int oran = input.nextInt();
						
						System.out.println("Mevcut miktarla karsilastirilacak stok miktarini giriniz:");
						int yeniStok= input.nextInt();
						
						Urun.UrunFiyatGuncelle(beveragesList, condimentsList, confectionsList, dairyProductsList, cerealsList, oran, yeniStok);
					}
					
						Beverages.ListeYazdir(beveragesList);
						Condiments.ListeYazdir(condimentsList);
						Confections.ListeYazdir(confectionsList);
						DairyProducts.ListeYazdir(dairyProductsList);
						Cereals.ListeYazdir(cerealsList);
						
					break;
					
				case 2:
					System.out.println("stok kontrol edilmeyecekse 1 edilecekse 1 disinde bir sayi giriniz");
	            	int control=input.nextInt();	
	            	System.out.println("Beverages\nCondiments\nConfections\nDairyProducts\nCereals");
			    	input.nextLine();
			    	System.out.println("Yukaridaki kataloglardan Zam yapmak istediginiz katalog adini giriniz");
			    	String kategoriAdi=input.nextLine();
			    	if(control==1)
			    	{
			    		Urun.UrunKategorikZamYap(beveragesList, condimentsList, confectionsList,
				    			dairyProductsList, cerealsList, kategoriAdi);
			    	}
			    	else
			    	{
			    		System.out.println("stok kontrol sayisini giriniz");
			    		int stokKontrol=input.nextInt();
			    		Urun.UrunKategorikZamYap(beveragesList, condimentsList, confectionsList,
			    				dairyProductsList, cerealsList, kategoriAdi, stokKontrol);
			    	}
					break;
	
				case 3:
					System.out.println(" İceceklere % kac zam uygulansin?");
					int oran = input.nextInt();
					Beverages beverages = new Beverages();
					beverages.UrunFiyatGuncelle(beveragesList, condimentsList, confectionsList, dairyProductsList, cerealsList, oran);
					break;
				
				case 4: 
					Condiments.ListeYazdir(condimentsList);
					input.nextLine();
					System.out.println("yeni agirlik giriniz");
					String yeniAgirlik=input.nextLine();
					System.out.println("listede yer alan en cok stogu guncelleyecek iseniz 1,\n girilen stokMiktarına en yakin olan nesneyi guncelleyecek ise 1 disinda sayi giriniz");
					kontrol=input.nextInt();
					
					if(kontrol==1)
					Condiments.CesniBirimAgirlikGuncelle(condimentsList, yeniAgirlik);
					
					else
					{
						System.out.println("Stok miktari giriniz");
						int stokMiktari=input.nextInt();
					Condiments.CesniBirimAgirlikGuncelle(condimentsList, yeniAgirlik,stokMiktari);	
					}
					break;
					
				case 5:
					input.nextLine();
					System.out.println("urun girisi ise true degilse false giriniz: ");
					boolean girisMi=input.nextBoolean();
					System.out.println("urun stogu giriniz: ");
					int stok=input.nextInt();
					
					Confections confecstionsNesne=new Confections();
					
					confecstionsNesne.UrunStokGuncelle(beveragesList, condimentsList, confectionsList,
							dairyProductsList, cerealsList, stok, girisMi);
					
					break;
				case 6:
					DairyProducts.ListeYazdir(dairyProductsList);
					input.nextLine();
					System.out.println("1- En Az Stoga Sahip Urunu sil\n2- Min-Max Stok Ile Silme\n3- Fiyati Kucukleri Sil");
					int index=input.nextInt();
					if(index==1)
					{
						DairyProducts.SutUrunuSil(dairyProductsList);	
					}
					else if(index==2)
					{
						System.out.println("Min Stok gir");
						int min=input.nextInt();
						System.out.println("Max Stok gir");
						int max=input.nextInt();
						System.out.println("Fiyat gir:");
						Double fiyat=input.nextDouble();
						DairyProducts.SutUrunuSil(dairyProductsList, min, max, fiyat);
					}
					else if(index==3)
					{
						System.out.println("Fiyat gir:");
						Double fiyat=input.nextDouble();
						DairyProducts.SutUrunuSil(dairyProductsList,fiyat );
					}
					else
					{
						System.out.println("hatali secim");
					}
					
					break;
					
				case 7:
					System.out.println("1-TahilUrunEkle(Adi, BirimFiyatı, StokMiktari)\r\n"
									  +"2-TahilUrunEkle(Adi, BirimAgirligi , Detay)");
					int deger = input.nextInt();
					input.nextLine();
					
					System.out.println("urun adini giriniz:");
					String Adi = input.nextLine();
					
					System.out.println("birim fiyat giriniz:");
					double BirimFiyati=input.nextDouble();
					
					System.out.println("birim agirlik giriniz");
					String BirimAgirligi=input.nextLine();
					
					System.out.println("Stok Miktari giriniz");
					int StokMiktari=input.nextInt();
					
					if(deger ==1) {
						Cereals.TahilUrunEkle(cerealsList, Adi, BirimFiyati, StokMiktari);
					}
					else if (deger ==2) {
						input.nextLine();
						System.out.println("Detay Giriniz:");
						String detay= input.nextLine();
						Cereals.TahilUrunEkle(cerealsList, Adi, BirimAgirligi ,BirimFiyati, detay);
					}
					else {
						System.out.println("hatali secim");
					}
					break;
				case 8:
					return;
					
				default:
					System.out.println("Yanlis Bir Secim Yaptiniz!");
					break;
					
			}
			
			System.out.println("1: UrunFiyatGuncelle\r\n"
							 + "2: UrunKategorikZamYap\r\n"
							 + "3: UrunFiyatGuncelle (Beverages)\r\n"
							 + "4: CesniBirimAgirlikGuncelle\r\n"
							 + "5: UrunStokGuncelle (Confections)\r\n"
							 + "6: SutUrunuSil\r\n"
							 + "7: TahilUrunEkle\r\n"
							 + "8: Cikis");
				islem= input.nextInt();
				
		} while (islem!=8);
		
	}

	public static void ListeleriOlustur(ArrayList<Beverages> beveragesList, ArrayList<Condiments> condimentsList,
			ArrayList<Confections> confectionsList, ArrayList<DairyProducts> dairyProductsList, ArrayList<Cereals> cerealsList, String dosyaAdi) throws IOException {
		
		try(BufferedReader okuyucu1 =new BufferedReader(new FileReader(dosyaAdi))) {
			
			String satir = okuyucu1.readLine();
			satir = okuyucu1.readLine();
			
			while(satir!=null) {
				String[] dizi = satir.split("\t");
				
				BufferedReader okuyucu2 = new BufferedReader(new FileReader("UrunGrubu.txt"));
				String satir2 = okuyucu2.readLine();
				satir2 = okuyucu2.readLine(); //ilk satrı atlaması için iki kere 
				
				while(satir2!=null) {
					String[] dizi2 = satir2.split("\t");
					
					if (Integer.valueOf(dizi[1])== Integer.valueOf(dizi2[0])) {
						
						if (Integer.valueOf(dizi2[0]) == 1) {
							Beverages beverages = new Beverages(dizi[0], Integer.valueOf(dizi[1]), dizi[2], Double.valueOf(dizi[3]), Integer.valueOf(dizi[4]), dizi2[1], dizi2[2]);
							beveragesList.add(beverages);
							beverages = null;
						}
						else if(Integer.valueOf(dizi2[0]) == 2) {
							Condiments condiments = new Condiments(dizi[0], Integer.valueOf(dizi[1]), dizi[2], Double.valueOf(dizi[3]), Integer.valueOf(dizi[4]), dizi2[1], dizi2[2]);
							condimentsList.add(condiments);
							condiments = null;
						}
						else if (Integer.valueOf(dizi2[0]) == 3) {
							Confections confections = new Confections(dizi[0], Integer.valueOf(dizi[1]), dizi[2], Double.valueOf(dizi[3]), Integer.valueOf(dizi[4]), dizi2[1], dizi2[2]);			
							confectionsList.add(confections);
							confections = null;
						}
						else if (Integer.valueOf(dizi2[0]) == 4) {
							DairyProducts dairyProducts = new DairyProducts(dizi[0], Integer.valueOf(dizi[1]), dizi[2], Double.valueOf(dizi[3]), Integer.valueOf(dizi[4]), dizi2[1], dizi2[2]);	
							dairyProductsList.add(dairyProducts);
							dairyProducts = null;
						
						}
						else if (Integer.valueOf(dizi2[0]) == 5) {
							Cereals cereals = new Cereals(dizi[0], Integer.valueOf(dizi[1]), dizi[2], Double.valueOf(dizi[3]), Integer.valueOf(dizi[4]), dizi2[1], dizi2[2]);
							cerealsList.add(cereals);
							cereals = null;
						}
						break;
						
					}
					satir2 = okuyucu2.readLine();
				}
				satir = okuyucu1.readLine();
			}

		} catch (Exception e) {
				e.printStackTrace();
		}
	}
}