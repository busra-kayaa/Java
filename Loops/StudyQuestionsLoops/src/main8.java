package Calisma;

import java.util.Scanner;

/*8.
    n pozitif sayı olmak üzere, Fn= 2 ^2n + 1 biçiminde ifade edilebilen sayılara Fermat sayısı denir. n. sıradaki Fermat Sayıyı bulan fonksiyonu yazınız.
	F0= 2^1 + 1 = 3
	F1= 2^2 + 1 = 5
	F2= 2^4 + 1 = 17
*/

public class main8 {
	static void FermatSayi(int n) {
		System.out.println(Math.pow(2, Math.pow(2, n)) + 1);
	}

	public static void main(String[] args) {
		System.out.println("Kacinci siradaki fermaat sayi bulunsun?");
		Scanner girdi= new Scanner(System.in);
		int n = girdi.nextInt();
		FermatSayi(n);
	}
}
