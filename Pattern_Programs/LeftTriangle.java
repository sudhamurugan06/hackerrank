package Pattern_Programs;

import java.util.Scanner;

public class LeftTriangle {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		LeftTriangle(n);
		RightTriangle(n);
	}

	private static void LeftTriangle(int n) {
		// TODO Auto-generated method stub
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+ " ");
			}
			System.out.println("\n");
		}
	}

	private static void RightTriangle(int n) {
		// TODO Auto-generated method stub
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k+" ");
			}
			System.out.println("\n");
		}
	}
}
