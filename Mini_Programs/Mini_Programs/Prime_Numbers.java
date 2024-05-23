package Mini_Programs;

import java.util.Scanner;

public class Prime_Numbers {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		prime_Number(n);
		seive_Erathostenes(n);
	}

	private static void seive_Erathostenes(int n) {
		// TODO Auto-generated method stub
		Boolean prime[]=new Boolean[n+1];
		for(int i=0;i<n;i++) {
			prime[i]=true;
		}
		for(int p=2;p*p<=n;p++) {
			if(prime[p]==true) {
				for(int i=p*p;i<=n;i+=p) {
					prime[i]=false;
				}
			}
		}
		 for (int i = 2; i <= n; i++) {
	            if (prime[i] == true)
	                System.out.print(i + " ");
	        }
	}

	private static void prime_Number(int n) {
		// TODO Auto-generated method stub
		int x,y;
		int flag=1;
		for( x=2;x<=n;x++) {
			
			flag=1;
			 for (y = 2; y * y <= x; y++) {
//				 System.out.println("x value is"+x);
//             	System.out.println("y value is"+y);
	                if (x % y == 0) {
	                	
	                    flag = 0;
	                    break;
	                }
	            }
			 if(flag==1) {
				 System.out.println(" prime "+x);
			 }
			
		}
		
	}
}
