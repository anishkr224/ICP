import java.util.Scanner;
public class File1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a degree in Fahrenheit:");
    double f=sc.nextDouble();
    double c=(f-32)*(5.0/9);
    System.out.println(f+" Fahrenheit is "+c+" celsius");
	}

}
