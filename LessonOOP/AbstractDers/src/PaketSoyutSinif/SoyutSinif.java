package PaketSoyutSinif;

public abstract class SoyutSinif {
// soyut sinif olmak zorunda abstract yazmak zorundayız
// abstract methodlara da sahip olabilir abstract olmayanlar da
// soyut sınıf newlenmez.
// final methodları olabilir
// constructor ve static method alabilir
	int a,b;
	final int c=123;
	
	public SoyutSinif(int a, int b) {
	super();
	this.a = a;
	this.b = b;
}
	public static void StaticMethod() {
		System.out.println("SoyutSinif.StaticMethod()");
	}

	public abstract void EkranaYaz(); 
	
	public void EkranaYaz2 () {

		System.out.println("SoyutSinif.EkranaYaz2()");
	}
	public final int  Hesapla(int a) {
		return a*a;
	}
	
}
