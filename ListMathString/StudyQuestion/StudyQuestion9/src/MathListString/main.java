package MathListString;

import java.util.ArrayList;
import java.util.Scanner;

//SORU9: 10 tane isim giriniz. Oluşturduğunuz listede ‘a’ ile başlayıp “c” ile biten isimleri listeleyiniz.
public class main {

	public static void main(String[] args) {
		
		ArrayList<String> isimListesi = new ArrayList<>();
        Scanner girdi = new Scanner(System.in);

        // Kullanıcıdan 10 ismi alın
        for (int i = 1; i <= 10; i++) {
            System.out.print("Isim " + i + ": ");
            String isim = girdi.nextLine();
            isimListesi.add(isim);
        }

        // 'a' ile başlayıp 'c' ile biten isimleri listeleyin
        System.out.println("Isimlerde 'a' ile baslayip 'c' ile biten isimler:");
        for (String isim : isimListesi) {
            if (isim.toLowerCase().startsWith("a") && isim.toLowerCase().endsWith("c")) {
                System.out.println(isim);
            }
        }
	}

}
