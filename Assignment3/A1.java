import java.util.Scanner;
public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the age:");
int a=sc.nextInt();
if (a>=18)
System.out.println("\"You are eligible to cast your vote\".");
else
	System.out.println("\"You are not eligible to cast your vote\".");
	}

}
