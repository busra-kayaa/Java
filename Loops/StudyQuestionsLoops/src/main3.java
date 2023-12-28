package Calisma;

import java.util.Scanner;

public class main3 {
	/*3. Bir sayı serisi için serinin ilk elemanı, 
	 * eleman sayısı ve artış miktarına göre serinin sonucunu hesaplayınız.
	 */
	public static void main (String[]args) 
	{
		Scanner scanner= new Scanner(System.in);
		System.out.print("ilk eleman giriniz:");
		int ilkEleman= scanner.nextInt();
		System.out.print("eleman sayisi giriniz:");
		int elemanSayisi= scanner.nextInt();
		System.out.print("artis miktari giriniz:");
		int ArtisMiktari = scanner.nextInt();
		
		for(int i=1; i<elemanSayisi; i++) {
			ilkEleman+=ArtisMiktari;
		}
		System.out.println("serinin sonucu="+ilkEleman);
		
	}
}
