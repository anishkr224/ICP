import java.util.Scanner;
public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the numbers:");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if (a<b && b<c)
	System.out.println("\"incresing\"");
else if (c>b && b>a)
System.out.println("\"Decreasing\"");
else 
	System.out.println("\"Neither increasing nor decreasing\"");
	}

}
