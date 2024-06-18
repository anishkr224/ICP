
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		int u=Math.max(a, b);
		int v=Math.max(u, c);
		int p=Math.min(a, b);
		int q=Math.min(p, c);
		int s=(a+b+c)-(v+q);
		System.out.println(q+", "+s+", "+v);
	}

}
