package Pattern_Programs;

import java.util.Scanner;

public class Upper_RightTriangle {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
	
		RightTriangle(n);
	}
	private static void RightTriangle(int n) {
		// TODO Auto-generated method stub
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
