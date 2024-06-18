import java.util.Scanner;
public class File5a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of the hemisphere:");
		double r=sc.nextDouble();
		double SA=(3)*(3.141)*(r*r);
		double V=(0.666)*(3.141)*(r*r*r);
		
		System.out.println("The surface area of the hemisphere is "+SA);
		System.out.println("The volume area of the hemisphere is "+V);
	}

}
