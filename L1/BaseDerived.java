package L1;

public class BaseDerived {

	public static void main(String[] args) {
		System.out.println(new Derived().getname());
		System.out.println(new Derived().name);
	}
}
class Base{
	public String name="base";
}
class Derived extends Base{
	private final String name="Derived";
	public String getname() {
		return name;
	}
}