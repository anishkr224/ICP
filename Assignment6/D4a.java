public class D4a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int y=2000; y<=2020; y++) {
	int days=numberOfDaysInAYear(y);
	System.out.println(y+": "+days+" days");
    }
}
	public static int numberOfDaysInAYear(int year) {
		if(year%100==0) {
			if(year%400==0)
				return 366;
			else
				return 365;
		}
		else
		{
			if(year%4==0)
				return 366;
			else
				return 365;
		}
	}
}
