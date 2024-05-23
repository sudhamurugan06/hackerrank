package Mini_Programs;
import java.io.*;
import java.util.*;

public class AddBinaryStrings {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String x=sc.nextLine();
		String y=sc.nextLine();
		String result=add_Binary(x,y);
		System.out.println(result);
		System.out.print(add_Binary_TwoPointer(x,y));
	}

	private static String add_Binary_TwoPointer(String x, String y) {
		// TODO Auto-generated method stub
		int i=x.length()-1;
		int j=y.length()-1;
		int carry=0;
		StringBuilder result=new StringBuilder();
		while(i>=0||j>=0) {
			int sum=carry;
			if(i>=0) {
				sum+=x.charAt(i)-'0';
			}
			if(j>=0) {
				sum+=y.charAt(j)-'0';
			}
			if (sum==0||sum==1) {
				result.append(sum);
				carry=0;
			}
			else if(sum==2) {
				result.append("0");
				carry=1;
			}
			else {
				result.append("1");
				carry=1;
			}
			i--;
			j--;
		}
		if(carry==1) {
			result.append("1");
		}
		return result.reverse().toString();
	}

	private static String add_Binary(String x, String y) {
		// TODO Auto-generated method stub
		int num1=Integer.parseInt(x,2);
		int num2=Integer.parseInt(y,2);
		int sum=num1+num2;
		String result=Integer.toBinaryString(sum);
		return result;
		
	}
}
