package paket2;

public class isci extends personel{
	
	@Override
	public double MaasHesapla() {
		 this.maasi= this.maasi*1.2;
		 return this.maasi;
	}
	// return super.MaasHesapla();
}
