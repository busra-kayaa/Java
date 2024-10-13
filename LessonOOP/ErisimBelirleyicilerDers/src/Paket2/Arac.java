package Paket2;

public class Arac {
	protected String Marka;
	public String Model;
	public String Yakit; 
	public int tankKapasitesi;
	protected int kalanYakit;
	public final String finalYakitTipi="Benzin";
	

	public Arac(String Marka) {
		this.Marka=Marka;
		System.out.println("bu bir aractir kardesim");
	}
	
	public void TankiDoldur(int yakitMiktari) {
		if(yakitMiktari+this.kalanYakit >this.tankKapasitesi) {
			this.kalanYakit= this.tankKapasitesi;
			return;
		}
		this.kalanYakit+=yakitMiktari;
	}
}