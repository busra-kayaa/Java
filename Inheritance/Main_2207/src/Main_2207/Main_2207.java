package Main_2207;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main_2207 {
	public static void main(String[] args) throws IOException {
		
		ArrayList<Beverages_2207> beveragesList = new ArrayList<>();
		ArrayList<Condiments_2207> condimentsList = new ArrayList<>();
		ArrayList<Confections_2207> confectionsList = new ArrayList<>();
		ArrayList<DairyProducts_2207> dairyProductsList = new ArrayList<>();
		ArrayList<Cereals_2207> cerealsList = new ArrayList<>();
		
		String kategoriAdi1= null;
		String detay1=null;
		String kategoriAdi2=null;
		String detay2=null;
		String kategoriAdi3=null;
		String detay3=null;
		String kategoriAdi4=null;
		String detay4=null;
		String kategoriAdi5=null;
		String detay5=null;
		
		FileReader okuyucu = new FileReader("UrunGrubu.txt");
		try (BufferedReader buffer = new BufferedReader(okuyucu)) {
			String satir = buffer.readLine();
			while (satir != null) {
				String[] dizi = satir.split("\t");

				if (Integer.valueOf(dizi[0]) == 1) {
					kategoriAdi1 = dizi[1];
					detay1 = dizi[2];
				} else if (Integer.valueOf(dizi[0]) == 2) {
					kategoriAdi2 = dizi[1];
					detay2 = dizi[2];
				} else if (Integer.valueOf(dizi[0]) == 3) {
					kategoriAdi3 = dizi[1];
					detay3 = dizi[2];
				} else if (Integer.valueOf(dizi[0]) == 4) {
					kategoriAdi4 = dizi[1];
					detay4 = dizi[2];
				} else if (Integer.valueOf(dizi[0]) == 5) {
					kategoriAdi5 = dizi[1];
					detay5 = dizi[2];
				}
				satir = buffer.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		FileReader okuyucu1= new FileReader("Urunler.txt");
		try( BufferedReader buffer = new BufferedReader(okuyucu1)) {
			String satir =buffer.readLine();
			while(satir!= null) {
				String[] dizi = satir.split("\t");
				
				if(Integer.valueOf(dizi[1])==1) {
					Beverages_2207 beverages = new Beverages_2207();
					beverages.adi=dizi[0];
					beverages.kategoriIndex=Integer.valueOf(dizi[1]);
					beverages.birimAgirligi=dizi[2];
					beverages.birimFiyat=Double.valueOf(dizi[3]);
					beverages.stokMiktari=Integer.valueOf(dizi[4]);
					beverages.kategoriAdi=kategoriAdi1;
					beverages.detay=detay1;
					beveragesList.add(beverages);
				}
				else if (Integer.valueOf(dizi[1])==2) {
					Condiments_2207 condiments = new Condiments_2207();
					condiments.adi=dizi[0];
					condiments.kategoriIndex=Integer.valueOf(dizi[1]);
					condiments.birimAgirligi=dizi[2];
					condiments.birimFiyat=Double.valueOf(dizi[3]);
					condiments.stokMiktari=Integer.valueOf(dizi[4]);
					condiments.kategoriAdi=kategoriAdi2;
					condiments.detay=detay2;
					condimentsList.add(condiments);
					
				}
				else if (Integer.valueOf(dizi[1])==3) {
					Confections_2207 confections = new Confections_2207();
					confections.adi=dizi[0];
					confections.kategoriIndex=Integer.valueOf(dizi[1]);
					confections.birimAgirligi=dizi[2];
					confections.birimFiyat=Double.valueOf(dizi[3]);
					confections.stokMiktari=Integer.valueOf(dizi[4]);
					confections.kategoriAdi=kategoriAdi3;
					confections.detay=detay3;
					confectionsList.add(confections);
					
				}
				else if (Integer.valueOf(dizi[1])==4) {
					DairyProducts_2207 dairyProducts = new DairyProducts_2207();
					dairyProducts.adi=dizi[0];
					dairyProducts.kategoriIndex=Integer.valueOf(dizi[1]);
					dairyProducts.birimAgirligi=dizi[2];
					dairyProducts.birimFiyat=Double.valueOf(dizi[3]);
					dairyProducts.stokMiktari=Integer.valueOf(dizi[4]);
					dairyProducts.kategoriAdi=kategoriAdi4;
					dairyProducts.detay=detay4;
					dairyProductsList.add(dairyProducts);
						
				}
				else if (Integer.valueOf(dizi[1])==5) {
					Cereals_2207 cereals = new Cereals_2207();
					cereals.adi=dizi[0];
					cereals.kategoriIndex=Integer.valueOf(dizi[1]);
					cereals.birimAgirligi=dizi[2];
					cereals.birimFiyat=Double.valueOf(dizi[3]);
					cereals.stokMiktari=Integer.valueOf(dizi[4]);
					cereals.kategoriAdi=kategoriAdi5;
					cereals.detay=detay5;
					cerealsList.add(cereals);
				}
				satir = buffer.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		String dosyaAdi="Urunler.txt";
		Scanner girdi= new Scanner(System.in);
		boolean kontrol = true;
		while(kontrol) {
			System.out.println("\n Yapmak istediginiz islemi seciniz:\n");
			System.out.println(""
					+ " 1: Stok Miktarina Gore Urun Fiyatlari Guncelle\n"
					+ " 2: Urun Zam Yap\n"
					+ " 3. Icecek Stoklarini Guncelle\n"
					+ " 4. Cesni Birim Agirlik Guncelle\n"
					+ " 5. Sekerleme Detay Ekle\n"
					+ " 6. Sut Urunlerini Sil\n"
					+ " 7. Tahil Urun Ekle\n");
			int secim = girdi.nextInt();
			ArrayList <Urun_2207> urunList= ListeOlustur(dosyaAdi);
			switch (secim) {
			case 1: 

				System.out.print("Stok miktari giriniz:");
				int stokAdedi = girdi.nextInt();
				System.out.print("Urunun yeni fiyatini giriniz:");
				Double guncelFiyat = girdi.nextDouble();
				//System.out.println("\nUrun Listesi :");
				//ListeYazdir(urunList);
				Urun_2207.StokMiktarinaGoreUrunFiyatlariGuncelle(stokAdedi, guncelFiyat,urunList);
				System.out.println("\nFiyati Guncel Urun Listesi :");
				ListeYazdir(urunList);
				break;
				
			case 2:
				System.out.print("En dusuk fiyata sahip urune ne kadar zam yapacaksiniz: ");
				int X = girdi.nextInt();
				Urun_2207.UrunZamYap(X,urunList);
				System.out.println("\nZamlanmis Urun Listesi :\n");
				ListeYazdir(urunList);
				break;
				
			case 3:
				System.out.println("\nIcecek Listesi\n");
				Beverages_2207.BeveragesListGoster(beveragesList);
				System.out.print("\nDegisim miktarini giriniz :");
				int miktar = girdi.nextInt();
				Beverages_2207.TumIceceklerStokGuncelle(miktar, beveragesList);
			
				break;
				
			case 4:
				System.out.println("\nCesni Listesi\n");
				Condiments_2207.CondimentsListGoster(condimentsList);
				System.out.print("\nKacinci cesni nesnesi guncellensin :");
				int N = girdi.nextInt();
				System.out.print("\nCesninin yeni agirligini giriniz: ");
				String yeniAgirlik = girdi.next();
				Condiments_2207.CesniBirimAgirlikGuncelle(N, yeniAgirlik,condimentsList);
				System.out.println("\n\nGuncel Cesni Listesi\n");
				Condiments_2207.CondimentsListGoster(condimentsList);
				break;
				
			case 5:
				System.out.println("\nSekerleme Listesi");
				Confections_2207.ConfectionsListGoster(confectionsList);
				System.out.print("\nHangi isme detay eklemek istiyorsunuz?");
				String adi = girdi.next();
				System.out.print("Seker kategorisine eklemek istediginiz detayi giriniz: ");
				String yeniDetay = girdi.next();
				Confections_2207.SekerlemeDetayEkle(adi, yeniDetay, confectionsList);
				System.out.println("\n\nGuncel Sekerleme Listesi");
				Confections_2207.ConfectionsListGoster(confectionsList);
				break;
				
			case 6:
				System.out.println("\n\nSut Listesi\n");
				DairyProducts_2207.DairyProductsListGoster(dairyProductsList);
				System.out.print("\nmin fiyat giriniz:");
				int minFiyat = girdi.nextInt();
				System.out.print("max fiyat giriniz:");
				int maxFiyat = girdi.nextInt();
				DairyProducts_2207.SutUrunuSil(minFiyat,maxFiyat,dairyProductsList);
				System.out.println("\n\nGuncel Sut Listesi\n");
				DairyProducts_2207.DairyProductsListGoster(dairyProductsList);

				break;
				
			case 7:
				System.out.println("\n\nTahil Listesi");
				Cereals_2207.CerealsListGoster(cerealsList);	
				System.out.print("\nEklemek istediginiz tahilin adini giriniz: ");
				String Adi = girdi.next();
				System.out.print("Eklemek istediginiz tahilin birim agirligini giriniz:");
				String BirimAgirligi = girdi.next();
				System.out.print("Eklemek istediginiz tahilin birim fiyatini giriniz: ");
				Double BirimFiyati = girdi.nextDouble();
				System.out.print("Eklemek istediginiz tahilin stok miktarini giriniz: ");
				int StokMiktari = girdi.nextInt();
				Cereals_2207.TahilUrunEkle(Adi, BirimAgirligi, BirimFiyati, StokMiktari,cerealsList);
				System.out.println("\n\nGuncel Tahil Listesi");
				Cereals_2207.CerealsListGoster(cerealsList);	
				break;
				
			case 8:
				System.out.println("CIKIS YAPILDI.");
				kontrol = false;
				break;
				
			default:
				System.out.println("Hatali bir sayi girdiniz ");
			}
		}
	}
	static ArrayList<Urun_2207> ListeOlustur(String dosyaAdi) throws FileNotFoundException {
	ArrayList<Urun_2207> urunList = new ArrayList<>();
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
			Urun_2207 yeni= new Urun_2207();
			String[] dizi= line.split("\t");
			yeni.adi=dizi[0];
			yeni.kategoriIndex= Integer.valueOf(dizi[1]);
			yeni.birimAgirligi= dizi[2];
			yeni.birimFiyat= Double.valueOf(dizi[3]);
			yeni.stokMiktari= Integer.valueOf(dizi[4]);
		
			urunList.add(yeni);				
		}
		
	}
	catch (IOException e) {
		System.err.println("Bir hata olustu!");
		e.printStackTrace();
	}
	return urunList;
}
	static void ListeYazdir(ArrayList<Urun_2207> urunList) {
		for (Urun_2207 urun : urunList) {
			System.out.println(""+urun.adi+
					"\t"+urun.kategoriIndex+
					"\t"+urun.birimAgirligi+
					"\t"+urun.birimFiyat+
					"\t"+urun.stokMiktari);
		}
	}
	
}