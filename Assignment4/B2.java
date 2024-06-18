import java.util.Scanner;
public class B2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number: ");
int n=sc.nextInt();
int n1=n;
int sum=0;
while(n>0)
{
	int r=n%10;
	sum=sum+r;
	n=n/10;
}
if(sum%9==0)
	System.out.println("The number "+n1+" is divisible by 9");
else
	System.out.println("The number "+n1+" is not divisible by 9");
	}

}
