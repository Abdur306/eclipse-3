package Practice;

import java.util.*;
public class ExceptionDemo2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Bank iob=new Bank();
		iob.show();
	}
}
class Bank{
	
	static Scanner s=new Scanner(System.in);
	int id[]=new int[5];
	int pass[]=new int[5];
	int k=0;
	static int uid=0;
	static int upass=0;
	
	public void show() {
		System.out.println("1.signup || 2.login || 3.show");
		int in=s.nextInt();
		switch(in) {
		case 1:
			signup();
			break;
		case 2:
			signin();
			break;
		case 3:
			display();
			break;
		}
	}
	
	public void signup() {
		System.out.println("enter id");
		id[k]=s.nextInt();
		System.out.println("enter pass");
		pass[k]=s.nextInt();
		k++;
		show();
		//signin()
	}
	public void display() {
		System.out.println("id "+" Pass");
		for(int i=0;i<k;i++) {
			System.out.println(id[i]+" "+pass[i]);
		}
		show();
	}
	public void signin() {
		try {
			System.out.println("enter id");
			 uid=s.nextInt();
			System.out.println("enter pass");
			 upass=s.nextInt();

			for(int i=0;i<id.length;i++) {
				if((uid==id[i]) && (upass==pass[i])) {
					System.out.println("login in success");
					break;
				}
			}
		}
		catch (InputMismatchException e) {
			signin();
		}
		
		//show();
	}
}                                  