package Practice;

public class objArray {

	public static void main(String[] args) {
		Object []s1=new Object[5];
		s1[0]=100;
		s1[1]="abdur";
		System.out.println(s1[0]+" "+s1[1]);
		Emplyoee use[]=new Emplyoee[5];
//      use[0]="jam";
//       use[1]=1000;
		use[0]=new Emplyoee(1000,"jam");
		System.out.println(use[0]);
       
	}
}
class Emplyoee{
	int n;
	String str;
	public Emplyoee(int n,String str) {
		this.n=n;
		this.str=str;
	}
	public String toString() {
		return n+" "+str;
	}
}