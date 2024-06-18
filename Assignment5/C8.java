import java.util.Scanner;
public class C8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				sum=sum+j;
			}
		}
		System.out.println("Sum of the series="+sum);
	}

}
