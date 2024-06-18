import java.util.Scanner;
public class File2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the distance in KM:");
		double KM=sc.nextDouble();
		double meter=(KM)*(1000);
		double feet=(KM)*(3280.8399);
		double inch=(KM)*(39370.0787);
		double centimeter=(KM)*(100000);
		
		System.out.println(KM+" KM is "+meter+" meters");
		System.out.println(KM+" KM is "+feet+" feets");
		System.out.println(KM+" KM is "+inch+" inch");
		System.out.println(KM+" KM is "+centimeter+" centimeters");
	}

}
