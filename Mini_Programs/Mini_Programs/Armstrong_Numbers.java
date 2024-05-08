package Mini_Programs;

import java.util.Scanner;

public class Armstrong_Numbers {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int limit1=sc.nextInt();
		int limit2=sc.nextInt();
		CheckforArmstrong(limit1,limit2);
		ArmstrongNum(limit1, limit2);
	}

	private static void CheckforArmstrong(int limit1, int limit2) {
		int n;
		for(n=limit1;n<=limit2;n++) {
			
		int y=n,pwr=0;
			while(y!=0) {
				y/=10;
				++pwr;
			}
		
		int sum=0,last;
		y=n;
		while(y!=0) {
			last=y%10;
			y/=10;
			sum+=Math.pow(last, pwr);
		}
		if(sum==n) {
			System.out.println(n+" Is a armstrong no");
		}
		
	}
}
	private static void ArmstrongNum(int l, int h) 
    { 
        for (int j = l + 1; j < h; ++j) { 
  
            // Calculating number of digits 
            int y = j; 
            int N = 0; 
            while (y != 0) { 
                y /= 10; 
                ++N; 
            } 
  
            // Calculating the sum of nth 
            // power of all the digits 
            int sum_power = 0; 
            y = j; 
            while (y != 0) { 
                int d = y % 10; 
                sum_power += Math.pow(d, N); 
                y /= 10; 
            } 
  
            // Checking if the current number 
            // i is equal to the sum of nth 
            // power of all the digits 
            if (sum_power == j) 
                System.out.print(j + " "); 
        } 
    } 
  
}