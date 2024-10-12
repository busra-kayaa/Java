package Main_2207;

import java.util.Scanner;

public class Main_2207 {
    public static void main(String[] args) {
    	
        System.out.print("Cumleleri giriniz:");

    	Scanner scanner= new Scanner(System.in);
    	String metin =scanner.nextLine();
    	metin = metin.toLowerCase();// tum harfleri kucuk harf yapar
    	metin = metin.replaceAll("ü","u"); // ü harfini u'ye dönüştür
    	metin = metin.replaceAll("ç","c"); // ç harfini c'ye dönüştür 
    	metin = metin.replaceAll("ş","s"); // ş harfini s'ye dönüştür
    	metin = metin.replaceAll("ı","i"); // ı harfini i'ye dönüştür
    	metin = metin.replaceAll("ö","o"); // ı harfini i'ye dönüştür 
        CümlelereAyir(metin);
		scanner.close();
        
    }    
    
    public static boolean UnluharfMi(char harf) {
    	
    return "aeıioöuü".contains(String.valueOf(harf));
    }
   
    public static void CümlelereAyir(String metin) {
        String[] cümleler = metin.split("[.!?]"); //noktaya kadar olan cumleyi diziye atar

        for (String cumle : cümleler) {
        	cumle=cumle.trim();//cumlelerin basındaki ve sonundaki boşlukları siler
            System.out.println("\n cumle: "+cumle + ".");
            HecelereAyir(cumle);
        }
    }

    public static void HecelereAyir(String cumle) 
    {
        String[] kelimeler = cumle.split("[ ]"); 
        //boşluğa kadar olan kelimeyi diziye atar
        for (String kelime : kelimeler) 
        {
        	System.out.print(" ");
           //System.out.println("\nkelime: "+ kelime);
           int kelimeUzunlugu = kelime.length();
           StringBuilder heceBuilder = new StringBuilder();

           int heceIndex = 0;
           int kelimeIndex = 0;
           
           //char[] harfDizisi = kelime.toCharArray();
	           while (kelimeIndex < kelimeUzunlugu) {
	               // Kural 1: İki ünlü arasındaki ünsüz kendinden sonraki ünlüyle hece kurar
	               if (kelimeIndex < kelimeUzunlugu - 2 && UnluharfMi(kelime.charAt(kelimeIndex)) && !UnluharfMi(kelime.charAt(kelimeIndex + 1)) && UnluharfMi(kelime.charAt(kelimeIndex+2))) {
	                   heceBuilder.append(kelime.charAt(kelimeIndex));
	                   System.out.print(kelime.charAt(kelimeIndex)+"-"+kelime.charAt(kelimeIndex+1)+""+(kelime.charAt(kelimeIndex+2))+"-");
	                   kelimeIndex+=3;
	                   continue;
	               }
	
	               // Kural 2: İki ünsüzden ilki kendinden önceki ünlüyle, ikincisi kendinden sonraki ünlüyle hece kurar
	               else if (kelimeIndex < kelimeUzunlugu - 1 && !UnluharfMi(kelime.charAt(kelimeIndex)) && !UnluharfMi(kelime.charAt(kelimeIndex + 1))) {
	                   heceBuilder.append(kelime.charAt(kelimeIndex));
	                   System.out.print(kelime.charAt(kelimeIndex)+"-"+kelime.charAt(kelimeIndex+1)+"");
	                   kelimeIndex+=2;
	                   continue;
	               }
	
	               // Kural 3: Üç ünsüz harften ilk ikisi kendinden önceki ünlüyle, üçüncüsü kendinden sonraki ünlüyle hece kurar
	               else if (kelimeIndex < kelimeUzunlugu - 2 && UnluharfMi(kelime.charAt(kelimeIndex)) && !UnluharfMi(kelime.charAt(kelimeIndex + 1)) && !UnluharfMi(kelime.charAt(kelimeIndex + 2))&& !UnluharfMi(kelime.charAt(kelimeIndex + 3))) {
	                   heceBuilder.append(kelime.charAt(kelimeIndex));
	                   System.out.print(kelime.charAt(kelimeIndex)+""+kelime.charAt(kelimeIndex+1)+""+kelime.charAt(kelimeIndex+2)+"-"+kelime.charAt(kelimeIndex+3)+"");
	                   kelimeIndex+=4;
	                   continue;
	               }
	               //son heceyi ekler.
	               heceBuilder.append(kelime.charAt(kelimeIndex));
	               System.out.print(kelime.charAt(kelimeIndex));
	               kelimeIndex++;
	           }
           }
        }  
   }  