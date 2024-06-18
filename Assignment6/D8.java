import java.util.Scanner;
public class D8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=sc.next();
		//System.out.println(str+" "+(isPalindrome(str)?"is":"is not")+" a palindrome string");
		if(isPalindrome(str))
			System.out.println("A palindrome string");
		else
			System.out.println("Not a palindrome string");
	}
		public static boolean isPalindrome(String str) {
			int i,j;
			for(i=0, j=str.length()-1; i<j; i++, j--) {
				if(str.charAt(i)!=str.charAt(j))
					return false;
			}
			return true;
			}
	}


