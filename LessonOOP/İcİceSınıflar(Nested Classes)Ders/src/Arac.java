import java.util.ArrayList;

public class Arac {

	public String modelString;
	public int fiyat;
	public String markaString;
	ArrayList<Sensor> sensorList = new ArrayList<Arac.Sensor>();
	
	public int SensorSay() {
		return this.sensorList.size();
	}
	
	public static class Motor{
		
		public String yakitTipiString;
		
		public void MotorCalistir() {
			
			System.out.println("Arac.Motor.MotorCalistir()");
		}
		
		public static class Yakit{
			public String tipiString;
			public int model;
			
			public Yakit(int model) {
				this.model=model;
			}
		}
		public static void YazdirYazdir() {
			System.out.println("Arac.Motor.Yakit.Yazdir");
		}
	}
	
	public class Sensor{
		String tipiString;
		int UretimYili;
		public Sensor(String tipi, int UretimYili) {
			this.tipiString= tipi;
			this.UretimYili=UretimYili;
		}
		public void SensorEkleCikar(boolean EkleMi,  Sensor S) {
		}
	}
}
