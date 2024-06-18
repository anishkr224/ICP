import java.util.Scanner;

public class D2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		int res=getPentagonalNumber(n);
}
public static int getPentagonalNumber(int n)
{
	int count=1;
	for(int i=1; i<=n; i++)
	{
		int a=(i*(3*i-1))/2;
		System.out.print(a+",");
				if(count%10==0)
				{
					System.out.println();
				}
				count++;
	}
	return count;
	}

}
