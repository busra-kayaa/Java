package Calisma;

import java.util.Scanner;

/* 1.Döngü kullanarak bir fibonacci fonksiyonu (Fib_Hesapla(int sira)) yazınız ve istenilen sıradaki elemanı ekrana yazdırınız. 
 * Fibonacci Dizisi: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 Fib_Hesapla(8)=21
 */

public class main 
{
	public static int Fib_Hesapla(int sira)
	{
		if(sira<=0)
		{
			return 0;
		}
		else if(sira==1 || sira==2)
		{
			return 1;
		}	
		else
		{
			int fib1=1;
			int fib2=1;
			int yenifib=0;
			
			for(int i=3;i<=sira;i++)
			{
				yenifib=fib1+fib2;
				fib1=fib2;
				fib2=yenifib;
			}
	 		return yenifib;
		}
	}
	
	public static void main (String[]args) 
	{
		System.out.print("Sira Giriniz: ");		
		Scanner input = new Scanner(System.in);
		int sira= input.nextInt();
		int sonuc = Fib_Hesapla(sira);
		
		System.out.println("Fib_Hesapla(" + sira + ")="+ sonuc);
	}
}
