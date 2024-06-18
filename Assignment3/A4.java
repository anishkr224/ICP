import java.util.Scanner;
public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);

System.out.println("Enter the number:");
int a = sc.nextInt();
int n=(int)(Math.random()*9)+1;
System.out.println(n);
if(a==n)
System.out.println("\"You got it right\"");
else if (a==(n-1) || a==(n+1))
	System.out.println("\"Almost got it\"");
else
	System.out.println("\"You got it wrong\"");
	}

}
