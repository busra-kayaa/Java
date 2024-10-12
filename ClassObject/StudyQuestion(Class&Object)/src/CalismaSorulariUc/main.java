
package CalismaSorulariUc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.http.WebSocket.Listener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Comparator;

import javax.swing.JSpinner.ListEditor;

import CalismaSorulariUc.Ogrenci;

public class main {

	public static void main(String[] args) throws FileNotFoundException {
		
		 ArrayList<Ogrenci> OgrenciList = OgrenciListeGetir();
	     GecenKalan(OgrenciList);
	     HarfNotuGosterimi(OgrenciList);
	     System.out.println("\nTek Numarali Ogrenciler:");
	     TekCiftGoster(OgrenciList, true); // Tek numaralıları göster
	     System.out.println("\nCift Numarali Ogrenciler:");
	     TekCiftGoster(OgrenciList, false); // Çift numaralıları göster
	     System.out.println("bonus icin bir x degeri giriniz:");
	     Scanner scanner= new Scanner(System.in);
	     Integer x= scanner.nextInt();
	     PuanEkle( OgrenciList, true,  x );
		 ListeYazdir(OgrenciList);
		 System.out.println("Ortalamaya Gore Siralanmis Liste");
		 OrtalamayaGoreSirala(OgrenciList);
		 ListeYazdir(OgrenciList);
		 
		 yeniOgrenci(OgrenciList);
		 ListeYazdir(OgrenciList);

	}
	
