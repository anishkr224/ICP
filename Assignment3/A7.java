import java.util.Scanner;
public class A7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of units consumed:");
		int u=sc.nextInt();
		System.out.println("Do you want to pay online(y/n):");
		char op=sc.next().charAt(0);
		
		double price=0.0;
		if (u<=50)
			price=u*3.0;
		else if (u>50 && u<= 200)
			price=(50*3.0)+(u-50)*4.80;
		else if (u>200 && u<=400)
		price=(50*3.0)+(150*4.80)+(u-200)*5.80;
		else
			price=(50*3.0)+(150*4.80)+(200*5.80)+(u-400)*6.20;
		
		System.out.println("Total amount: "+price);
		double dis=0.0;
		if(op=='y' || op=='y')
			dis=0.03*price;
		System.out.println("Discount:"+dis);
		System.out.println("Amount payable: "+(price-dis));

}

}
