import java.util.Scanner;

public class A3a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Input first number:");
		int a=sc.nextInt();
		System.out.println("Input second number:");
		int b=sc.nextInt();
		System.out.println("Input third number:");
		int c=sc.nextInt();
		if (a<b && b<c)
			System.out.println("\"incresing\"");
		else if (c>b && b>a)
		System.out.println("\"Decreasing\"");
		else 
			System.out.println("\"Neither increasing nor decreasing\"");
	}

}
