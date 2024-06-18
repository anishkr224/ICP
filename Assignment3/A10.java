import java.util.Scanner;
public class A10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mark:");
		int m=sc.nextInt();
		
		switch(m/10)
		{
		case 10:
		case 9: System.out.println("O"); break;
		case 8: System.out.println("A"); break;
		case 7: System.out.println("B"); break;
		case 6: System.out.println("C"); break;
		case 5: System.out.println("D"); break;
		case 4: System.out.println("E"); break;
		default: System.out.println("F"); break;
		
		/* System.out.println("Enter the marks of a student out of 100 full mark"); 
		int mark=sc.nextInt(); 
		switch(mark/10) 
		{ 
		case 0: 
		case 1: 
		case 2: 
		case 3: 
		System.out.println("F"); 
		break; 
		case 4: 
		System.out.println("E"); 
		break; 
		case 5: 
		System.out.println("D");break; 
		case 6: 
		System.out.println("C");break; 
		case 7: 
		System.out.println("B");break; 
		case 8: 
		System.out.println("A");break; 
		case 9: 
		case 10: 
		System.out.println("O");break; 
		default: 
		System.out.println("Invalid Input"); 
		break; */
		}
}
}
