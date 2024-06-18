import java.util.Scanner;

public class D3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int rev=reverse(n);
		boolean res= isPalindrome(n);
		System.out.println(n+" "+(isPalindrome(n)?"is":"is not")+" a palindrome number");
			}
	public static int reverse(int number) {
		int rev=0;
		while(number>0)
		{
			int r=number%10;
			rev=rev*10+r;
			number=number/10;
		}
	return rev;
	}
		public static boolean isPalindrome(int number)
		{
		if (number==reverse(number))
			return true;
		else
	return false;
	}
}
