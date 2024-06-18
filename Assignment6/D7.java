import java.util.Scanner;
public class D7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.next();
		str=str.toLowerCase();
		int c=count(str);
		System.out.println("Number of vowles in the string \'"+str+"\' is: "+c);
	}
		public static int count(String str) {
			int c=0;
			for(int i=0; i<str.length(); i++) {
				if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
					c++;
				}
			}
				return c;
	}
		
}
