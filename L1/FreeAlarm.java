package L1;

public class FreeAlarm {

	public static void main(String[] args) {
	double d[]= {2.3,3.4,4.5};
	p(d);
	modify(d);p(d);
	modify2(d);p(d);
	modify(d);p(d);
	}
	private static void p(double d[]) {
		for(double d1:d)
			System.out.println(d1);
	}
	private static void modify(double d[]) {
		d[0]=d[1];
		d[1]=d[2];
		d[2]=d[0];
	}
	private static void modify2(double d[]) {
		d=new double[3];
		d[0]=d[1]=d[2]=0;
	}
}
