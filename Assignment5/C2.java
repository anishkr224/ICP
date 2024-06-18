import java.util.Scanner;
public class C2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number: ");
int n=sc.nextInt();
int n1=n;
int rev=0;
while(n!=0)
{
	int r=n%10;
	rev=rev*10+r;
	n=n/10;
}
if(isPrime(n1) && isPrime(rev))
	System.out.println(n1+" is twisted prime.");
else
	System.out.println(n1+" is not twisted prime.");
	}

	public static boolean isPrime(int n) {
		for(int i=2; i<=(int)Math.sqrt(n); i++)
				{
				if(n%i==0)
		  return false;
			}
			return true;
	}
}
