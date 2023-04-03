package Practice;

public class ConsMeth {

	public static void main(String[] args) {

//		Suthish c1=new Suthish("Suthish");
//		c1.print();
		Suthish c2=new Suthish();
		c2.initialize("Suthish from method 2");
		c2.print();
		
		
		
	}

}
class Suthish{
	String name;
	public Suthish(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	public Suthish() {
		// TODO Auto-generated constructor stub
	}
	void initialize(String name) {
		this.name=name;
	}
	void print() {
		System.out.println("Name : " + name);
	}
}