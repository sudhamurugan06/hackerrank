package Mini_Programs;

import java.util.Scanner;

public class OddorEven {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		using_Reminder(n);
		using_Bitwise(n);
	}

	private static void using_Bitwise(int n) {
		// TODO Auto-generated method stub
		System.out.println((n|1)>n);
		System.out.println((n&1)!=1);
	}

	private static void using_Reminder(int n) {
		// TODO Auto-generated method stub
		System.out.println(n%2==0);
	}
}
