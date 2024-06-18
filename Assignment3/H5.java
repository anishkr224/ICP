import java.util.Scanner;
public class H5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
System.out.println("What is your gender (M or F):");
char g=sc.next().charAt(0);
System.out.println("First name:");
String fn=sc.next();
System.out.println("Last name:");
String ln=sc.next();
System.out.println("Age:");
int age=sc.nextInt();

String name="";
if(g=='F' && age>=20)
{
	System.out.println("Are you married, "+fn+" (y or n)?");
	char status=sc.next().charAt(0);
	if(status=='y')
		name=name+"Mrs. "+fn+" "+ln;
	else
		name=name+"Ms. "+fn+" "+ln;
}
else if(g=='F' && age<20)
	name=name+fn+" "+ln;
else if(g=='M' && age>=20)
	name=name+"Mr. "+fn+" "+ln;
else if(g=='M' && age<20)
	name=name+fn+" "+ln;

System.out.println("Then I shall call you "+name+".");
	
}
	}