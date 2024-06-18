import java.util.Scanner;

public class B9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an integer number: ");
		int n=sc.nextInt();
		int n1=n;
		int num=0, i=0;
		while(n>0)
		{
			int r=n%10;
			if(r!=0)
				num=r*(int)Math.pow(10, i++)+num;
			n=n/10;
		}
		System.out.println("After removing 0 from number "+n1+", the new number is "+num);
	}

}
