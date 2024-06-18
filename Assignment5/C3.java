import java.util.Scanner;
public class C3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("Enter the first number: ");
int rng1=sc.nextInt();
System.out.print("Enter the second number: ");
int rng2=sc.nextInt();
System.out.print("Prime number between "+rng1+" and "+rng2+" are: ");
for(int i=rng1; i<=rng2; i++) {
	if(isPrime(i))
		System.out.print(i+" ");
}
	}
public static boolean isPrime(int n) {
	if(n==1)
		return false;
for(int i=2; i<=(int)Math.sqrt(n); i++) {
	if(n%i==0)
		return false;
}
return true;
}
}
