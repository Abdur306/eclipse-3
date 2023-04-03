package Level2;

import java.util.Scanner;

public class PayPal {

   public static void main(String[] args) {
	  Scanner s=new Scanner(System.in);
	  String input=s.next();
	  int n=s.nextInt();
	  int len=(input.length()/2)+1;
	  char arr[][]=new char[n][len];
	  for(int i=0;i<n;i++) {
		  for(int j=0;j<len;j++)
			  arr[i][j]=' ';
	  }
	  set(arr,input,n);
	  for(int i=0;i<n;i++) {
		  for(int j=0;j<len;j++)
			  System.out.print(arr[i][j]+" ");
		  System.out.println();
	  }
   }
//   public static void set(char arr[][],String input,int row) {
//	   int a=0,b=0;
//	   int k=0;
//		  while(k<input.length()) {
//		   a=0;
//		   while(a<row) {
//			   if(k==input.length())
//				   return;
//			   if(arr[a][b]==' ')
//			      arr[a][b]=input.charAt(k++);
//			   a++;
//		   }
//		   a--;
//		   while(a>=0) {
//			   if(k==input.length())
//				   return;
//			   if(arr[a][b]==' ')
//			      arr[a][b]=input.charAt(k++);
//			   a--;
//			   b++;
//			}
//		   
//		   b--;
//		  }
//   }
   
   
   public static void set(char arr[][],String str,int row ){
		int a=0,b=0,k=0;
		while(k<str.length()){
		a=0;
	     while(a<row){
			 if(k==str.length())
				 return;
	     if(arr[a][b]==' '){
			 arr[a][b]=str.charAt(k++);
		 }
	 a++;
	}		 
		a--;
		while(a>=0){
			if(k==str.length())
				return;
			if(arr[a][b]==' '){
				arr[a][b]=str.charAt(k++);
			}
			a--;
			b++;
			
		}
		b--;
		}
	}
}

