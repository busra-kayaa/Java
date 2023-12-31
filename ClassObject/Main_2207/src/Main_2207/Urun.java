package Main_2207;

public class Urun {
	
	String Adi;
	int KategoriIndex;
	String BirimAgirligi;
	Double BirimFiyatı;
	int StokMiktari;
	
	public Urun() {
       
    }
	
	public int getKategoriIndex() {
		return KategoriIndex;
	}

	public Double BirimFiyatı() {
		return BirimFiyatı;
	}

	public String getAdi() {
		return Adi;
	}

	public Double getBirimFiyatı() {
		return BirimFiyatı;
	}

	public void setBirimFiyatı(Double BirimFiyatı) {
		this.BirimFiyatı=BirimFiyatı;
	}
	public void setStokMiktari(int StokMiktari) {
		this.StokMiktari=StokMiktari;
	}

	public int getStokMiktari() {
		return StokMiktari;
	}
	public int StokMiktari() {
		return StokMiktari;
	}
}
