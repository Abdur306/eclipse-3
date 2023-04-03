package Inc1;

import java.util.Scanner;

public class L3Array {

	public static void main(String [] abu){

	Employee emp=new Employee();
	emp.Show();

	}
	}
	class Employee{
	   static Scanner s=new Scanner(System.in);
		String Name[]=new String[2];
		int Year[]=new int[2];
		String Address[]=new String[2];
		static int k=0;
		
	 public void Show(){
		
		 System.out.println("enter the name");
		 Name[k]=s.next();
		 System.out.println("enter the Salaray");
		 Year[k]=s.nextInt();
		 System.out.println("enter the Address");
		 Address[k]=s.next();
		 
		 k++;
		// Show();
		 met();
	 }
	 void met(){
		  System.out.println(" Name\t+Year\t+Address\t");
		 for(int i=0;i<3;i++){
		System.out.println(Name[i]+"\t"+Year[i]+"\t"+Address[i]+"\t");	 
		 }
	 }
	}
