package Level2;

import java.util.Scanner;

public class ChartoNumRepeat {

	public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter str ");
	 String str=s.next();
	 int result=0;
	 for(int i=0;i<str.length();i++) {
		 result*=26;
		 result+=str.charAt(i)-'A'+1;
	 }
		 System.out.println("conversion of str into num");
	System.out.println(result);
	
	System.out.println("enter num");
	int n=s.nextInt();
	String temp="";
	while(n>0) {
		char c =(char)((n-1)%26+'A');
	     n=(n-1)/26;
	     temp+=c;
	}
	System.out.println("conversion of num into str");
	System.out.println(temp);
		}
	}
