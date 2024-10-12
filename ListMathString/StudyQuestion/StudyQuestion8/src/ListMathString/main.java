package ListMathString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Double> doubleList = new ArrayList<>();

        // 10 adet double sayıyı listeye ekleyin
        doubleList.add(2.5);
        doubleList.add(1.0);
        doubleList.add(4.3);
        doubleList.add(3.7);
        doubleList.add(5.2);
        doubleList.add(0.8);
        doubleList.add(6.1);
        doubleList.add(3.0);
        doubleList.add(2.2);
        doubleList.add(4.5);

        // Liste içindeki sayıları sıralayın
        Collections.sort(doubleList);

        System.out.println("Sıralı Liste: " + doubleList);

        // Yeni bir sayı eklemek (örneğin, 3.3)
        double yeniSayi = 7.3;

        // Yeni sayıyı sırayı bozmadan eklemek için uygun konumu bulun
        int index = Collections.binarySearch(doubleList, yeniSayi);
        if (index < 0) {
            index = -(index + 1); // Negatif indeksi pozitife çevirin
        }

        // Yeni sayıyı listenin uygun konumuna ekleyin
        doubleList.add(index, yeniSayi);

        System.out.println("Yeni Sayı Eklendikten Sonra: " + doubleList);
    }
}


