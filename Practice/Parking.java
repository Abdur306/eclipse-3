package Practice;

import java.util.Scanner;

public class Parking {

	public static void main(String[] args) {

	}
}
class Slot{
	
}
class ParkingSlot extends Slot{
	char slot[][]=new char[fl][sl];
	static Scanner s1=new Scanner(System.in);
	
	public void show() {
	for(int i=0;i<fl;i++) {
		for(int j=0;j<sl;j++) {
			slot[i][j]='E';
		}
	}
	}
	public void Mainshow() {
		System.out.println("1.parking || 2.unparking || 3.exit");
		int in=s1.nextInt();
		switch(in) {
		case 1:
			ParkVechile();
			break;
		case 2:
			UnparkVechile();
			break;
		case 3:
			break;
		}
	}
	public void ParkVechile() {
		
		
	}
	public void UnparkVechile() {
		
	}
	
}
	
class Admin{
	static int fl;static int sl;
	static Scanner s2=new Scanner(System.in);
	
	public void Action() {
		System.out.println("enter row");
		fl=s2.nextInt();
		System.out.println("enter column");
		sl=s2.nextInt();
	}
	
}
class User{
	
}
	
	

