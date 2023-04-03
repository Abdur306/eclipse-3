package Practice;

public class AbstractDemo {

	public static void main(String[] args) {
		 Crow c=new Crow();
		 c.add(8, 2);
		 Owl o=new Owl();
		 o.add(8, 2);

	}
}
abstract class bird
{
	public abstract void add(int i,int j);
//	public abstract void sleep();
	
}
class Crow extends bird
{
	@Override
	public void add(int i,int j) {
		int c=i+j;
System.out.println("res : "+c);
	}
//	public void sleep() {
//		System.out.println("ni8");
//			}
//			
}
class Owl extends bird
{
	@Override
	public void add(int i,int j) {
		int c=i/j;
System.out.println("res : "+c);
	}
}
//	public void sleep() {
//		System.out.println("morng");
//			}
//			
