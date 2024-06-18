import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount of Water:");
		int w=sc.nextInt();
		if (w>=5000)
		System.out.println("\"Yes, Alice is following doctor's advice\".");
		else
		System.out.println("\"No, Alice is not following doctor's advice\".");
	}

}