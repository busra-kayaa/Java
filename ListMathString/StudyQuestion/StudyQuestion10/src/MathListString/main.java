package MathListString;
//SORU10. 10 adet isim içinden İsim bilgisinin orta karakteri ‘m’ olan isimleri gösteriniz. 
//Örnek: cemal, sami (gösterilecek) vb. İsim Listesini ilk başta manuel oluşturunuz. “Ahmet”, “Ali”, “Veli” şeklinde.

import java.util.ArrayList;

public class main 
{

	public static void main(String[] args) {

	 ArrayList<String> isimListesi = new ArrayList<String>();

    // 10 adet ismi liste oluşturun
    isimListesi.add("Ahmet");
    isimListesi.add("Ali");
    isimListesi.add("Veli");
    isimListesi.add("Cemal");
    isimListesi.add("Sami");
    isimListesi.add("Emre");
    isimListesi.add("Ayşe");
    isimListesi.add("Mehmet");
    isimListesi.add("Ferhat");
    isimListesi.add("Necmi");

    // "m" harfinin ortasında bulunduğu isimleri bulun
    ArrayList<String> ortaMIsimler = new ArrayList<>();
    for (String isim : isimListesi) {
        if (isim.length() % 2 == 1 && isim.charAt(isim.length() / 2) == 'm') {
            ortaMIsimler.add(isim);
        }
    }

    System.out.println("Isimlerde 'm' harfinin ortasinda bulundugu isimler:");
    for (String isim : ortaMIsimler) {
        System.out.println(isim);
    } 
	}
}

