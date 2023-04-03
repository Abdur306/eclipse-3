package Level2;

import java.util.Scanner;

public class Equilibrium {
/*	static int eqbmindex(int array[], int n)  
	{  
	int i, j;  
	//lsum denotes the left sum and rsum denotes the right sum  
	int lsum=0, rsum=0;  
	for (i = 0; i < n; ++i)   
	{  
	for (j = 0; j < i; j++)  
	lsum = lsum + array[j];  
	for (j = i + 1; j < n; j++)  
	rsum = rsum + array[j];   
	if (lsum == rsum)  
	return i;  
	}  
	return -1;  
	}  
	public static void main(String args[])  
	{  
	int array[] = {5,2,7,2,0};  
	int arraysize = array.length;  
	System.out.print("Equilibrium Index is: ");  
	System.out.println(eqbmindex(array, arraysize));  
	}  */
	//public class Equilibrium{
		public static void main(String[] args){
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the number of elements : ");
			int n=scan.nextInt();
			int arr[]=new int[n];
			System.out.println("Enter the elements : ");
			for(int i=0;i<n;i++)
				arr[i]=scan.nextInt();
			for(int i=0;i<n;i++){
				if(sumArr(arr,0,i+1)==sumArr(arr,i+2,n)){
					System.out.println(i+1);
					return;
				}
			}
			System.out.println(-1);
		}
		
		static int sumArr(int arr[], int start, int end){
			int sum=0;
			for(int i=start;i<end;i++)
				sum+=arr[i];
			return sum;
		}
	}  

