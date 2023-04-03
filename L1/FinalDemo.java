package L1;

public class FinalDemo {
     int lanif=37;
     int nafi=27;
	public static void main(String[] args) {
		final int assign;
		final FinalDemo f=new FinalDemo();
	    f.process2();
	    FinalDemo f2=modify(f);
	    f2.process();
	}
	public static final  FinalDemo modify(final FinalDemo f) {
		f.process();
		FinalDemo f2=new FinalDemo();
		f2.process();
		return f2;
	}
	final void process() {
		lanif=nafi+nafi;
		System.out.println(lanif+" "+nafi);
		
	}
	void process2() {
		nafi=lanif/2;
		System.out.println(nafi+" "+lanif);
		
		
	}
}
