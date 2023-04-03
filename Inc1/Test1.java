package Inc1;

import java.util.Scanner;

public class Test1 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int a[]=new int[n];
	int st=0,en=0;
	for(int i=0;i<n;i++)
		a[i]=s.nextInt();
	int target=s.nextInt();
	for(int i=0;i<n;i++){
		int k=0;
		for(int j=0;j<n;j++){
			k+=a[j];
			if(k==target){
				st=i;
				en=j;
				break;
			}
		}
	}
	for(int i=st;i<en;i++)
		System.out.println(a[i]);
	      
	}
	
}

