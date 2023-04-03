package Inc1;

import java.util.Scanner;

public class CreateObj {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int l=s.nextInt();
		int b=s.nextInt();
	Rectangle rc=new Rectangle(l,b);
	System.out.println(rc.Rect(l, b));
	Rectangle rc1=new Rectangle(l,b);
	l=s.nextInt();
    b=s.nextInt();
	System.out.println(rc1.Rect(l,b));
	
	

}
}
class Rectangle{
	public Rectangle(int l,int b) {
	l=length;
	b=breath;
	}
	int length;
	int breath;
	
 public int Rect(int l,int b) {
		int c=l*b;
	return c;
 }
}
