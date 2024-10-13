package Geometri;

public class Kare extends Sekil{
	int kenar;
	
	public Kare(int kenar) {
		this.kenar=kenar;
	}

	@Override
	public void AlanHesapla() {
		System.out.println("kare alan: "+ kenar*kenar);
	}

	@Override
	public double CevreHesapla() {
		return kenar*4;
	}

}
