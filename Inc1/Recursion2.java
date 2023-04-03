package Inc1;

import java.util.Scanner;

public class Recursion2 {
	
	public static void main(String[] args)
    {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
 System.out.println(findSum(a,n));
    }    
   public static  int findSum(int A[], int N)
    {
        if (N == 0)
            return 0;
        return (findSum(A, N - 1) + A[N - 1]);
    }
}
