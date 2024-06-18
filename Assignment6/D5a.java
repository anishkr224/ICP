import java.util.Scanner;

public class D5a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of sides: ");
		int n=sc.nextInt();
		System.out.println("Enter the length of sides: ");
		int side=sc.nextInt();
		double ar=area(n,side);
		System.out.println("Area="+ar);
	}
	public static double area(int n, double side) {
		return (n*side*side)/(4*Math.tan(Math.PI/n));
	}
}
