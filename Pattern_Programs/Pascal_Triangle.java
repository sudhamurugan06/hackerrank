package Pattern_Programs;

import java.util.Scanner;

public class Pascal_Triangle {
	public static void main(String[] args)
    {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		pascal_Pattern(n);
    }

	private static void pascal_Pattern(int n) {
		Pascal_Triangle p=new Pascal_Triangle();
		// TODO Auto-generated method stub
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print(p.factorial(i)/(p.factorial(i-j)*p.factorial(j))+" ");
			}
			System.out.println();
		}
	}

	private int factorial(int i) {
		// TODO Auto-generated method stub
		if (i==0)
				return 1;
		return i*factorial(i-1);
	}
}
