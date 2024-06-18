import java.util.Scanner;
public class C10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("Enter number of terms: ");
int n=sc.nextInt();
int a=0, b=1, c=1, d;
System.out.println(a+" "+b+" "+c+" ");
for(int i=4; i<=n; i++) {
	d=a+b+c;
	System.out.print(d+" ");
	a=b;
	b=c;
	c=d;
}
	}

}
