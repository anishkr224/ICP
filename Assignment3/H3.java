import java.util.Scanner;
public class H3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int month=(int)((Math.random()*12)+1);
		String name_of_month="";
		switch(month) {
		case 0: name_of_month ="January"; break;
		case 1: name_of_month ="February"; break;
		case 2: name_of_month ="March"; break;
		case 3: name_of_month ="April"; break;
		case 4: name_of_month ="May"; break;
		case 5: name_of_month ="June"; break;
		case 6: name_of_month ="July"; break;
		case 7: name_of_month ="August"; break;
		case 8: name_of_month ="September"; break;
		case 9: name_of_month ="October"; break;
		case 10: name_of_month ="November"; break;
		case 11: name_of_month ="December"; break;
		default: System.out.println("invalid input");
		}
		System.out.println("Month chosen by the Computer: "+name_of_month);
		
	}

}
