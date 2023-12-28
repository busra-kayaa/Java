package Calisma;
/*9. 
 * 6174 Sayısı: Kaprekar sabiti olarak da bilinen sayının özelliği, aşağıdaki adımları takip ettiğimizde en fazla 7 adımda 6174 sayısını elde etmemizdir. Kaprekar sabitini bulan fonksiyonu yazınız. 
 * Fonksiyonu 4 basamaklı sayılarla test ediniz.
1. Tüm rakamları aynı olmayan (4444 gibi) herhangi bir dört basamaklı sayı alınır.
2. Sayının rakamları büyükten küçüğe ve küçükten büyüğe sıralanarak iki yeni dört basamaklı sayı elde edilir.
3. Büyük sayıdan küçük sayı çıkarılır.
4. Bulunan sayı bir önceki sayıya eşit değilse işlem 2. adımdan itibaren bu yeni sayı ile tekrarlanır.
5. Sonuç olarak 6174 sayısı bulunur.
*/

import java.util.Arrays;
import java.util.Scanner;

public class main9 {
	public static void main(String[] args) {
		System.out.print("Sayi giriniz");
		Scanner girdiScanner= new Scanner(System.in);
		int sayi =girdiScanner.nextInt();
		KaprekarSabiti(sayi);
	}

	static void KaprekarSabiti(int sayi) {
		if (sayi < 1000 || sayi > 9999) {
			System.out.println("Lutfen 4 basamaklı bir sayi giriniz:");
			return;
		}

		while (sayi != 6174) {

			int basamak1 = sayi / 1000;
			int basamak2 = sayi % 1000 / 100;
			int basamak3 = sayi % 100 / 10;
			int basamak4 = sayi % 10 / 1;

			int[] basamaklar = { basamak1, basamak2, basamak3, basamak4 };

			Arrays.sort(basamaklar);

			int kucuk = basamaklar[0] * 1000 + basamaklar[1] * 100 + basamaklar[2] * 10 + basamaklar[3];
			int buyuk = basamaklar[3] * 1000 + basamaklar[2] * 100 + basamaklar[1] * 10 + basamaklar[0];

			sayi = buyuk - kucuk;

			System.out.println(buyuk + " - " + kucuk + " = " + sayi);

			if (sayi == 0) {
				System.out.println("Sayi sabit. Kaprekar bulunamaz.");
				break;
			}
		}
	}
}
