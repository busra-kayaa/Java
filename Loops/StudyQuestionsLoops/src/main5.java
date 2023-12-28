package Calisma;

import java.util.Iterator;
import java.util.Scanner;

/* * işareti kullanarak kare, dikdörtgen, eşkenar ve dik üçgen elde ediniz.*/

public class main5 {
	
	public static void main (String[]args) 
	{
		Scanner girdiScanner = new Scanner(System.in);
		System.out.print("Satir sayisi giriniz:");
		int satir= girdiScanner.nextInt();
	    DikUcgen(satir);
	    
	    System.out.print("Bir kenar giriniz:");
	    int kenar =girdiScanner.nextInt();
	    kareCiz(kenar);
	    
	    System.out.print("Uzun kenar giriniz:");
	    int uzun= girdiScanner.nextInt();
	    System.out.print("Kisa kenar giriniz:");
	    int kısa= girdiScanner.nextInt();
	    dikdortgenCiz(uzun,kısa);
	    int satir1=girdiScanner.nextInt();
		System.out.print("Satir sayisi giriniz:");
	    eskenarUcgenCiz(satir1);
	}
	
	public static void DikUcgen(int satir) {
		for(int i=1;i<=satir;i++){
			for(int j=1;j<=i;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void kareCiz(int boyut) {
        for (int i = 0; i < boyut; i++) {
            for (int j = 0; j < boyut; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
	
	 static void dikdortgenCiz(int satir, int sutun) {
	        for (int i = 0; i < satir; i++) {
	            for (int j = 0; j < sutun; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	    }

	 static void eskenarUcgenCiz(int boyut) {
	        for (int i = 0; i < boyut; i++) {
	            for (int j = 0; j < boyut - i - 1; j++) {
	                System.out.print(" ");
	            }
	            for (int k = 0; k < 2 * i + 1; k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }

	
}
