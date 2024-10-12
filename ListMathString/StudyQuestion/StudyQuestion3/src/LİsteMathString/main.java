package LİsteMathString;

// SORU3: (n-1)! > 2^n * n^Logn , n>2 olmak üzere eşitsizliğini sağlayan en küçük n değerini bulunuz.

public class main 
{
	public static void main(String[] args) 
	{
		double faktoriyel=1;
		for (int n = 2; ; n++) //n-1= n , n= n+1 
		{
			System.out.print(n+"!");

			for ( int k = n; k>0; k--) 
			{
				faktoriyel=faktoriyel*k;		
			}
			
			System.out.println("= "+faktoriyel);
	
			double sonuc = Math.pow(2,n+1) *Math.pow(n+1,Math.log10(n+1));
			//System.out.println("Math.pow(2,n) : "+ Math.pow(2,n+1));
			// System.out.println("Math.pow(n,Math.log(n)): "+ Math.pow(n+1,Math.log(n+1)));
	
			System.out.println("2^n * n^logn : "+sonuc);
			System.out.println("(n-1)!> 2^n * n^Logn ");
			System.out.println(faktoriyel+" > "+sonuc);
 
			if(faktoriyel>sonuc)
			{
				System.out.println((n+1)+" = degeri sagladi");
				break;
			}
			
			else {
				System.out.println((n+1)+" = degeri saglamadi");
				System.out.println();
			}
			faktoriyel=1;
		}
	}
}	