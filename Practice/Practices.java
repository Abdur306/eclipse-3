package Practice;

import java.util.Scanner;

public class Practices {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);

	String str=s.nextLine();
	String word="";
	String rev="";
	str+=" ";
	System.out.print(Rev(str, rev, word, 0));
}
public static String Rev(String str,String rev,String wor,int index) {
	if(index==str.length())
		return rev;
	char c=str.charAt(index);
	if(c!=32)
		return Rev(str, rev, wor+c, index+1);
	else
	
	return Rev(str, wor+" "+rev, "", index+1);
}
}
