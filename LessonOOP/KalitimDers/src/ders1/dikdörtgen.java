package ders1;

public class dikdörtgen extends dörtgen{
	int kenar1,kenar2;
	
	public  dikdörtgen(int kenar1,int kenar2) 
	{
		this.kenar1=kenar1;
		this.kenar2=kenar2;
	}
	
	public double AlanHesapla()
	{
		this.alan=(double)(kenar1*kenar2);
		return this.alan;
	}
}
