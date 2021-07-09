import java.util.*;
import java.lang.Math;
public class Main {
	public static void main(String[] args) {
		System.out.print("Input the value of a: ");
		Scanner scan=new	Scanner(System.in);
		int a=scan.nextInt();
		System.out.print("Input the value of b: ");
		int b=scan.nextInt();
		System.out.print("Input the value of c: ");
		int c=scan.nextInt();
		int D=b*b-4*a*c;
		System.out.println("The value of discriminant is "+D);
		if (D>0) {
			double d2=Math.sqrt(D);
			int b2=0-b;
			double x1 = (b2+d2)/2*a;
			double x2= (b2-d2)/2*a;
			System.out.println("The values of x are "+x1+" and "+x2);
		} else if (D==0) {
			int b2=0-b;
			double x=(b2)/2*a;
			System.out.println("The value of x is "+x);
		} else {
			System.out.println("There are no real roots");
		}
	}
}