import java.util.Scanner;
public class B4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
System.out.print("Enter the first number:");
int a=sc.nextInt();
System.out.print("Enter the second number:");
int b=sc.nextInt();
int a1=a, b1=b;
while (b>0)
{
	int r=a%b;
	a=b;
	b=r;
}
System.out.println("GCD of "+a1+" and "+b1+" is "+a);
	}

}
