import java.util.Scanner;
public class H1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int c=(int)(Math.random()*3);
		System.out.println("Scissor(0), Rock(1), Paper(2):");
		int u=sc.nextInt();
		String cc="", uu="";
		if (c==0)
			cc="Scissor";
		else if (c==1)
			cc="Rock";
		else if(c==2)
			cc="Paper";
		if (u==0)
			uu="Scissor";
		else if (u==1)
			uu="Rock";
		else if(u==2)
			uu="Paper";
		System.out.print("The computer is "+cc+". You are "+uu+". ");
		
		if(c==u)
			System.out.println("It's a tie.");
		else
		{
			if(c==0 && u==2)
				System.out.println("The computer won.");
			else if (c==2 && u==0)
				System.out.println("You won.");
			else if (c>u)
				System.out.println("The computer won.");
			else
				System.out.println("You won.");
				
		}
			
	}

}
