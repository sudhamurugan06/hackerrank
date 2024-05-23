package Mini_Programs;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	    int n=sc.nextInt();
	    FactorialNumber(n);
	    
}

	private static void FactorialNumber(int n) {
		// TODO Auto-generated method stub
		int val=1;
		for (int i=n;i>=1;i--) {
			val=i*val;
		}
		
		System.out.println("The factorial number is "+val);
	}
}
