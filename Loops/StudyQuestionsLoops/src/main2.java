package Calisma;

import java.util.Scanner;

public class main2 {
/* 2. a) ikilik tabanda sayıyı gösteriniz. Örnek: 9 => Sonuc: 1001 
 *     b) ikilik tabanda yazılan sayıyı 10luk tabana ceviriniz. 1101 => 13
 */	

	public static void main (String[]args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("onluk tabana cevirmek istediginiz ikilik sayiyi giriniz:");
		int ikiliksayi=scanner.nextInt();
		int sonuc = decimalGoster(ikiliksayi);
		System.out.println("ikilik tabandaki = " +ikiliksayi+ "  onluk tabandaki = "+sonuc);
		System.out.print("ikilik tabana cevirmek istediginiz onluk sayiyi giriniz:");

		int onluksayi= scanner.nextInt();
		binaryGoster(onluksayi);

	}
	
	public static int decimalGoster(int sayi) {
		int onlukSayi=0;
		int i=0,kalan;
		
		  while(sayi>0) {
			  kalan =sayi%10;
			  sayi=sayi/10;
			  onlukSayi= (int)(onlukSayi+ kalan * Math.pow(2, i));
			  i++;
		  }
		  return onlukSayi;
	 }
	
	 public static void binaryGoster(int sayi) {
		 int binary[]= new int [40];
		 int index = 0;
		 while(sayi>0) {
			 binary[index]=sayi%2;
			 sayi=sayi/2;
			 index++;
		 }
		 
		 for(int i=index-1; i>=0;i--) {
			 System.out.print(binary[i]);
		 }
	 }

	
}
