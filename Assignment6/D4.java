
public class D4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int res=numberOfDaysInAYear(i);
		for(int y=2000; y<=2020; y++) {
			System.out.println("Number of days in year "+y+" is: "+numberOfDaysInAYear(y));
		}
	}
		public static int numberOfDaysInAYear(int year) {
		//if(year%100==0 && year%400==0 || year%100!=0 && year%4==0);
		if(year%4==0 &&(year%400==0 || year%100!=0))
			return 366;
			else
		return 365;
		}
}

