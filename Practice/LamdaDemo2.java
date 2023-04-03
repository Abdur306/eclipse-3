package Practice;



public class LamdaDemo2 {

	public static void main(String[] args) {
//		Jam  jameel=(int a,int b)-> {
//			System.out.println(a+b);
//		};
//    jameel.add(40, 50);
	Abu abdur=(int k,int a)->{int res=k+a;return res;};
	System.out.println(abdur.add(250,350));
	Jam jameel= (int z,int x)->{met();};
	}
	public static void met() {
		
	}
}

interface Jam{
 public void add(int a,int b);
}
interface Abu{
	public int add(int i,int j);
}

