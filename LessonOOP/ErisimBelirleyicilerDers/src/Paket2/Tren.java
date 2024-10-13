package Paket2;

public class Tren extends Arac {

		public boolean YolcuTreniMi;
		protected int VagonSayisi=10;
	
	public Tren(String Marka) {
		super(Marka); // super atasina gidiyor. super niye kullanilir sinav sorusu?
		this.Marka=Marka;
	}
	
	public int GetVagonSayisi() {
		return this.VagonSayisi;
	}
	public String SetMarka() {
		return this.Marka;
	}
	public void VagonEkle() {
		this.VagonSayisi++;
	}
	
}
