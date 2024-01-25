package paket;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import paket.Urun.Beverages;
import paket.Urun.Cereals;
import paket.Urun.Condiments;
import paket.Urun.Confections;
import paket.Urun.DairyProducts;

public class DosyaIslemleri {

		public static class DosyaOkuma {
			
			public static void ListeleriOlustur(ArrayList<Beverages> beveragesList, ArrayList<Condiments> condimentsList,
					ArrayList<Confections> confectionsList,ArrayList<DairyProducts> dairyProductsList, ArrayList<Cereals> cerealsList, String file ,String file2) throws IOException {
				
				try (BufferedReader okuyucu = new BufferedReader(new FileReader(file))){
					
					String satir= okuyucu.readLine();
					satir = okuyucu.readLine();

					while(satir!=null) {
						String[] dizi= satir.split("\t");
						
						BufferedReader okuyucu2= new BufferedReader(new FileReader(file2));
						String satir2= okuyucu2.readLine();
						satir2= okuyucu2.readLine();

						while(satir2!= null) {
							String[] dizi2= satir2.split("\t");
							
							if(Integer.valueOf(dizi[1])== Integer.valueOf(dizi2[0])) {
								if(Integer.valueOf(dizi2[0])==1) {
									
									Beverages yeniBeverages = new Beverages(dizi[0], Integer.valueOf(dizi[1]), dizi[2],
																			Double.valueOf(dizi[3]),Integer.valueOf(dizi[4]) , dizi2[1],dizi2[2]);
									
									beveragesList.add(yeniBeverages);
								}
								
								else if(Integer.valueOf(dizi2[0])==2) {
									Condiments yeniCondiments = new Condiments(dizi[0], Integer.valueOf(dizi[1]), dizi[2],
											Double.valueOf(dizi[3]),Integer.valueOf(dizi[4]) , dizi2[1],dizi2[2]);
	
									condimentsList.add(yeniCondiments);									
								}
								
								else if(Integer.valueOf(dizi2[0])==3) {
									Confections yeniConfections = new Confections(dizi[0], Integer.valueOf(dizi[1]), dizi[2],
											Double.valueOf(dizi[3]),Integer.valueOf(dizi[4]) , dizi2[1],dizi2[2]);
	
									confectionsList.add(yeniConfections);
								}
								
								else if(Integer.valueOf(dizi2[0])==4) {
									DairyProducts yeniDairyProducts = new DairyProducts(dizi[0], Integer.valueOf(dizi[1]), dizi[2],
											Double.valueOf(dizi[3]),Integer.valueOf(dizi[4]) , dizi2[1],dizi2[2]);
	
									dairyProductsList.add(yeniDairyProducts);
								}
								
								else if(Integer.valueOf(dizi2[0])==5) {
									Cereals yeniCereals = new Cereals(dizi[0], Integer.valueOf(dizi[1]), dizi[2],
											Double.valueOf(dizi[3]),Integer.valueOf(dizi[4]) , dizi2[1],dizi2[2]);
	
									cerealsList.add(yeniCereals);
								}
							}
							satir2= okuyucu2.readLine();
						}
						satir = okuyucu.readLine();
					}
				} 
				
				catch (Exception e) {
					System.err.println("Bir hata olustu!");
					e.printStackTrace();
				}
			}
		}
		
		public static class DosyayaYazma {
			
			public static void ListeyiYaz(ArrayList<Beverages> beveragesList, ArrayList<Condiments> condimentsList, ArrayList<Confections> confectionsList,
					ArrayList<DairyProducts> dairyProductsList, ArrayList<Cereals> cerealsList, String file3) throws IOException {
				
				FileWriter fWriter = new FileWriter(file3);
				for (Beverages urun : beveragesList) {
					
					fWriter.write(urun.Adi);
					fWriter.write("\t");
					fWriter.write(String.valueOf(urun.KategoriIndex));
					fWriter.write("\t");
					fWriter.write(urun.BirimAgirligi);
					fWriter.write("\t");
					fWriter.write(String.valueOf(urun.BirimFiyati));
					fWriter.write("\t");
					fWriter.write(String.valueOf(urun.StokMiktari));
					fWriter.write("\n");

				}
				
				for (Condiments urun : condimentsList) {

					fWriter.write(urun.Adi);
					fWriter.write("\t");
					fWriter.write(String.valueOf(urun.KategoriIndex));
					fWriter.write("\t");
					fWriter.write(urun.BirimAgirligi);
					fWriter.write("\t");
					fWriter.write(String.valueOf(urun.BirimFiyati));
					fWriter.write("\t");
					fWriter.write(String.valueOf(urun.StokMiktari));
					fWriter.write("\n");

				}
				
				for (Confections urun : confectionsList) {

					fWriter.write(urun.Adi);
					fWriter.write("\t");
					fWriter.write(String.valueOf(urun.KategoriIndex));
					fWriter.write("\t");
					fWriter.write(urun.BirimAgirligi);
					fWriter.write("\t");
					fWriter.write(String.valueOf(urun.BirimFiyati));
					fWriter.write("\t");
					fWriter.write(String.valueOf(urun.StokMiktari));
					fWriter.write("\n");

				}
				
				for (DairyProducts urun : dairyProductsList) {

					fWriter.write(urun.Adi);
					fWriter.write("\t");
					fWriter.write(String.valueOf(urun.KategoriIndex));
					fWriter.write("\t");
					fWriter.write(urun.BirimAgirligi);
					fWriter.write("\t");
					fWriter.write(String.valueOf(urun.BirimFiyati));
					fWriter.write("\t");
					fWriter.write(String.valueOf(urun.StokMiktari));
					fWriter.write("\n");

				}
				
				for (Cereals urun : cerealsList) {

					fWriter.write(urun.Adi);
					fWriter.write("\t");
					fWriter.write(String.valueOf(urun.KategoriIndex));
					fWriter.write("\t");
					fWriter.write(urun.BirimAgirligi);
					fWriter.write("\t");
					fWriter.write(String.valueOf(urun.BirimFiyati));
					fWriter.write("\t");
					fWriter.write(String.valueOf(urun.StokMiktari));
					fWriter.write("\n");

				}
				fWriter.close();
			}
		}
}
