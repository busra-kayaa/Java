package Arayüz1;

public class Tren implements Arac{
	int baslangicHiz;
	int yakitMiktari;
	
	public Tren(int baslangicHiz, int yakitMiktari) {
		this.baslangicHiz= baslangicHiz;
		this.yakitMiktari= yakitMiktari;
	}
	@Override
	public void Hizlan() {
		System.out.println("hizlan");
	}

	@Override
	public void YakitDoldur(int yakit_Miktari) {
		this.yakitMiktari+=yakit_Miktari * 2;
	}

	@Override
	public int KalanYakitHesapla(int a) {
		return this.yakitMiktari-a;
	}
	@Override
	public void YakitTipiGoster() {
		
	}

}
