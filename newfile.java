// To check if a number is repeated within a number 
// Input: 54422
// It is not a unique number

import java.util.*;

public class Main {
	public static void main(String[] args) {
		int tot=0;
		ArrayList<Character> obj=new ArrayList();
		System.out.print("Input the number: ");
		Scanner scan=new	Scanner(System.in);
		int num=scan.nextInt();
		String str_num=Integer.toString(num);
		int len=str_num.length();
		for (int i=0;i<len;i++) {
			obj.add(str_num.charAt(i));
		}
		for (int i=0;i<len;i++) {
			char a=str_num.charAt(i);
			for (int j=0;j<obj.size();j++) {
				if (a==obj.get(j)) {
					tot=tot+1;
				} else {
					continue;
				}
			}
		}
		if (len==tot) {
			System.out.println("It is a unique number");
		} else {
			System.out.println("It is not a unique number");
		}
	}
}
