package Inc1;

import java.util.Scanner;

public class TypeCast {
	
public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	String s2=s.next();
	int in=s.nextInt();
strtonum(s2);
numtostr(in);
	
}
static void strtonum(String str) {
	//Scanner s=new Scanner(System.in);
	//String str=s1.next();
	int result=0;
	for(int i=0;i<str.length();i++) {
		result*=26;
		result+=str.charAt(i)-'A'+1;
	}
	System.out.println(result);
}
static void numtostr(int n) {
	//Scanner s=new Scanner(System.in);
	//int n=s1.nextInt();
	String temp="";
	while(n>0) {
		char c=(char)((n-1)%26+'A');
		n=(n-1)/26;
		temp=c+temp;
	}
	System.out.println(temp);
}
}
