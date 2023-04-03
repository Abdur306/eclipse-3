package Practice;

import java.util.Scanner;

class L2intprice{
	public static void main(String [] abu){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
		a[i]=s.nextInt();
	int sum=0;

	for(int i=0;i<n;i++){ /*3,2,6,5,0,3*/
	int c=0;
	if(a[i+1]-a[i]>0){
		c=a[i+1]-a[i];
	sum+=c;	
	}
	}
	System.out.println(sum);
	}
	}

