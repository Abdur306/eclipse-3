package Practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
	public static void main(String[] args){
      Divide();
	}
	public static void Divide() {
		 Scanner s=new Scanner(System.in);
		
		try {
			int a=s.nextInt();
			int b=s.nextInt();
			int result=0;
			 result=a/b;
			System.out.println(result);
		}catch(InputMismatchException e){
			System.out.println("decleare only integer values");
			Divide();
		}
	}
}
