import java.util.Scanner;

public class H5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		String s="";
for(int i=1; i<=n; i++)
{
	s=s+i+s;
	System.out.println(s+" ");
}	
	}
}
