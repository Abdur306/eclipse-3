package Inc1;

//import java.util.Arrays;
import java.util.Scanner;

public class Reversetring {

	public static void main(String[] args) {
		                                        /*S = i.like.this.program.very.much
	     		                                Output: much.very.program.this.like.i*/
Scanner s=new Scanner(System.in);
String str= s.next();
//char ch;
String temp=" ";


System.out.print("Original word: ");
System.out.println(str); //Example word

for (int i=0; i<str.length(); i++)
{
 
temp+=  str.charAt(i); 
System.out.print(temp);
}

}

}
