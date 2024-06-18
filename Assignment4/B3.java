import java.util.Scanner;
public class B3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number: ");
int n=sc.nextInt();

int lb=1, ub=n+1;
int i=1, sum=0;
System.out.print("Random numbers generated are: ");
do {
	int r=(int)(Math.random()*(ub-lb)+lb);
	//int r=(int)(Math.random()*10);
	sum=sum+r;
	System.out.print(r+" ");
	i++;
}while(i<=n);

double avg=(double)sum/n;
System.out.println("\nAverage of "+n+" random numbers are "+avg);

	}

}
