package Paket;

import Arayüz1.Arac;
import Arayüz1.Otomobil;
import Arayüz1.Tren;
import Geometri.Daire;
import Geometri.Kare;
import PaketSoyutSinif.AltSinif;
import PaketSoyutSinif.SoyutSinif;
import Veritabani.DB;
import Veritabani.DBYoneticisi;
import Veritabani.MSSQL;

//soyutlama yapmak için Abstract class and interface yapıları kullanılır // soyut sınıf ve arayüz

public class Main {

	public static void main(String[] args) {
/*
		SoyutSinif.StaticMethod();
		AltSinif asAltSinif = new AltSinif(10,20) ;
		System.out.println(asAltSinif.Hesapla(10));
		asAltSinif.EkranaYaz();
		
		Daire d1  = new Daire(10);
		d1.AlanHesapla();
		System.out.println(d1.CevreHesapla());
		
		Kare k1 = new Kare(60);
		k1.AlanHesapla();
		System.out.println(k1.CevreHesapla());
*/
		// Arac arac = new Arac(); //interface bu şekilde kullanılamaz
		
		Arac otomobil =new Otomobil(10);
		
		otomobil.Hizlan();
		System.out.println(otomobil.KalanYakitHesapla(10));
		
		Tren tren = new Tren(10, 20);
		tren.YakitTipiGoster();
		
		DB db = new MSSQL();
		DBYoneticisi dbYoneticisi =new DBYoneticisi(db);
		dbYoneticisi.Connect();
		dbYoneticisi.Delete();
		
	}

}
