import java.util.Scanner;
public class B6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("Enter the base: ");
int a=sc.nextInt();
System.out.print("Enter the power: ");
int b=sc.nextInt();
int p=1;
for (int i=1; i<=b; i++)
{
	p=p*a;
}
System.out.println(a+" to the power "+b+" is: "+p);
	}

}