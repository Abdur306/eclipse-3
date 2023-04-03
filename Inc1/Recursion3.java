package Inc1;

import java.util.Scanner;

public class Recursion3 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int k=s.nextInt();
	System.out.println(findCount(n,k));
}
public static int findCount(int n,int tar) {
	if(n==0)
		return 0;
	int digit=n%10;
	if(digit==tar)
		return 1+findCount(n/10,tar);
	
	
	return findCount(n/10,tar);
}
}
