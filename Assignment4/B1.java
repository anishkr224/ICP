import java.util.Scanner;
public class B1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("Enter first number:");
int a=sc.nextInt();
System.out.print("Enter second number:");
int b=sc.nextInt();
System.out.print("Enter third number:");
int c=sc.nextInt();

int s=0;
for( ; a<=b; a=a+c)
{
	System.out.print(a+" ");
	s=s+a;
}
System.out.print("\nThe sum of number displayed is "+s);
	}

}
