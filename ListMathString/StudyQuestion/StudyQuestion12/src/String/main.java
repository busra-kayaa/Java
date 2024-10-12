package String;

import java.util.ArrayList;
import java.util.Collections;

public class main {
// SORU12: 10 adet ismi büyükten küçüğe sıralayınız. Sıralama işleminden sonra yeni gelen string ifadeyi sırayı bozmayacak şekilde ekleyiniz. 
// Örnek: Zeynel, Osman, Kemal, Ali vb… Veli geldi. . Zeynel, Veli, Osman, Kemal, Ali
	public static void main(String[] args) {
	     ArrayList<String>isimListesi=new ArrayList<String>();

	        // 10 adet ismi listeye ekleyin (örneğin)
	        isimListesi.add("Zeynel");
	        isimListesi.add("Osman");
	        isimListesi.add("Kemal");
	        isimListesi.add("Ali");
	        isimListesi.add("Veli");
	        isimListesi.add("Ahmet");
	        isimListesi.add("Mehmet");
	        isimListesi.add("Ayse");
	        isimListesi.add("Fatma");
	        isimListesi.add("Emre");

	        // İsimleri büyükten küçüğe sıralayın
	        Collections.sort(isimListesi, Collections.reverseOrder());

	        System.out.println("Sirali Isim Listesi: " + isimListesi);

	        // Yeni bir isim eklemek (örneğin, "Mehmet")
	        String yeniIsim = "Busra";

	        // Yeni ismi sırayı bozmadan eklemek için uygun konumu bulun
	        int index = Collections.binarySearch(isimListesi, yeniIsim, Collections.reverseOrder());
	        if (index < 0) {
	            index = -(index + 1); // Negatif indeksi pozitife çevirin
	        }

	        // Yeni ismi liste içine ekleyin
	        isimListesi.add(index, yeniIsim);

	        System.out.println("Yeni İsim Eklendikten Sonra: " + isimListesi);
	}

}
