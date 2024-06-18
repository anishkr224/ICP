public class H2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n, sum=0, sum1=0;
		for(int i=3; i<=1000; i++){
			if(i%3==0){
				sum=sum+i;
			}
	}
			for(int j=5; j<=1000; j++){
				if(j%5==0){
				sum1=sum1+j;
		}
			}
		System.out.println("The sum of all the multiples of 3 or 5 below 1000 is "+(sum+sum1));
	}

}