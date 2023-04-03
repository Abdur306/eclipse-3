package Practice;

import java.util.*;

public class Anagram2 {
	public static void main(String [] abu){
		
	Scanner s=new Scanner(System.in);
	System.out.println("size");
	int n=s.nextInt();
	String str[]=new String[n];
	System.out.println("elements");
  for(int i=0;i<n;i++)
	  str[i]=s.next();
  String temp="";
  System.out.println("Target");
  String st=s.next();
  int c=0;
  for(int i=0;i<n;i++) {
	  for(int j=0;j<st.length();j++){
	  if(str[i].length()==st.length()) {
		  if(str[i].charAt(j)==st.charAt(j)) {
			  temp+=str[i];  
		  }
		  else
			  continue;
		  
		  }
	  else
		  continue;
	  }
	  
	 
  }
  
  System.out.println(temp);//asps pass saps spas
	}
}
