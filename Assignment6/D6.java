import java.util.Scanner;
public class D6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=sc.next();
		System.out.println("Input character to search: ");
		char ch=sc.next().charAt(0);
		int c=count(str,ch);
		System.out.println("The character \'"+ch+"\' in the string \'"+str+"\' is: "+c);
	}
		public static int count(String str, char ch) {
			int c=0;
			for(int i=0; i<str.length(); i++) {
				if(str.charAt(i)==ch)
					c++;
			}
			return c;
	}
}
