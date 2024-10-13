package Paket1;

public class Personel {
	
	//private String adi;
	protected String adi; //boyle kullanırsak mainden ulaşılır yani mainden aynı pakette oldugu icin sarmalama yapmış olmayız. 
	private int yasi;
	private double maasi;
	
	public String getAdi() {
		return this.adi;
	}
	
	public void setAdi(String adi) {
		this.adi = adi; // mainden oluşturulan nesneye ismi gönderir
	}
	
	public int getYasi() {
		return this.yasi;
	}
	
	public void setYasi(int yasi) {
		if(yasi<0) {
			return;
		}
		this.yasi = yasi;
	}
	
	public double getMaasi() {
		return this.maasi;
	}
	
	public void setMaasi(double maasi) {
		
		if(maasi<10000) {
			maasi=10000;
		}
		// case sensitive
		this.maasi = maasi*1.2;
	}
}
