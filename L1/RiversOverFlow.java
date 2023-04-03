package L1;

public class RiversOverFlow {
	
	public static void main(String[] args) {
		
		int a=0;
		int b=9;
		RiversOverFlow ro=null;
		int c=ro.ganga(a,b);
		long d=ro.yamuna(a,b);
		ro=new RiversOverFlow();
		long e=ro.ganga(c,d);
		System.out.println("a"+b+"c"+d+"e");
	}
	private static int ganga(int a,int b) {
		System.out.println("a"+b);
		return a+b;
	}
	private static int yamuna(int b,int a) {
		System.out.println(a+"b");
		
		return a-b;
	}
	private long ganga(int a,long b) {
		System.out.println(a+b);
		return a+b;
	}
	
}
