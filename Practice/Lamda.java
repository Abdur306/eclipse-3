package Practice;

import java.util.Optional;

public class Lamda {

	public static void main(String[] args) {
	
		String str[]=new String[5];
		str[1]="abdur";
	    if(str[0]==null)
	    	System.out.println("null");
	    else
	    	System.out.println("value");
	    
	    Optional.ofNullable(str[1]).ifPresentOrElse((x)->{System.out.println(x);}, ()->{System.out.println("No Null");});
	    str[2]="jameel";
        Optional.ofNullable(str[2]).ifPresentOrElse(Class::execute, Class::print);
	}
}

class Class{
	public static void print() {
		System.out.println("Null");
	}
	public static void execute(String s) {
		System.out.println(s);
	}
}