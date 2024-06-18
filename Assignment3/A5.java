import java.util.Scanner;
public class A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Input the year:");
int y=sc.nextInt();

// boolean res=(y%100==0 && y%400==0 || (y%100!=0 && y%4==0);

boolean res;
if(y%100==0)
{
	if(y%400==0)
		res=true;
	else
		res=false;
}
else
{
	if(y%4==0)
		res=true;
	else
		res=false;
}
System.out.println(y+" is a leap year: "+res);
	}

}
