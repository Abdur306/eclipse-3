package L1;

public class BolCheck {

	public static void main(String[] args) {
//	int res=0;
//	boolean b1=new Boolean("True");
//	boolean b2=new Boolean("true");
//	boolean b3=new Boolean("tRuE");
//	boolean b4=new Boolean("false");
//	
//	if(b1==b2)
//		res=1;
//	if(b1.equals(b2))
//		res+=10;
		int i=1,j=10;
		do {
			if(i++>--j) {continue; }
		}while(i<5);
		System.out.println(i +" "+j);
	}
}
