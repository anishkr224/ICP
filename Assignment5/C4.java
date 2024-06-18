import java.util.Scanner;
public class C4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of m: ");
		int m=sc.nextInt();
		System.out.println("Enter the value of n: ");
		int n=sc.nextInt();
		for( int i=m; i<=n; i++) {
			int fact=1;
			for( int j=2; j<=i; j++){
				fact=fact*j;
			}
			System.out.println("Factorial of "+i+" is: "+fact);
		}
	 }
	}

