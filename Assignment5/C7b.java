import java.util.Scanner;

public class C7b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of lines: ");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=n; j>=i; j--) {
				System.out.print("$\t");
			}
			System.out.println();
	}
	}
}
