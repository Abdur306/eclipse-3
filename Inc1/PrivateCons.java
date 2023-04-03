package Inc1;

public class PrivateCons {

	public static void main(String[] args) {
		
 B.met();
	}

}
class B{
	private B() {
		System.out.println("private cons..");
		
	}
	public static void met() {
		B b=new B();
	}
}
class C extends B{
	
}
