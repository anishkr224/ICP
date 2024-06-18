import java.util.Scanner;

public class H1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Input a String: ");
		String str=sc.next();
		int i,j;
		for(i=0; i<str.length(); i++) {
		for(j=0; j<str.length(); j++) {
			if(i!=j && str.charAt(i)==str.charAt(j))
				break;
		}
		if(j==str.length()) {
			System.out.println("first non-repeated character: "+str.charAt(i));
			break;
		}
		}
	}
}
