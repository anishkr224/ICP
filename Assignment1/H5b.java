
public class H5b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int W=10,G=20,K=30, A=40;
	    System.out.println("Before swapping: W="+W+", G="+G+", K="+K+", A="+A);
	    W=W+G+K+A;
	    A=W-(G+K+A);
	    K=W-(G+K+A);
	    G=W-(G+K+A);
	    W=W-(G+K+A);
	    System.out.println("After swapping: W="+W+", G="+G+", K="+K+", A="+A);
	
	}

}
