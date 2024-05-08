package Mini_Programs;

import java.util.Scanner;

public class LCM_TwoNumbers {
	public static void main(String args[]) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		int ans = (a>b)?a:b;
		while(true) {
			if(ans%a==0 && ans %b==0)
				break;
			System.out.println(ans);
			ans++;
		}
		System.out.println("LCM OF "+a+"and "+":"+ans);
		System.out.println(using_LCM(a,b));
		System.out.println(GCD(a,b));
	}

	private static int GCD(int a, int b) {
		// TODO Auto-generated method stub
		if(a==0) {
			return b;
		}
		return GCD(b%a,a);
	}

	private static int using_LCM(int a, int b) {
		// TODO Auto-generated method stub
		int x= (a/using_GCD(a,b))*b;
		System.out.println(x);
		return x;
	}

	private static int using_GCD(int a, int b) {
		// TODO Auto-generated method stub
		if(a==0) {
			return b;
		}
		int y=using_GCD(b%a,a);
		System.out.println(y);
		return y;
	}
	
}
