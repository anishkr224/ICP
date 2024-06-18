
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = a + (int)((b-a)*Math.random());
        int d = a + (int)((b-a)*Math.random());
        System.out.println("Result= " + (c+d));
	}

}
