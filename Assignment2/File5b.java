import java.util.Scanner;
public class File5b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the radius of the hemisphere:");
    double r=sc.nextDouble();
    double SA=(3)*(Math.PI)*(Math.pow(r,2));
    double V=(0.666)*(Math.PI)*(Math.pow(r,3));
    
    System.out.println("The suface area of hemisphere is "+SA);
    System.out.println("The volume of hemisphere is "+V);

	}

}
