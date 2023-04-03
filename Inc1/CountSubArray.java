package Inc1;

import java.util.Scanner;

public class CountSubArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<n;++i){
			a[i]=s.nextInt();
		}
		int count=0;
		for(int i=0;i<n;i++){
			int total=0;
			for(int j=i;j<n;j++){
				total+=a[j];
				if(total==0)
					count++;
			}
		}
		System.out.println("The count is :"+count);


	}

}
