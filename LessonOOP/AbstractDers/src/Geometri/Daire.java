package Geometri;

public class Daire extends Sekil {
	int r;
	
	public Daire(int r) {
		this.r=r;

	}
	@Override
	public void AlanHesapla() {
		System.out.println(Math.PI*r*r);
	}

	@Override
	public double CevreHesapla() {
		return 2* Math.PI*r;
	}
}
