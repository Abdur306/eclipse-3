package Inc1;

import java.util.Scanner;

public class Recursion {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	int a=s.nextInt();
	System.out.println(recur(a));
	}
public static int recur(int n) {
	if(n==1) {
		return n;
	
	}
	return n*recur(n-1);
}
}
