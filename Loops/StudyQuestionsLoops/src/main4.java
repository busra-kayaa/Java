package Calisma;

import java.util.Scanner;

public class main4 {
	/* Girilen sayıdan küçük en büyük 3. Asal sayıyı bulunuz. Örnek : 25 => 23 , 19, 17 , Sonuc: 17*/
	
	public static void main (String[]args) 
	{
		Scanner girdi = new Scanner(System.in);
		System.out.println("sayi giriniz:");
		int sayi= girdi.nextInt();
		int sayac=0,sayac2=0;
		sayi-=1;
		while(true) {
			sayac2=0;
			for(int i=sayi-1;i>=2;i--) {
				if(sayi%i==0) {
					sayac2++;
				}
			}
			if(sayac2==0) {
				//System.out.println(sayi);
				sayac++;
			}
			
			if(sayac==3) {
				System.out.println(sayi);
				break;
			}
			sayi--;
		}
	}
}