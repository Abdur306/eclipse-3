package Practice;

import java.util.Scanner;

public class Consentric {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Number :");
	int n = s.nextInt();
	print(n);
}
private static void print(int n) {
	int rows=2*n-1;
	int start=0,end=rows-1;
	int arr[][]= new int[rows][rows];
	while(n!=0) {
		for(int i=start;i<=end;i++) {
			for(int j=start;j<=end;j++) {
				if(i==start || i==end||j==start||j==end) {
					arr[i][j]=n;
				}
			}
			//System.out.println();
		}
		n--;
		start++;
		end--;
	}
	for(int i=0;i<rows;i++) {
		for(int j=0;j<rows;j++) {
			System.out.print(arr[i][j]+" ");
			}
		System.out.println();
		}
	}

	}

	


