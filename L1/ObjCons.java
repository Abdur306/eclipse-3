package L1;

public class ObjCons {

	public static void main(String[] args) {
		Bill obj=new Bill(10);
		//System.out.println(obj.price);
		//obj.display();
		String s=new String("5");
		
		
		System.out.println(1+10+s+1+10);

	}

}
class Bill{
	int price;
	public Bill(int price) {
     this.price=price;
	}
	public void display() {
		int price=20;
		System.out.println(price);
	}
}
