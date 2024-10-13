package ders1;

public class daire extends sekil{
	public int R;
	
	public daire(int R)
	{
		this.R=R;
	}
	// @Override 
	public double AlanHesapla() 
	{
		// this o andaki nesneyi gösterir.
		//Double alan =0;   return this.alan
		this.alan = Double.valueOf(Math.PI*(double)(R*R));
		return alan;
	}
	
}
