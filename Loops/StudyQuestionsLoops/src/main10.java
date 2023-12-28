package Calisma;
/*10. Aşağıdaki gibi sonuç üretiniz. 
 * 1
 * 2 3 
 * 4 5 6
 * 7 8 9 10*/

public class main10 {
	static void SiraliYazdir(int satir) {
		int temp = 0;
		for (int i = 1; i <= satir; i++) {
			for (int j = 1; j <= i; j++) {
				temp++;
				System.out.print(temp + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		SiraliYazdir(4);
	}
}
