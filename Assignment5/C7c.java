import java.util.Scanner;

public class C7c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of lines: ");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int s=1; s<=n-i; s++) {
				System.out.print(" "+"\t");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(i+"\t");
			}
			System.out.println();
			
			/* for(int i=1; i<=n; i++) {
				for(int s=1; s<=n; s++) {
					System.out.print(" "+"\t");
				}
				for(int j=1; j<=i; j++) {
					System.out.print(i+"\t");
				}
				System.out.println(); */

	}
	}
}
