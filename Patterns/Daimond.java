package Patterns;

import java.util.Scanner;

public class Daimond {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no..");
		int n = s.nextInt();
		for(int i=1;i<=n*2-1;i++){
			if(i<n){
				for(int s1=1;s1<=n-i;s1++){
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++){
					if( j==1 || j==i )
					System.out.print("* ");
					else
						System.out.print("  ");
				}
			}
			else{
				for(int s1=1;s1<=i-n;s1++){
					System.out.print(" ");
				}
				for(int j=1;j<=(n*2)-i;j++){
					if( j==1 || j==(n*2)-i )
						System.out.print("* ");
					else
						System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}