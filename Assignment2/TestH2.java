
public class TestH2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r= Double.parseDouble(args[0]);
		double h= Double.parseDouble(args[1]);
		double a= (Math.PI*Math.pow(r, 2))+(2*Math.PI*h);
		System.out.println("Area of cylinder= "+a);
	}

}
