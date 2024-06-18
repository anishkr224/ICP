import java.util.Scanner;
public class H2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("How many eggs do you have?");
		int num=sc.nextInt();
		int gross=num/144;
		int x=gross*144;
		int left=num-x;
		int dozen=left/12;
		int extra=left%12;
		System.out.println("Your number of eggs is "+gross+" gross, "+dozen+" dozens, "+"and "+extra+" extra");
     }

}
