import java.util.Scanner;
public class A6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of units:");
int u=sc.nextInt();
double price=0.0;
if (u<=50)
	price=u*3.0;
else if (u>50 && u<= 200)
	price=(50*3.0)+(u-50)*4.80;
else if (u>200 && u<=400)
price=(50*3.0)+(150*4.80)+(u-200)*5.80;
else
	price=(50*3.0)+(150*4.80)+(200*5.80)+(u-400)*6.20;
System.out.println("Your monthly electricity bill: "+price);
	}

}
