import java.util.Scanner;

public class H4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("To compute cos(x): ");
		double x=sc.nextDouble();
		//x=(Math.PI/180)*x;
double error=0.000001;
int i=2;
double term=1, sum=1;
for( ; Math.abs(term)>error; i=i+2) {
	term=(-term)*((x*x)/((i-1)*i));
	sum=sum+term;
}
System.out.println("res= "+sum);
	}

	}


