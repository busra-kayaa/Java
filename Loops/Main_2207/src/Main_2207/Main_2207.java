package Main_2207;

import java.util.Iterator;
import java.util.Scanner;

// a) p+2 sayısı asal mıdır, fonksiyonu yazınız. AsalMi(int sayi)
// b) p+2 sayısı iki asal sayının çarpımına eşit midir, fonksiyonu yazınız. Asal çarpanları yazdırınız. Asal2CarpaniVarMi(int sayi)
// c) a veya b durumunun herhangi birinin şartı sağlaması durumunda ekrana “Chen Asalı”’dır şeklinde yazdıran fonksiyonu yazınız. SayiChenAsaliMi(int sayi)
// d) 2 basamaklı tüm Chen Asalı sayılarını yazdırınız.TumunuYazdir()

public class Main_2207 
{
	static int []dizi = new int[100];
	static int boyut=0;

	public static void main (String[] args) 
	{
		System.out.print("Sayi giriniz:");
		Scanner girdi = new Scanner(System.in);
		int sayi = girdi.nextInt();
		boolean sonuc = AsalMi(sayi);
		
		if (sonuc == false) 
		{
			System.out.println("p = "+sayi+" -> Asal sayi degildir.");
		}
		else
		{
			System.out.println("p = "+sayi+" -> Asal sayidir.");
		}

		int p = sayi+2; 
		boolean sonuc1 = AsalMi(p);
		if (sonuc1 == false) 
		{
			System.out.println("p + 2 = "+p+" -> Asal sayi degildir.");
		}
		else
		{
			System.out.println("p + 2 = "+p+" -> Asal sayidir.");
		}
		
		int m= sayi+2;
		boolean sonuc2 = Asal2CarpaniVarMi(m);
		if (sonuc2 == false) 
		{
			System.out.println(m+" = Iki asal sayinin carpimi degildir. ");
		}
		else //true
		{
			System.out.println(m+" = Iki asal sayinin carpimidir. ");
		}

		boolean sonuc3 = SayiChenAsaliMi(sayi);
		if (sonuc3 == false) 
		{
			System.out.println(sayi+" -> Sayisi Chen Asali degildir. ");
		}
		else //true
		{
			System.out.println(sayi+" -> Sayisi Chen Asalidir. ");
		}
		
		TumunuYazdir();
	}
	
	static boolean AsalMi(int sayi)
	{
		if(sayi <= 0 || sayi == 1)
		{
			 return false;
		}
		 
		for(int i=2; i<=sayi/2; i++)
		{
			if(sayi%i==0)
			{
				return false;
			}
		}
		return true; // 2 olma ihtimali ve asal olma ihtimali 
	}
	
	static boolean Asal2CarpaniVarMi(int sayi)
	{
		for(int i = 3; i<sayi; i++)
		{ 
			for (int j = 3; j <= sayi/2; j++)
			{
				if(AsalMi(i) == true && AsalMi(j) == true )
				{
					if(sayi == i*j)
					{
						System.out.println(" "+i+" * "+j+" = "+sayi);
						return true;
					}
				}
			}
		}
		return false;
	}
	
	static boolean SayiChenAsaliMi(int sayi)
	{
		if( (AsalMi(sayi) && (AsalMi(sayi+2) || Asal2CarpaniVarMi(sayi+2))))
		{
			//int p =sayi+2;
			//System.out.println(" = " + p);
			return true;
		}
		return false;
	}
	
	static void TumunuYazdir()
	{
		for(int i=10; i<100; i++)
		{
			if(SayiChenAsaliMi(i)== true)
			{
				dizi[boyut]=i;
				boyut++;
				//System.out.println("Chen Asali = " + (i));
			}
		}
		System.out.println("2 basamakli tum Chen Asallari" );
		for(int i=0;i<boyut;i++) {
			System.out.println("Chen Asali = " + dizi[i]);
		}
	}
}
