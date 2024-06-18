import java.util.Scanner;
public class File4a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number between 0 to 1000:");
		int n=sc.nextInt();
		int a=(n)%(10);
		n=(n)/(10);
		int b=(n)%10;
		n=(n)/10;
		int c=(n)%10;
		n=(n)/10;
		
		int sum=a+b+c;
		System.out.println("Sum of the digits= "+sum);
	}

}
