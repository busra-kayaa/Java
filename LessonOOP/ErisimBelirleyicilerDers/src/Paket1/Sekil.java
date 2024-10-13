package Paket1;

public class Sekil {
	
	int alan;
	private int cevre;
	protected int hacim ;
	public String adi;
	int defaultData=10;
	private int privateData=555;

	public void Setcevre() { //veri yazarken
		System.out.println("set cevre calisti");
		//this.cevre=10;
	}
	
	public int Getcevre() { // erişimin mümkün olmadığı verilere erişmek için kullanılır. get-> almak,okumak.
		return cevre*5;
	}
	
	public Sekil (int cevre) {
		this.cevre = cevre;
		System.out.println("Sekil.Sekil()"+this.cevre);
	}
	
	public void Ciz() {
		System.out.println("Sekil.Ciz()");
	}
}

