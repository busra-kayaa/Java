package paket2;

public class personel {
	//private String adi;
		protected String adi; //boyle kullanırsak mainden ulaşılır yani mainden aynı pakette oldugu icin sarmalama yapmış olmayız. 
		protected int yasi;
		protected double maasi;
		
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
			
		/*	if(maasi<10000) {
				maasi=10000;
			}
			// case sensitive
			this.maasi = maasi*1.2;*/
			this.maasi = maasi;

		}
		public double PersonelMaasHesapla()
		{
			return this.maasi*=1.1;
			//return this.maasi;
		}
		public double MaasHesapla()
		{
			return this.maasi*=1.1;
			//return this.maasi;
		}
}
