package Mini_Programs;

import java.util.Scanner;

public class IsVowel {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String ch=sc.nextLine();
	String vowels="aeiouAEIOU";
			if(vowels.indexOf(ch)!=-1) {
				System.out.println("vowel");
			}
			else {
				System.out.println("consonant");
			}
	
	}
}
