import java.util.Scanner;

public class D3a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Input a number: ");
		int n=sc.nextInt();
		if(isPalindrome(n))
			System.out.println("A palindrome number");
		else
			System.out.println("Not a palindrome number");
	}
	public static boolean isPalindrome(int number) {
		int rev=reverse(number);
		if(number==rev)
			return true;
		else
			return false;
	}
	public static int reverse(int number) {
		int rev=0;
		while(number>0) {
			int r=number%10;
			rev=rev*10+r;
			number=number/10;
		}
return rev;
	}

}
