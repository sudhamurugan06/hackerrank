package Mini_Programs;

import java.util.Scanner;

public class NeonNumber {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		String s=sc.next();
		int n=Integer.parseInt(s);
		checkNeonNumber(n);
	}

	private static void checkNeonNumber(int n) {
		// TODO Auto-generated method stub
		int mul,sum=0;
		mul=(int) Math.pow(n, 2);
		while(mul!=0) {
			sum=sum+(mul%10);
			mul/=10;
		}
		if(sum==n) {
			System.out.println("It is a neon number");
		}
		else {System.out.println("Its not a neon number");
		
				
	}
	
}
}