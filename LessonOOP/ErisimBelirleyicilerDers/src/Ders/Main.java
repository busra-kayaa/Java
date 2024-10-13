package Ders;

import Paket1.*;
import Paket2.Arac;
import Paket2.Tren;

public class Main {
	public static void main(String[] args) {
		/*
		Sekil s1 = new Sekil(10);
		s1.adi="Daire";
		//s1.Setcevre();
		
		System.out.println("s1.Getcevre():"+ s1.Getcevre());
		s1.Ciz();
		//ORM
		Daire d1 = new Daire(100);
		Kure k1 = new Kure(55, 12000);
		
		*/
		
		Arac a1 = new Arac("");
		Tren t1 = new Tren("");
		System.out.println("t1.SetMarka()"+t1.SetMarka());
		t1.VagonEkle();
		t1.VagonEkle();
		t1.VagonEkle();
        //t1.finalYakitTipi="LPG"; // ben bir projede eğer bir şeylerin çok katı olduğuna eminsem o zaman final yaparım
		System.out.println(t1.GetVagonSayisi());
	}
}
