package Pattern_Programs;

import java.util.Scanner;

public class Mirror_Pyramid {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
	
		mirror_pyramid(n);
	}

	private static void mirror_pyramid(int n) {
		// TODO Auto-generated method stub
		//Top triangle
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.print("\n");
		}
		//Bottom triangle
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.print("\n");
		}
	}
}
