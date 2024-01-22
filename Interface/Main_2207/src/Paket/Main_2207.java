package Paket;

import java.awt.desktop.PrintFilesEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.DrbgParameters.NextBytes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Spliterator;

public class Main_2207 {

	public static void main(String[] args) throws IOException {

		String dosyaAdi= "Urunler.txt";
		String dosyaAdi2= "UrunGrubu.txt";
		Scanner input= new Scanner(System.in);
		
		Beverages_2207 beverages=new Beverages_2207();
	    Condiments_2207 condiments=new Condiments_2207();
	    Confections_2207 confections=new Confections_2207();
	    DairyProducts_2207 dairyProducts=new DairyProducts_2207();
	    Cereals_2207 grainsCereals=new Cereals_2207();
		
		ArrayList<Beverages_2207> beveragesList = new ArrayList<Beverages_2207>();
		ArrayList<Condiments_2207> condimentsList = new ArrayList<Condiments_2207>();
		ArrayList<Confections_2207> confectionsList = new ArrayList<Confections_2207>();
		ArrayList<DairyProducts_2207> dairyProductsList = new ArrayList<DairyProducts_2207>();
		ArrayList<Cereals_2207> cerealsList = new ArrayList<Cereals_2207>();
		
		ListeOlustur(beveragesList,condimentsList,confectionsList,dairyProductsList,cerealsList ,dosyaAdi,dosyaAdi2); 
		
		Beverages_2207.ListeyiYazdir(beveragesList);
		Condiments_2207.ListeYazdir(condimentsList);
		Confections_2207.ListeyiYazdir(confectionsList);
		DairyProducts_2207.ListeyiYazdir(dairyProductsList);
		Cereals_2207.ListeyiYazdir(cerealsList);
		
		int kategori=0,kontrol=0;
		while(kategori!=6)
		{
		System.out.print("1-Beverages  \r\n"
						+"2-Condiments \r\n"
						+"3-Confections  \r\n"
						+"4-DairyProducts \r\n"
						+"5-Cereals\n"
						+"6-Cikis\n\n");
		
		System.out.print("Kategori numarasi seciniz:");
		kategori=input.nextInt();
	
		if(kategori>6 || kategori<1)
			System.out.println("hatali secim!!!");
		
		else if(kategori==6)
			return;
		
		else 
			break;
		}
		input.nextLine();
		System.out.print("Islem Yapilacak Urunu Giriniz:");
    	String islemYapilacakUrun=input.nextLine();
		System.out.println( "\n1. UrunStokGuncelle \n"
						  + "2. UrunIsimGuncelle \r\n"
						  + "3. UrunSil \r\n"
						  + "4. YeniUrunEkle \r\n"
						  + "5. UrunFiyatGuncelle \r\n"
						  + "6. UrunKategorikZamYap \r\n"
						  + "7. Cikis");
		System.out.print("Hangi Islemi Yapmak Istiyorsunuz?");
		int Secim = input.nextInt();
		do {
			switch (Secim) {
			case 1:
				kontrol=0;
		    	input.nextLine();
				System.out.print("Urun Girecekseniz true, Urun Alacaksaniz false Giriniz:");
				boolean girisMi=input.nextBoolean();
				
				System.out.println();
				System.out.print("Urun Adedi Giriniz:");
				int adet=input.nextInt();
				
				if(kategori ==1) {
					beverages.UrunStokGuncelle(beveragesList, condimentsList,confectionsList,
							dairyProductsList,cerealsList,kategori, adet, girisMi, islemYapilacakUrun);
				}
				else if(kategori == 2) {
					condiments.UrunStokGuncelle(beveragesList, condimentsList,confectionsList,
							dairyProductsList,cerealsList,kategori, adet, girisMi, islemYapilacakUrun);
				}
				else if(kategori == 3) {
					confections.UrunStokGuncelle(beveragesList, condimentsList,confectionsList, 
							dairyProductsList,cerealsList,kategori, adet, girisMi, islemYapilacakUrun);
				}
				else if(kategori == 4) {
					dairyProducts.UrunStokGuncelle(beveragesList, condimentsList,confectionsList, 
							dairyProductsList,cerealsList,kategori, adet, girisMi, islemYapilacakUrun);
				}
				else if(kategori == 5) {
					grainsCereals.UrunStokGuncelle(beveragesList, condimentsList,confectionsList,
							dairyProductsList,cerealsList,kategori, adet, girisMi, islemYapilacakUrun);
				}
				break;
				
			case 2:
            	kontrol=0;
            	input.nextLine();
            	System.out.println("Degisecek Urunun Yeni Ismini Giriniz:");
		    	String yeniIsim=input.nextLine();
            	System.out.println("Degisecek Urune Yeni Detay Giriniz:");
		    	String yenidetay=input.nextLine();
		    	
				if(kategori ==1) {
					beverages.UrunIsımGuncelle(beveragesList, condimentsList, confectionsList, dairyProductsList, 
							cerealsList, kategori, islemYapilacakUrun, yeniIsim, yenidetay);
				}
				else if(kategori == 2) {
					condiments.UrunIsımGuncelle(beveragesList, condimentsList, confectionsList, dairyProductsList,
							cerealsList, kategori, islemYapilacakUrun, yeniIsim, yenidetay);
				}
				else if(kategori == 3) {
					confections.UrunIsımGuncelle(beveragesList, condimentsList, confectionsList, dairyProductsList, 
							cerealsList, kategori, islemYapilacakUrun, yeniIsim, yenidetay);
				}
				else if(kategori == 4) {
					dairyProducts.UrunIsımGuncelle(beveragesList, condimentsList, confectionsList, dairyProductsList, 
							cerealsList, kategori,islemYapilacakUrun, yeniIsim, yenidetay);
				}
				else if(kategori == 5) {
					grainsCereals.UrunIsımGuncelle(beveragesList, condimentsList, confectionsList, dairyProductsList, 
							cerealsList, kategori, islemYapilacakUrun, yeniIsim, yenidetay);
				}
				break;
				
			case 3:
            	kontrol=0;
				if(kategori == 1) {
					beverages.UrunSil(beveragesList, condimentsList, confectionsList, dairyProductsList, cerealsList, kategori, islemYapilacakUrun);
				}
				else if(kategori == 2) {
					condiments.UrunSil(beveragesList, condimentsList, confectionsList, dairyProductsList, cerealsList, kategori, islemYapilacakUrun);
				}
				else if (kategori == 3) {
					confections.UrunSil(beveragesList, condimentsList, confectionsList, dairyProductsList, cerealsList, kategori, islemYapilacakUrun);
				}
				else if (kategori == 4) {
					dairyProducts.UrunSil(beveragesList, condimentsList, confectionsList, dairyProductsList, cerealsList, kategori, islemYapilacakUrun);
				}
				else if (kategori == 5) {
					grainsCereals.UrunSil(beveragesList, condimentsList, confectionsList, dairyProductsList, cerealsList, kategori, islemYapilacakUrun);
				}
				break;
				
			case 4:
            	kontrol=0;
            	input.nextLine();
            	System.out.print("Yeni Urunun Adi:");
		    	String adi=input.nextLine();
		    	
            	System.out.print("Yeni Urunun Birim Agirligi:");
		    	String birimAgirligi=input.nextLine();
		    	
            	System.out.print("Yeni Urunun Birim Fiyati:");
		    	double birimFiyati= input.nextDouble();
		    	
            	System.out.print("Yeni Urunun Stok Miktari:");
		    	int stokMiktari= input.nextInt();
		    	
            	System.out.print("Yeni Urunun Detay:");
		    	String detay= input.nextLine();

				if(kategori == 1) {
					beverages.YeniUrunEkle(beveragesList, condimentsList, confectionsList, dairyProductsList, cerealsList,
							kategori, adi, birimAgirligi,birimFiyati,stokMiktari,detay);
				}
				else if(kategori == 2) {
					condiments.YeniUrunEkle(beveragesList, condimentsList, confectionsList, dairyProductsList, cerealsList,
							kategori, adi, birimAgirligi, birimFiyati, stokMiktari, detay);
				}
				else if (kategori == 3) {
					confections.YeniUrunEkle(beveragesList, condimentsList, confectionsList, dairyProductsList, cerealsList,
							kategori, adi, birimAgirligi, birimFiyati, stokMiktari, detay);
				}
				else if (kategori == 4) {
					dairyProducts.YeniUrunEkle(beveragesList, condimentsList, confectionsList, dairyProductsList, cerealsList,
							kategori, adi, birimAgirligi, birimFiyati, stokMiktari, detay);
				}
				else if (kategori == 5) {
					grainsCereals.YeniUrunEkle(beveragesList, condimentsList, confectionsList, dairyProductsList, cerealsList,
							kategori, adi, birimAgirligi, birimFiyati, stokMiktari, detay);
				}
				break;
				
			case 5:
            	kontrol=0;
		    	System.out.println("Indirim Yapmak Istiyorsaniz true, Istemiyorsaniz false Giriniz: ");
				boolean indirimMi= input.nextBoolean();
				
	    		System.out.println("Yapmak Istediginiz Orani Giriniz:");
				int oran = input.nextInt();
				
				Urun_2207.UrunFiyatGuncelle(beveragesList, condimentsList, confectionsList, dairyProductsList, cerealsList, kategori, oran, indirimMi, islemYapilacakUrun);
				break;
				
			case 6:
            	kontrol=0;
				 System.out.print("Zam Yapmak Istediginiz Orani Giriniz:");
				int X = input.nextInt();
				Urun_2207.UrunKategorikZamYap(beveragesList, condimentsList, confectionsList, dairyProductsList, cerealsList, kategori, X);
				break;
				
			case 7:
				System.out.println("Cikis Yapildi.");
				return;
				
			default:
				System.out.println("SECTIGINIZ SECENEK BULUNMAMAKTADIR.");
				kontrol=1;
				break;
			}
			if(kontrol==0)
			{
				while(kategori!=6)
				{
				System.out.println("1-Beverages  \r\n"
						+ "2-Condiments \r\n"
						+ "3-Confections  \r\n"
						+ "4-DairyProducts \r\n"
						+ "5-Cereals \r\n"
						+ "6-Cikis");
				System.out.print("Kategori numarasi seciniz:");
				kategori=input.nextInt();
				
				if(kategori>6 || kategori<1)
					System.out.println("hatali secim!!!");
				
				else if(kategori==6)
					return;
				
				else 
					break;
				}
			}
			
			input.nextLine();
			System.out.print("Islem Yapilacak Urunu Giriniz:");
	    	islemYapilacakUrun=input.nextLine();
			System.out.println( "\n1. UrunStokGuncelle \n"
					  + "2. UrunIsimGuncelle \r\n"
					  + "3. UrunSil \r\n"
					  + "4. YeniUrunEkle \r\n"
					  + "5. UrunFiyatGuncelle \r\n"
					  + "6. UrunKategorikZamYap \r\n"
					  + "7. Cikis");
			
			      Secim=input.nextInt();
		}while(Secim!=9);
	}			
		
