import java.util.Scanner;
public class C1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("Enter first number: ");
int a=sc.nextInt();
System.out.print("Enter second number: ");
int b=sc.nextInt();
int sum=0, sum1=0;

for(int i=1; i<a; i++){
	if(a%i==0 && i!=a) {
		sum=sum+i;
	}}

			for(int i=1; i<b; i++){
				if(b%i==0 && i!=b) {
					sum1=sum1+i;
			}}
					if(sum==b && sum1==a) {
		System.out.println(""+a+" and "+b+" are amicable numbers");
					}
		else {
		System.out.println(""+a+" and "+b+" are not amicable numbers");
		}
	}
}