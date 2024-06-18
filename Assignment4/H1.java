public class H1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,sq=0;
		for(int i=1; i<=10; i++)
		{
			int i1=i;
			i1=(i*i);
			sum=sum+i1;
		}
		System.out.println("The sum of the squares of the first ten natural numbers is: "+sum);
	int sum1=0;
	for(int i=1; i<=10; i++)
	{
		 sum1=sum1+i;
		 sq=sum1*sum1;
	}
	System.out.println("The square of the sum of the first ten natural numbers is: "+sq);
	System.out.println("Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is: "+sq+"-"+sum+"="+(sq-sum));
}	
	
	}

