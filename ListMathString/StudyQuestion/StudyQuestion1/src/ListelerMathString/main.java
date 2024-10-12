package ListelerMathString;

/* SORU1: x,y şeklinde koordinatları verilen bir üçgenin alanını aşağıdaki denkleme göre hesaplayınız.
  Alan(ABC)=1/2 |x1.y2+x2.y3+x3.y1−(y1.x2+y2.x3+y3.x1)| */

public class main {
	
	  public static void main(String[] args) {
	        double[] x = {1.0, 8.0, 5.0};
	        double[] y = {2.0, 5.0, 6.0};

	        double alan = hesaplaUcgenAlani(x, y);

	        System.out.println("Ucgen Alani:" + alan);
	    }
	  
    public static double hesaplaUcgenAlani(double[] x, double[] y) {
        if (x.length != 3 || y.length != 3) {
            throw new IllegalArgumentException("x ve y dizileri 3 elemanlı olmalıdır.");
        }

        double alan = 0.5 * Math.abs(x[0] * y[1] + x[1] * y[2] + x[2] * y[0] - (y[0] * x[1] + y[1] * x[2] + y[2] * x[0]));
        return alan;
    }

  
    
}

