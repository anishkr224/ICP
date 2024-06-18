import java.util.Scanner;

public class C9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of terms: ");
		int n=sc.nextInt();
		double sum=0;
		for(int i=1; i<=n; i++) {
			sum=sum+(1.0/(i*i));
		}
		System.out.println("Result="+sum);
	}

}
