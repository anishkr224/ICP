import java.util.Scanner;
public class File4b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter a number between 0 to 1000:");
    int n=sc.nextInt();
    int sum=0;
    
    sum+=(n%10);
    n=n/10;
    
    sum+=(n%10);
    n=n/10;
    
    sum+=(n%10);
    n=n/10;
    
    System.out.println("Sum of the digits="+sum);
	}

}
