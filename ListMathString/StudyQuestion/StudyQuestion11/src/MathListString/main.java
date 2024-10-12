package MathListString;

import java.util.ArrayList;
import java.util.List;
// SORU11: Girilen 10 adet stringden oluşan listede, içinde “yaz” geçen fakat ‘b’ içermeyen elemanları gösteriniz.
public class main {

	public static void main(String[] args) {
		// 10 adet string içeren bir liste oluşturun (örneğin)
        List<String> stringList = new ArrayList<>();
        stringList.add("yaz mevsimi");
        stringList.add("sıcak hava");
        stringList.add("bahar ayları");
        stringList.add("kış tatili");
        stringList.add("yazlik ev");
        stringList.add("okuma yazma");
        stringList.add("Bebek");
        stringList.add("yaz gunu");
        stringList.add("deniz");
        stringList.add("bir kitap yaz");

        // "yaz" içeren ancak 'b' içermeyen stringleri bulun
        List<String> sonucList = new ArrayList<>();
        for (String str : stringList) {
            if (str.contains("yaz") && !str.contains("b")) {
                sonucList.add(str);
            }
        }

        // Bulunan sonuçları ekrana yazdırın
        System.out.println("Icinde 'yaz' gecen ve 'b' icermeyen stringler:");
        for (String str : sonucList) {
            System.out.println(str);
        }

	}

}
