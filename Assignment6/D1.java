import java.util.Scanner;
public class D1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Input x and y: ");
int x=sc.nextInt();
int y=sc.nextInt();
while(true) {
System.out.println("Enter your option: 0.Quit 1.Add 2.Sub 3.Mul 4.Div 5.Mod 6.SqRoot");
int op=sc.nextInt();
switch(op) {
case 0: return;
case 1: System.out.println("Res="+additionSimple(x,y)); break;
case 2: System.out.println("Res="+subtractionSimple(x,y)); break;
case 3: System.out.println("Res="+multiplicationSimple(x,y)); break;
case 4: System.out.println("Res="+divisionSimple(x,y)); break;
case 5: System.out.println("Res="+remainderSimple(x,y)); break;
case 6: System.out.println("Res="+squareRootSimple(x)); break;
default: System.out.println("Invalid operation");
}
}
}
public static int additionSimple(int x, int y) {
	return x+y;
}
public static int subtractionSimple(int x, int y) {
	return y-x;
}
public static int multiplicationSimple(int x, int y) {
	return x*y;
}
	public static double divisionSimple(int x, int y) {
		if(x!=0)
			return (double)y/x;
		//return -99999;
		return Double.POSITIVE_INFINITY;
	}
	public static int remainderSimple(int n, int m) {
		//if(m!=0)
		return n%m;
		//return -99999;
	}
	public static double squareRootSimple(int n) {
		return Math.sqrt(n);
	}

}
