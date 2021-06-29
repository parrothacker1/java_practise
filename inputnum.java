// To get input from user and display sum and diff 
// Try catch exception program
import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		try {
			System.out.print("Enter the first number: ");
			Integer num1=read.nextInt();
			System.out.print("Enter the second number: ");
			Integer num2=read.nextInt();
			Integer sum=num1+num2;
			Integer diff=num1-num2;
			String str1=String.format("The sum is %d",sum);
			String str2=String.format("The difference is %d",diff);
			System.out.println(str1);
			System.out.println(str2);
		} catch (InputMismatchException e) {
			System.out.println("Please enter a number and try again");
		}
	}
}
