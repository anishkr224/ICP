import java.util.Scanner;
public class H3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string: ");
String str=sc.next();
System.out.println("The middle character in the string "+str+" is: "+MiddleChar(str));
	}
	public static String MiddleChar(String str) {
		int length=str.length();
		if(length/2==0)
		    return str.substring(length/2,(length+1)/2);
		else
			return str.substring(length/2,(length+2)/2);
		
	}
}
