package Practice;

import java.util.Scanner;

public class AlphaCount {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
   char[]y=str.toCharArray();
   int count=0;
   char c=' ';
   for(int i=0;i<y.length;i++) {
	   if(y[i]>=48 && y[i]<=57) {
		   count=y[i]-48;
	   }
	   else {
		   c=y[i];
	   }
	   for(int j=0;j<count;j++) {
		   System.out.println(c);
	   }
	   c=' ';
	   count=0;
   }
}
		
}
