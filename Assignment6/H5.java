import java.util.Scanner;
public class H5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("Enter the first number: ");
int a=sc.nextInt();
System.out.print("Enter the second number: ");
int b=sc.nextInt();
System.out.print("Enter the third number: ");
int c=sc.nextInt();
System.out.println("Check whether the three said numbers are consecutive or not! \n"+consecutive(a,b,c));
	}
	public static boolean consecutive(int x, int y, int z) {
		if((x+1==y && y+1==z) || (z+1==y && y+1==x))
			return true;
		return false;
	}

}
