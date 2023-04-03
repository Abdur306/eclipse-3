package L1;

public class Forever {
static int i=0;
	public static void main(String[] args) {
		for(int i=0;check(i);i++) {
			System.out.println(i+"-"+Forever.i);
		}
	}
	private static boolean check(int j) {
		i=j;
		return i<3;
		

	}

}
