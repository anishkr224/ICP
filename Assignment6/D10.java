import java.util.Scanner;
public class D10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Input x and y: ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		while(true) {
		System.out.println("Enter your option: 0.Quit 1.Area 2.Square 3.Circle 4.Rectangle");
		int op=sc.nextInt();
		switch(op) {
		case 0: return;
		case 1: System.out.println("Res="+triangleArea(x,y)); break;
		case 2: System.out.println("Res="+squareArea(x)); break;
		case 3: System.out.println("Res="+circleArea(x)); break;
		case 4: System.out.println("Res="+rectangleArea(x,y)); break;
		default: System.out.println("Invalid operation");
		}
		}
		}
public static double triangleArea(int b, int h) {
	return 0.5*b*h;
    }
	public static int squareArea(int a) {
		return a*a;
	}
	public static double circleArea(double r) {
		return Math.PI*r*r;
	}
	public static double rectangleArea(double l, int b) {
		return l*b;
		}
}
