import java.util.Scanner;

public class D2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Input no of pentagonal numbers to print: ");
		int n=sc.nextInt();
	for(int i=1; i<=n; i++) {
		System.out.print(getPentagonalNumber(i)+" ");
       if (i%10==0)
        	System.out.println();
	}
	}
public static int  getPentagonalNumber(int n) {
	return (n*(3*n-1))/2;
}
}
