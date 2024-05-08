package Mini_Programs;

import java.util.Scanner;

public class Fibonacciseries {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		fibonnaciSeries(n);
	}

	private static void fibonnaciSeries(int n) {
		// TODO Auto-generated method stub
		int a[]=new int[n*2+1];
		a[0]=0;
		a[1]=1;
		int sum=0;
		for(int i=2;i<=n*2;i++) {
			a[i]=a[i-1]+a[i-2];
			if(i%2==0) {
				sum+=a[i];
			}
		}
		System.out.println(sum);
	}
}
