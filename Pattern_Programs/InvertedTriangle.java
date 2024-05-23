package Pattern_Programs;

public class InvertedTriangle {
	  public static void main(String[] args)
	    {
	        int num = 7;
	        for(int i=1;i<=num;i++) {
	        	for(int j=1;j<=i;j++) {
	        		System.out.print(" ");
	        		System.out.print(" ");
	        	}
	        	for(int j=num-i+1;j>=1;j--) {
	        		System.out.print(j<10?j+" ":j+"");
	        	}
	        	for(int j=num-i;j>=1;j--) {
	        		System.out.print(j+1<10?j+1+" ":j+1+"");
	        	}
	        	System.out.print("\n");
	        }
}
}
