import java.util.Scanner;

public class H5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of terms: ");
		int n=sc.nextInt();
		int a=0, b=1,c;
		if(n==1) {
		System.out.println("Fibonacci Series is: "+a+" ");
		}else {
			System.out.print("Fibonacci Series is: "+a+", "+b+", ");
		for (int i=3; i<=n; i++) {
			c=a+b;
			System.out.print(c+", ");
			a=b;
			b=c;
		}
		}
	}
}
