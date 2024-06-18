import java.util.Scanner;
public class File3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter basic salary:");
		double BS=sc.nextDouble();
		double DA=(BS)*(0.4);
		double HRA=(BS)*(0.2);
		double GS= (BS)+(DA)+(HRA);
		
		System.out.println("DA is "+DA);
		System.out.println("HRA is "+HRA);
		System.out.println("Gross salary is "+GS);

	}

}
