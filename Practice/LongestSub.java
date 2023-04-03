package Practice;

import java.util.Scanner;

public class LongestSub {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		String str=s.next();
		int max=0;
		for(int i=0;i<str.length()-1;i++){
			int count=1;
			for(int j=i+1;j<str.length()-1;j++){
				if(str.charAt(i)==str.charAt(j))
					break;
				else if(str.charAt(j+1)==str.charAt(j))
					break;
				else 
					++count;
			}
			if(max<count)
				max=count;
		}
		System.out.println(max);
	}
	}


