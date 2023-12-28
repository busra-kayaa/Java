package Calisma;

import java.util.Scanner;

/*
 	7. Belirli bir tabanda rakamları toplamına tam bölünen sayılara Harshad sayısı denir. Girilen sayının Harshad sayı olup olmadığını bulunuz.
	Örnek: 162 => 162 / (1+6+2) = 18 olduğundan girilen sayı Harshad sayısıdır.
*/

public class main7 {
	
	public static void main(String[] args) {
		System.out.print("Sayi giriniz");
		Scanner girdiScanner= new Scanner(System.in);
		int sayi =girdiScanner.nextInt();
			HarshadSayi(sayi);
		}
	static void HarshadSayi(int sayi) {
		int temp = sayi;
		int toplam = 0;

		while (temp > 0) {
			toplam += temp % 10;
			temp /= 10;
		}

		if (sayi % toplam == 0) {
			System.out.println(sayi + " sayisi Harshad sayidir.");
		} else {
			System.out.println(sayi + " sayisi Harshad sayi degildir.");
		}
	}
	}


