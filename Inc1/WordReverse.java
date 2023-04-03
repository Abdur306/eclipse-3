package Inc1;

import java.util.Scanner;

public class WordReverse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int start=0,end=0;
		String str=s.nextLine();
		char []y=str.toCharArray();
        reverse(y,0,y.length-1);
    for(end=0;end<y.length;end++) 
    	if(y[end]==46) {
    		reverse(y, start, end-1);
    		start=end+1;
    	}
    	reverse(y, start, end-1);
       System.out.println(y);
    }
	
	static void reverse(char[] y,int s,int e) {
		while(s<e) {
		char temp=y[s];
		y[s]=y[e];
		y[e]=temp;
		s++;
		e--;
	}
}
	
}