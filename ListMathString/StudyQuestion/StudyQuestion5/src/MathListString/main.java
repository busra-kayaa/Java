package MathListString;

import java.util.HashMap;
import java.util.Map;
//SORU5: Girilen bir metin içindeki her bir harfin kaç kez tekrar ettiğini bulunuz.
public class main {
    public static void main(String[] args) {
        String metin = "Bu bir örnek metindir.";

        // Harf frekanslarını hesaplamak için bir Map kullanın
        Map<Character, Integer> harfFrekans = new HashMap<>();

        // Metni gezerek harf frekanslarını hesaplayın
        for (char harf : metin.toCharArray()) {
            if (Character.isLetter(harf)) {
                harf = Character.toLowerCase(harf); // Büyük/küçük harf duyarlılığını kaldırmak için
                harfFrekans.put(harf, harfFrekans.getOrDefault(harf, 0) + 1);
            }
        }

        // Harf frekanslarını ekrana yazdırın
        for (char harf : harfFrekans.keySet()) {
            int frekans = harfFrekans.get(harf);
            System.out.println("'" + harf + "': " + frekans + " kez");
        }
    }
}
//Bu kod, verilen metin içinde her harfin frekansını hesaplar. Harf frekanslarını hesaplamak için bir Map kullanır ve metni gezerek harf frekanslarını hesaplar. 
//Sonuç olarak, her harfin kaç kez tekrar ettiği ekrana yazdırılır. Metni ve harf frekanslarını büyük/küçük harf duyarlılığı olmadan hesaplamak için Character.toLowerCase kullanılmıştır.
