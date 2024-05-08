package Mini_Programs;
import java.io.*;
import java.util.*;

public class Multiply_float {
	public static void main(String[] args) {
		Float f1, f2,f3,f4=(float) 1.0;
	System.out.println("Enter two float numbers:");
    Scanner sc=new Scanner(System.in);
//    f1=sc.nextFloat();
//    f2=sc.nextFloat();
//    System.out.println("The multiple is "+f1*f2);
    
    //Inputs from Same line
    String inputLine=sc.nextLine();
    String[] inputs=inputLine.split("\\s+");
    for(int i=0;i<inputs.length;i++) {
    	f3=Float.parseFloat(inputs[i]);
    	f4=f3*f4;
    	/*System.out.printf("%f %f",f3,f4);*/
    }
    System.out.printf("The answer is: %f",+f4);
	}
}
