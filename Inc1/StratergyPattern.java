package Inc1;

public class StratergyPattern {
public static void main(String[] args) {
	Thing item=new Thing() {
	Dog tiger=new Dog();
	tiger.paly(item );

}
}
class Dog{
	
	public void paly(Thing item) {
		item.do_action();
		
	}
}
abstract class Thing{
	public abstract void do_action();
}
class Stick extends Thing{
	@Override
	public void do_action() {
		System.out.println("you beat i bite");
		
	}
}
class Stone extends Thing{
	public void do_action() {
		System.out.println("you throw i brake");
	}
}
class Water extends Thing{
	public void do_action() {
		System.out.println("you  pour i run");
	}
}
