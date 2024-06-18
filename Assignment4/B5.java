import java.util.Scanner;
public class B5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number: ");
int n=sc.nextInt();
int i, sum=0;
for(i=1; i<n; i++)
{
	if(n%i==0)
		sum=sum+i;
}
if (sum==n)
	System.out.print(""+n+" is a perfect number");
else
	System.out.print(""+n+" is not a perfect number");
	}

}
