// nested: iç ice sınıflar static  yapıdadır
// Inner: İç sınıflar static olmayan yapıdadır


public class Main {

	public static void main(String[] args) {
		
		Arac arac= new Arac();
		Arac.Motor m1 = new Arac.Motor();
		m1.yakitTipiString="benzin";
		
		
		Arac.Motor.Yakit y1 = new Arac.Motor.Yakit(2010);
		Arac.Motor.YazdirYazdir();
		
		//Arac.Sensor s1 = new Arac.Sensor("isik", 2000);
	//	Arac.Sensor s2 = new Arac.Sensor("isik2", 2000);
		//Arac.Sensor s3= new Arac.Sensor("isi3k", 2000);
	//	Arac.Sensor s4 = new Arac.Sensor("isik4", 2000);

	}

}
