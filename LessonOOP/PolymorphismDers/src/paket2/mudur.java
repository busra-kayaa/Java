package paket2;

import java.util.ArrayList;

public class mudur extends personel{
	
	public ArrayList<personel> pList= new ArrayList<personel>();
	
	@Override //overridwing alt ve üst sınıflar arasında meydana gelir
 	public double MaasHesapla() {
	 this.maasi= this.maasi*1.5;
	 return this.maasi;
 	} //over ride
	
	public double MudurMaasHesapla() {
		 this.maasi= this.maasi*1.5;
		 return this.maasi;
	 	} 
	public double MudurMaasHesapla(int a) {
		 this.maasi= this.maasi*1.5;
		 return this.maasi;
	 	} 
 }
 	
 	
