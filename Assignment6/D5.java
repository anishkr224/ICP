import java.util.Scanner;
public class D5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of sides: ");
		int n=sc.nextInt();
		System.out.println("Enter the length of sides: ");
		double side=sc.nextDouble();
		System.out.println("The area of thr polygon is "+area(n,side));
	}
		public static double area(int n, double side) {
		return(n*side*side/(4*(Math.tan(Math.PI/n))));
	}

}
