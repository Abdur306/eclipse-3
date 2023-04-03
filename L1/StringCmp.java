package L1;

public class StringCmp {
	public static void main(String[] args) {
 String s1="hello";
 String s2=new String("hello");
 String s3="hello";
 if(s1==s2) {
	 System.out.println("==");
 }else {
	 System.out.println("!=");
 }
 if(s1==s3) {
	 System.out.println("==");
 }else {
	 System.out.println("!=");
 }

	}
}
