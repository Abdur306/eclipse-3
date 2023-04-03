package Practice;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	String a[]=new String[n];
	for(int i=0;i<n;i++){
		a[i]=s.next();

	}int c=0;
	String str=s.next();
	//char []y=str.toCharArray();
	for(int i=0;i<n;i++){
	if(a[i].length()==str.length()){
	
	for(int j=0;j<a.length;j++) {
		for(int k=0;k<str.length();k++) {
			if((a[j].equals(str.charAt(k)))) {
				c++;
			}
		}
		
	}
	for(int q=0;q<n;q++) {
		if(c==a[q].length())
			System.out.print(a[q]);
	}
	


	}	
		
	}
	}
	}