	 static ArrayList<Ogrenci> OgrenciListeGetir()throws FileNotFoundException {
	        ArrayList<Ogrenci> OgrenciList = new ArrayList<>();
	     
		FileReader fileReader= new FileReader("Ogrenci.txt");
		BufferedReader bf= new BufferedReader(fileReader);
		String line= null;
		double toplam=0;
		try {
			while(true) 
			{
				line = bf.readLine();
				if(line==null)
					
				{
					break;
				}
				
				Ogrenci yeniOgrenci= new Ogrenci();
				String[] dizi= line.split(" ");
				
				yeniOgrenci.Numara=Integer.valueOf(dizi[0]);
				yeniOgrenci.Adi=dizi[1];
				yeniOgrenci.Vize=Integer.valueOf(dizi[2]);
				yeniOgrenci.Final= Integer.valueOf(dizi[3]);
				yeniOgrenci.Ort= ((double)yeniOgrenci.Vize*0.4)+((double)yeniOgrenci.Final*0.6);
				
				toplam+=yeniOgrenci.Ort;
		
				
				yeniOgrenci.Gectimi= yeniOgrenci.Ort>=50?  true: false;
			
				OgrenciList.add(yeniOgrenci);
				yeniOgrenci=null;
				
				System.out.println(line);
			}
			
			OrtalamaYazdir(OgrenciList,toplam);

		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return OgrenciList;
	}
	 static void TekCiftGoster(ArrayList<Ogrenci> OgrenciList, boolean tekMi) {
	        for (Ogrenci ogrenci : OgrenciList) {
	            if ((ogrenci.Numara % 2 == 1 && tekMi) || (ogrenci.Numara % 2 == 0 && !tekMi)) {
	                System.out.println(ogrenci.Numara + " " + ogrenci.Adi);
	            }
	        }
	    }
	static void ListeYazdir(ArrayList<Ogrenci> OgrenciList){
		for (Ogrenci ogrenci : OgrenciList) {
			System.out.println("\n"+ogrenci.Numara+
					"\t"+ogrenci.Adi+
					"\t"+ogrenci.Vize+
					"\t"+ogrenci.Final+
					"\t"+ogrenci.Ort +
					"\t"+ogrenci.HarfNotu+
					"\t"+ogrenci.Gectimi);
		}
	}
	static void HarfNotuGosterimi(ArrayList<Ogrenci> OgrenciList) {
		System.out.println();
		for(int i=0;i<OgrenciList.size();i++)
		{
			if(OgrenciList.get(i).Ort >=80 && 100 >= OgrenciList.get(i).Ort)
			{
				OgrenciList.get(i).HarfNotu="AA";
				System.out.println(OgrenciList.get(i).Numara+" "
				+OgrenciList.get(i).Adi+" "
				+OgrenciList.get(i).Vize+" "
				+OgrenciList.get(i).Final+" "
				+OgrenciList.get(i).Ort+" "
				+OgrenciList.get(i).HarfNotu);
			}
			
			else if(OgrenciList.get(i).Ort >=70 && 79 >= OgrenciList.get(i).Ort) 
			{
				OgrenciList.get(i).HarfNotu="BB";
				System.out.println(OgrenciList.get(i).Numara+" "
				+OgrenciList.get(i).Adi+" "
				+OgrenciList.get(i).Vize+" "
				+OgrenciList.get(i).Final+" "
				+OgrenciList.get(i).Ort+" "
				+OgrenciList.get(i).HarfNotu);
			}
			else if(OgrenciList.get(i).Ort >=50 && 69>= OgrenciList.get(i).Ort) 
			{
				OgrenciList.get(i).HarfNotu="CC";
				System.out.println(OgrenciList.get(i).Numara+" "
				+OgrenciList.get(i).Adi+" "
				+OgrenciList.get(i).Vize+" "
				+OgrenciList.get(i).Final+" "
				+OgrenciList.get(i).Ort+" "
				+OgrenciList.get(i).HarfNotu);
			}
			else if(OgrenciList.get(i).Ort >=40 && 49 >= OgrenciList.get(i).Ort) 
			{
				OgrenciList.get(i).HarfNotu="DD";
				System.out.println(OgrenciList.get(i).Numara+" "
				+OgrenciList.get(i).Adi+" "
				+OgrenciList.get(i).Vize+" "
				+OgrenciList.get(i).Final+" "
				+OgrenciList.get(i).Ort+" "
				+OgrenciList.get(i).HarfNotu);
			}
			
			else if(OgrenciList.get(i).Ort >=0 && 40 > OgrenciList.get(i).Ort) 
			{
				OgrenciList.get(i).HarfNotu="FF";
				System.out.println(OgrenciList.get(i).Numara+" "
				+OgrenciList.get(i).Adi+" "
				+OgrenciList.get(i).Vize+" "
				+OgrenciList.get(i).Final+" "
				+OgrenciList.get(i).Ort+" "
				+OgrenciList.get(i).HarfNotu);
			}
		}
	}
	static void OrtalamaYazdir(ArrayList<Ogrenci> OgrenciList,double toplam) {
		System.out.println();
		toplam/=OgrenciList.size();
		System.out.println("\nSinif Ortalamasi= "+toplam);
		System.out.println(" \nSinif ortalamasindan buyuk olan ogrenciler");
		for(int i=0;i<OgrenciList.size();i++)
		{
			if( OgrenciList.get(i).Ort > toplam) {
				System.out.println(OgrenciList.get(i).Numara+" "
			    +OgrenciList.get(i).Adi+
				"\t ortalama= "+OgrenciList.get(i).Ort);
			}
		}
		System.out.println(" \nSinif ortalamasindan kucuk olan ogrenciler");
		for(int i=0;i<OgrenciList.size();i++)
		{
			if(toplam > OgrenciList.get(i).Ort ) {
			
				System.out.println(OgrenciList.get(i).Numara+" "
				+OgrenciList.get(i).Adi+
				"\t ortalama= "+OgrenciList.get(i).Ort);
			}
	
		}
	}	
	static void GecenKalan(ArrayList<Ogrenci> OgrenciList) {
		System.out.println();
		for(int i=0;i<OgrenciList.size();i++)
		{
			if(OgrenciList.get(i).Gectimi)
			{
				System.out.println("Dersten Gecti "+OgrenciList.get(i).Numara+" "
				+OgrenciList.get(i).Adi+" "
				+OgrenciList.get(i).Ort);
			}
			else 
			{
				System.out.println("Dersten Kaldi "+OgrenciList.get(i).Numara+" "
				+OgrenciList.get(i).Adi+" "
				+OgrenciList.get(i).Ort);
			}
		}
	}
	static void PuanEkle(ArrayList<Ogrenci> OgrenciList,boolean VizeMi, int x )
	{
		Ogrenci minOgrenci= null;
		double minOrtalama= Double.MAX_VALUE;
		for (Ogrenci ogrenci : OgrenciList) {
			
			if(minOrtalama>ogrenci.Ort)
			{
				minOrtalama=ogrenci.Ort;
				minOgrenci= ogrenci;
			}
		}
		System.out.println(" vize notu "+minOgrenci.Vize);	

		int ekleme=minOgrenci.Vize*(x)/100;
		minOgrenci.Vize=(int)(minOgrenci.Vize + ekleme);
		System.out.println("yeni vize notu "+minOgrenci.Vize);	
	}
	static void OrtalamayaGoreSirala(ArrayList<Ogrenci> OgrenciList )
	{
			Collections.sort(OgrenciList,new Comparator<Ogrenci>() {
				@Override
				public int compare(Ogrenci o1, Ogrenci o2) {
					
			      if(o1.Ort < o2.Ort)
			      {
			    	  return -1;
			      }
			      else if(o1.Ort > o2.Ort) {
			    	  return 1;
			      }
			      else {
					return 0;
				}
				
			   }

			});
	}
	
	/*static ArrayList<Ogrenci> SiralaListeyeElemenEkle(ArrayList<Ogrenci> OgrenciList )
	{
		Scanner scanner= new Scanner(System.in);
		System.out.println("numara isim vize final girelim");
		Ogrenci yeniOgrenci= new Ogrenci();
		//yeniOgrenci.Numara=scanner.nextInt();
		yeniOgrenci.Adi=scanner.next();
		//yeniOgrenci.Vize=scanner.nextInt();
		//yeniOgrenci.Final=scanner.nextInt();
		//yeniOgrenci.Ort= scanner.nextDouble();

		
		for(int i=0; i<OgrenciList.size();i++)
		{
			Ogrenci mevcutOgrenci = OgrenciList.get(i);
			if(mevcutOgrenci.Adi.compareTo(yeniOgrenci.Adi)>0)
			{
				OgrenciList.add(i,yeniOgrenci);
				System.out.println("wanted:"+mevcutOgrenci.Adi);
				break;
			}
			
			if(i==OgrenciList.size()-1)
			{
				OgrenciList.add(yeniOgrenci);
				System.out.println(i);
				break;
			}
			return OgrenciList;
		}
	}
	
*/	
		static void yeniOgrenci(ArrayList<Ogrenci> OgrenciList)
		{
			Ogrenci yeniOgrenci = new Ogrenci();
			Scanner scanner = new Scanner(System.in);
			System.out.println("ogrenci adini girniz:");
			yeniOgrenci.Adi = scanner.nextLine();
			System.out.println("ogrenci numarasini girniz:");
			yeniOgrenci.Numara= scanner.nextInt();
			System.out.println("ogrenci vizesini girniz:");
			yeniOgrenci.Vize= scanner.nextInt();
			System.out.println("ogrenci finalini girniz:");
			yeniOgrenci.Final= scanner.nextInt();
			yeniOgrenci.Ort=yeniOgrenci.Final*0.60+yeniOgrenci.Vize*0.40;
			if(yeniOgrenci.Ort>50)
			{
				yeniOgrenci.Gectimi = true;
			}
			else {
				yeniOgrenci.Gectimi=false;
			}
			if(yeniOgrenci.Ort >=80)
			{
				yeniOgrenci.HarfNotu = "AA";
			}
			else if(yeniOgrenci.Ort >=70)
			{
				yeniOgrenci.HarfNotu = "BB";
			}
			else if(yeniOgrenci.Ort >=50)
	        {
				yeniOgrenci.HarfNotu = "CC";  
	        }
			else if(yeniOgrenci.Ort >=40)
	        {
				yeniOgrenci.HarfNotu = "DD";  
	        }
			else if(yeniOgrenci.Ort >=0)
	        {
				yeniOgrenci.HarfNotu = "FF";  
	        }
			OgrenciList.add(yeniOgrenci);
			ArrayList<Integer>numArrayList=new ArrayList<>();
			for (Ogrenci ogrenci : OgrenciList) {
				numArrayList.add(ogrenci.Numara);
			}
			Collections.sort(numArrayList);
			for (int i = 0; i < numArrayList.size(); i++) {
			    int numara = numArrayList.get(i);
			    for (Ogrenci ogrenci : OgrenciList) {
			        if (ogrenci.Numara == numara) {
			            System.out.println(numara + ogrenci.Adi);
			            break;
			        }
			    }
			}

				scanner.close();
		}
	}
	


