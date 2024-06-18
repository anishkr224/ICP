import java.util.Scanner;
public class B7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("Enter a no. for which you want to find the multiplication table: ");
int n=sc.nextInt();
System.out.println("The multiplication table of "+n+" is:");
for(int i=1; i<=10; i++)
{
	System.out.println(n+"*"+i+"="+(n*i));
}
}

}
