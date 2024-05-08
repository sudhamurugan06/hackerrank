package Mini_Programs;

import java.util.Scanner;

public class Leapyear {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		isLeapyearorNo(n);
	
	}

	private static void isLeapyearorNo(int n) {
		// TODO Auto-generated method stub
		if(((n%4==0)&&(n%100!=0))||(n%400==0)) {
			System.out.printf("%d is a leap year",n);
			
		}
		else {
			System.out.println(n+" Its not a leap year");
		}
	}
	}
