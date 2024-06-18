import java.util.Scanner;
public class A8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the x – y coordinates of a point : ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if (x>0 && y>0)
			System.out.println("("+x+" , "+y+") is in quadrant I");
		else if (x<0 && y>0)
			System.out.println("("+x+" , "+y+") is in quadrant II");
		else if (x<0 && y<0)
			System.out.println("("+x+" , "+y+") is in quadrant III");
		else if (x>0 && y<0)
			System.out.println("("+x+" , "+y+") is in quadrant IV");
		else if (x == 0 && y>0)
			System.out.println("("+x+" , "+y+") is on y axis");
		else if (y == 0 && x>0)
			System.out.println("("+x+" , "+y+") is on x aixs");
		else
			System.out.println("("+x+" , "+y+") is on origin");
	}
}
