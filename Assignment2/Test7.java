
public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        boolean res = ((a*b)>=c || (b*c)>=a || (a*c)>=b);
        System.out.println("result="+res);
	}

}
