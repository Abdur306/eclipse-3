package Practice;

import java.util.Scanner;

public class Pattern{
		public static void main(String[] args){
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the Number: ");
			int n=s.nextInt();
			int k=1;
			String temp="";
			String ans[]=new String[n];
			int c=0;
		    for(int i=0;i<n;i++){
				for(int j=0;j<=i;j++){
					if(j!=0){
					   temp+="*"+k;
					   System.out.print("*"+k++);
					   
					}
					else{
						temp+=k;
						System.out.print((k++));
					}
					if(j==i)
					   System.out.println();
				}
				ans[c++]=temp;
				temp="";
			}
			for(int i=ans.length-1;i>=0;i--)
				System.out.println(ans[i]);
		}

		
	}

