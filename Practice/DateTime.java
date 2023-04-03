package Practice;

import java.time.LocalDateTime;
import java.util.Date;

public class DateTime {

	public static void main(String[] args) {
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt+"      ");
		Date d=new Date(20);
		d.before(d);
		System.out.println(d.before(d)+" "+d.getDay());
	}

}