	private static void ListeOlustur(ArrayList<Beverages_2207> beveragesList, ArrayList<Condiments_2207> condimentsList,
	        ArrayList<Confections_2207> confectionsList, ArrayList<DairyProducts_2207> dairyProductsList,
	        ArrayList<Cereals_2207> cerealsList, String dosyaAdi, String dosyaAdi2) throws IOException {

	    try (BufferedReader okuyucu1 = new BufferedReader(new FileReader(dosyaAdi))) {

	        String satir = okuyucu1.readLine();
	        satir = okuyucu1.readLine(); // ilk satiri atlamasi icin
	        while (satir != null) {

	            String[] Dizi = satir.split("\t");

	            try (BufferedReader okuyucu2 = new BufferedReader(new FileReader(dosyaAdi2))) {
	                String satir2 = okuyucu2.readLine();
	                satir2 = okuyucu2.readLine();

	                while (satir2 != null) {
	                    String[] Dizi2 = satir2.split("\t");

	                    if (Integer.valueOf(Dizi[1]) == Integer.valueOf(Dizi2[0])) {

	                        if (Integer.valueOf(Dizi2[0]) == 1) {
	                            Beverages_2207 beverages = new Beverages_2207(Dizi[0], Integer.valueOf(Dizi[1]), Dizi[2],
	                                    Double.valueOf(Dizi[3]), Integer.valueOf(Dizi[4]), Dizi2[1], Dizi2[2], 1);
	                            
	                            beveragesList.add(beverages);     
	                        }	
	                        
	                        else if (Integer.valueOf(Dizi2[0]) == 2) {
	                            Condiments_2207 condiments = new Condiments_2207(Dizi[0], Integer.valueOf(Dizi[1]), Dizi[2],
	                                    Double.valueOf(Dizi[3]), Integer.valueOf(Dizi[4]), Dizi2[1], Dizi2[2], 2);
	                            
	                            condimentsList.add(condiments);
	                        }
	                        
	                        else if (Integer.valueOf(Dizi2[0]) == 3) {
	                            Confections_2207 confections = new Confections_2207(Dizi[0], Integer.valueOf(Dizi[1]), Dizi[2],
	                                    Double.valueOf(Dizi[3]), Integer.valueOf(Dizi[4]), Dizi2[1], Dizi2[2], 3);
	                            
	                            confectionsList.add(confections);
	                        }
	                        
	                        else if (Integer.valueOf(Dizi2[0]) == 4) {
	                            DairyProducts_2207 dairyProducts = new DairyProducts_2207(Dizi[0], Integer.valueOf(Dizi[1]),
	                                    Dizi[2], Double.valueOf(Dizi[3]), Integer.valueOf(Dizi[4]), Dizi2[1], Dizi2[2], 4);
	                            
	                            dairyProductsList.add(dairyProducts);
	                        }
	                        
	                        else if (Integer.valueOf(Dizi2[0]) == 5) {
	                            Cereals_2207 cereals = new Cereals_2207(Dizi[0], Integer.valueOf(Dizi[1]), Dizi[2],
	                                    Double.valueOf(Dizi[3]), Integer.valueOf(Dizi[4]), Dizi2[1], Dizi2[2], 5);
	                            
	                            cerealsList.add(cereals);
	                        }
	                    }
	                    satir2 = okuyucu2.readLine();
	                }
	            }
	            satir = okuyucu1.readLine();
	        }
	    }
	    catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}
