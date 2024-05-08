package Mini_Programs;

import java.util.Scanner;

public class Largest_Threeno {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
     int a,b,c;
     a=sc.nextInt();
     b=sc.nextInt();
     c=sc.nextInt();
     int largest=biggestOfThree(a,b,c);
    System.out.println(largest);
	}

	private static int biggestOfThree(int a, int b, int c) {
		// TODO Auto-generated method stub
		return c>(a>b?a:b)?c:(a>b?a:b);
		
	}
}
