import java.util.Scanner;
public class B10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		long p=1;
		while (p*3<n) {
			p=p*3;
		}
		System.out.println("The largest power of 3 less than or equal to "+n+" is "+p);
// (oR just simply write) System.out.println(p);
}
}