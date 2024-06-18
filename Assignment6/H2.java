import java.util.Scanner;
public class H2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Input x, y and z: ");
int x=sc.nextInt();
int y=sc.nextInt();
int z=sc.nextInt();
while(true) {
System.out.println("Enter your option: 0.Quit 1.Sphere 2.Cuboid 3.cube");
int op=sc.nextInt();
switch(op) {
case 0: return;
case 1: System.out.println("Res="+sphereVolume(x)); break;
case 2: System.out.println("Res="+cuboidVolume(x,y,z)); break;
case 3: System.out.println("Res="+cubeVolume(x)); break;
default: System.out.println("Invalid Operation");
    }
    }
	}
	public static double sphereVolume(double r) {
		return (Math.PI*r*r*r)*(4/3);
	}
	public static double cuboidVolume(double l, int b, int h) {
		return l*b*h;
	}
	public static int cubeVolume(int s) {
		return s*s*s;
	}
}
