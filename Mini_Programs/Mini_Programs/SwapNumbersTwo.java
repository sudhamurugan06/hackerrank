package Mini_Programs;
import java.io.*;
import java.util.*;

public class SwapNumbersTwo {
	public static void main(String[] args) {
		int n, m, temp;
		Scanner sc=new Scanner(System.in);
		String inputLine=sc.nextLine();
		String[] inputs=inputLine.split("\\s+");
		n=Integer.parseInt(inputs[0]);
		m=Integer.parseInt(inputs[1]);
		swapIntegersUsingThirdVariable(n,m);
		swapIntegersWithoutThirdVariable(n,m);
		swapIntegersUsingOperators(n,m);
		swapIntegersArithmeticOperator(n,m);
		
		
	}

	private static void swapIntegersArithmeticOperator(int n, int m) {
		// TODO Auto-generated method stub
		n= (n+m)-(m=n);//(a+b)-(b=a)
		System.out.printf("%d %d", n,m);
	}

	private static void swapIntegersUsingOperators(int n, int m) {
		// TODO Auto-generated method stub
		n=n^m;
		m=n^m;
		n=n^m;
		System.out.printf("%d %d ",n,m);
	}

	private static void swapIntegersWithoutThirdVariable(int n, int m) {
		// TODO Auto-generated method stub
		n=n-m;//n=2, m=1,n=2-1=1
		m=n+m;//n=1,m=1,m=1+1,2
		n=m-n;
		System.out.printf("%d %d ",n,m);
	}

	private static void swapIntegersUsingThirdVariable(int n, int m) {
		// TODO Auto-generated method stub
		int temp;
		temp=n;
		n=m;
		m=temp;
		System.out.printf("%d %d ",n,m);
		
	}
}
