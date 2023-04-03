package Inc1;

public class Abstract {
public static void main(String[] args) {
	Result rs=new Addition();
	System.out.println(rs.calculate());
}
}
abstract class Result{
	int a=25;
	int b=6;
	public Result() {
	view();
	}
	public void view() {
		System.out.println("hai..welcome");
	}
	public abstract int calculate();
}
class Addition extends Result{
	@Override
	public int  calculate() {
		int c=a+b;
		return c;
	}
}
class Subtraction extends Result{
	@Override
	public int  calculate() {
		int c=(int)(a-b);
		return c;
		
	}
}
class Multiplication extends Result{
	 @Override
	public int calculate() {
		 int c=a*b;
		return c;
		
	}
}
class Division extends Result{
	@Override
	public int calculate() {
		int c=a/b;
		return c;
	}
}




