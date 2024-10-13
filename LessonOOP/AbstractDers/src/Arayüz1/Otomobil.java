package Arayüz1;
//arayüz davranış farklılığını oluşturan en temel özelliklerdendir.

public class Otomobil implements Arac{ //uygula //istenilen kadar implements yapılabilir ama birden fazla class extends edilemez.
	int baslangicHiz;
	int yakitMiktari;
	
	public Otomobil(int baslangicHiz, int yakitMiktari) {
		this.baslangicHiz= baslangicHiz;
		this.yakitMiktari= yakitMiktari;
	}
	
	public Otomobil(int baslangicHiz) {
		this.baslangicHiz= baslangicHiz;
		this.yakitMiktari= 100;
	}
	
	@Override
	public void Hizlan() {
		System.out.println("Otomobil.Hizlan()");
	}

	@Override
	public void YakitDoldur(int yeniYakit) {
		this.yakitMiktari+=yeniYakit;
		System.out.println(this.yakitMiktari);
	}

	@Override
	public int KalanYakitHesapla(int a) {
		
		return this.yakitMiktari-a;
	}

	@Override
	public void YakitTipiGoster() {
		// TODO Auto-generated method stub
		
	}

}
