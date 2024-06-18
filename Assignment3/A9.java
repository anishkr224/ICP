import java.util.Scanner;
public class A9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a, b, c:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int max=a, smax=-99999999;
		
		if(b>max)
		{
			smax=max;
			max=b;
		}
		else if(b>max)
			smax=b;
		
		if(c>max)
		{
			smax=max;
			max=c;
		}
		else if(c>smax)
			max=c;
		System.out.println("Largest number: "+max);
		System.out.println("2nd Largest number: "+smax);
		
		/* System.out.print("Enter the value of a, b, c: ");
		int a= in.nextInt(),b= in.nextInt(),c= in.nextInt();
		
		if (a>b && a>c) {
			System.out.println("Largest no : "+a);
			if (b>c)
				System.out.println("2nd Largest : "+b);
			else 
				System.out.println("2nd largest : "+c);
		}else if (b>a && b>c) {
			System.out.println("Largest no : "+b);
			if (a>c)
				System.out.println("2nd Largest : "+a);
			else 
				System.out.println("2nd largest : "+c);
		}else {
			System.out.println("Largest no : "+c);
			if (b>a)
				System.out.println("2nd Largest : "+b);
			else 
				System.out.println("2nd largest : "+a); */
	}
}
