package MathListString;
//SORU6 :Bir metnin palindrom olup/olmadığını kontrol ediniz.
//Örnek: “adanada” kelimesi baştan ve sondan aynı şekilde okunur.
public class main {
	 public static boolean isPalindrom(String metin) {
	        // Metindeki boşlukları ve büyük/küçük harf duyarlılığını kaldırın
	        metin = metin.replaceAll("\\s", "").toLowerCase();
	        
	        int uzunluk = metin.length();
	        
	        for (int i = 0; i < uzunluk / 2; i++) {
	            if (metin.charAt(i) != metin.charAt(uzunluk - i - 1)) {
	                return false;
	            }
	        }
	        
	        return true;
	    }
	public static void main(String[] args) {
		String metin = "adanada";

        if (isPalindrom(metin)) {
            System.out.println(metin + " bir palindromdur.");
        } else {
            System.out.println(metin + " bir palindrom değildir.");
        }
	}

}
