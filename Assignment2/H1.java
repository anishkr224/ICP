import java.util.Scanner;
public class H1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of minutes:");
int min=sc.nextInt();
int year=min/525600;
int day=(min%525600)/1440;

System.out.println(min+" minutes is approximately "+year+" years and "+day+" days"); 
	}

}
