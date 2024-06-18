import java.util.Scanner;
public class B8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int lb=1, ub=11;
int cc,uu;
do {
cc=(int)(Math.random()*(ub-lb)+lb);
System.out.print("Enter a number:");
uu=sc.nextInt();
if(uu>cc)
System.out.println("Too high, try again");
else if (uu<cc)
	System.out.println("Too low, try again");
}while(uu!=cc);
	System.out.println("Good guess");
	}

}
