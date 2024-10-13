package ders1;

public class kare extends dörtgen{
 int kenar;
 
	 public  kare(int kenar)
	 { //constrcutor
		 this.kenar=kenar;
	 }
 
	 public double AlanHesapla()
	{
		 this.alan=(double)(kenar*kenar);
		 return this.alan;
	}
}
