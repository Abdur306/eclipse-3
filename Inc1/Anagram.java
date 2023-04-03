package Inc1;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size :");
		int n=s.nextInt();
		String a[]=new String[n];
		String c = "";
		System.out.println("Enter the Elements :");
		for(int i=0;i<n;i++){
			a[i]=s.next();
		}
String b=s.next();
String []temp=new String[n];
for(int i=0;i<a.length;++i) {
	c=a[i];

if(b.length()==c.length()) {
	for( i=0;i<b.length();++i) {
		for(int j=0;j<c.length();++j) {
			if(b.charAt(i)==c.charAt(j)) {
        System.out.print(c.charAt(i));
			 // break;
			}
		}
	}
	
}
}
//for(int i=0;i<c.length();++i)
//	System.out.println(c[i]);
	}
}