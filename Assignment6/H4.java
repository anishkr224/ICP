import java.util.Scanner;;
public class H4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string: ");
String str=sc.nextLine();
System.out.println("The number of words in the string: "+word(str));
	}
	public static int word(String str) {
		int c=1;
		for(int i=0; i<str.length()-1; i++) {
			if((str.charAt(i)==' ' && str.charAt(i+1)!=' '))
				c++;
		}
		return c;
		}
	
}
