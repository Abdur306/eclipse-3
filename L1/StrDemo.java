package L1;

public class StrDemo {
public static void main(String[] args) {
	final StringBuffer a=new StringBuffer();
	final StringBuffer b=new StringBuffer();
	new Thread() {
		public void run() {
			System.out.println(a.append("A"));
			synchronized (b)
		}
	}.start();
	new Thread() {
		public void run() {
			System.out.println(b.append("C"));
			synchronized(a)
		}
System.out.println(a);
	}.start();
}
}
