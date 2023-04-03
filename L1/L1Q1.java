package L1;

import java.util.Scanner;

public class L1Q1 {
public static void main(String[] args) {
int a=10;
System.out.println(++a*a++);
//System.out.println(a*a--);
//System.out.println(++a*++a);
//System.out.println(++a*a++);
//System.out.println(a++*a++);
//System.out.println(a*a++);
Scanner s=new Scanner(System.in);
String str=s.next();
String temp="";
for(int i=0;i<str.length();i++) {
	temp+=(char)(str.charAt(i)+1);
}
System.out.print(temp);
}
}

