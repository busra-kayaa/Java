package ListelerMathString;

import java.util.ArrayList;

/* SORU1: x,y şeklinde koordinatları verilen bir üçgenin alanını aşağıdaki denkleme göre hesaplayınız.
  Alan(ABC)=1/2 |x1.y2+x2.y3+x3.y1−(y1.x2+y2.x3+y3.x1)| */

public class main 
{
	public static void main(String[] args) 
	{
		ArrayList<Double> x=new ArrayList<Double>();  
		x.add(1.0);
	    x.add(8.0);
	    x.add(5.0);
	     
	    ArrayList<Double> y=new ArrayList<Double>();  
	    y.add(2.0);
        y.add(5.0);
        y.add(6.0);
        
        Double alan = UcgenAlani(x,y);
        System.out.println("Ucgen Alani: " + alan);
	}
	
	 static double UcgenAlani(ArrayList<Double> x, ArrayList<Double> y)
	{
		 if (x.size() != 3 || y.size() != 3) {
	            throw new IllegalArgumentException("x ve y listeleri 3 elemanlı olmalıdır.");
	        }
		double alan = 0.5 * Math.abs(x.get(0) * y.get(1) + x.get(1) * y.get(2) + x.get(2) * y.get(0) - (y.get(0) * x.get(1) + y.get(1) * x.get(2) + y.get(2) * x.get(0)));
        return alan;
	}
}