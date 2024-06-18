import java.util.Scanner;
public class H2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter today's day:");
		int today=sc.nextInt();
		System.out.println("Enter the number of days elapsed since today:");
		int elapsed=sc.nextInt();
		int future_day=(today+elapsed)%7;
		
		String day="", fday="";
		switch(today){
			case 0: day ="Sunday"; break;
			case 1: day ="Monday"; break;
			case 2: day ="Tuesday"; break;
			case 3: day ="Wednesday"; break;
			case 4: day ="Thrusday"; break;
			case 5: day ="Friday"; break;
			case 6: day ="Saturday"; break;
			default: System.out.println("Invalid Input");
		}
			switch(future_day) {
			case 0: fday ="Sunday"; break;
			case 1: fday ="Monday"; break;
			case 2: fday ="Tuesday"; break;
			case 3: fday ="Wednesday"; break;
			case 4: fday ="Thrusday"; break;
			case 5: fday ="Friday"; break;
			case 6: fday ="Saturday"; break;
			default: System.out.println("Invalid Input");
			}
			System.out.println("Today is "+day+" and the future day is "+fday);
		}
		
	}
