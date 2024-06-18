import java.util.Scanner;
import java.util.Scanner;
public class D9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a password: ");
		String str=sc.next();
		//System.out.println(str+" "+(isValidPassword(str)? "valid" : "Invalid") +" pasword");
		if(isValidPassword(str))
			System.out.println(str+" Valid password");
		else
			System.out.println(str+" Invalid password");
	}
public static boolean isValidPassword(String str) {
	if(str.length()<8)
		return false;
	int c=0;
	for (int i=0; i<str.length();i++) {
		if(str.charAt(i)>='0' && str.charAt(i)<='9')
			c++;
			if((str.charAt(i)<'0' && str.charAt(i)>'9') && (str.charAt(i)<'A' && str.charAt(i)>'Z') && (str.charAt(i)<'a' && str.charAt(i)>'z'))
	   return false;
	}
	if(c<2)
		return false;
	return true;
}
}


