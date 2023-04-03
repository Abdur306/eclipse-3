package Inc1;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
 PDetails a[]=new PDetails[3];
for(int i=0;i<3;++i) {
	String name=sc.next();
	String age=sc.next();
	String gender=sc.next();
a[i]= new PDetails( name, age,gender);
	}
for(int i=0;i<3;++i) {
	
System.out.println(a[i].name+" "+a[i].age+" "+a[i].gender);

}
	}
	}
class PDetails{
	String name;
	String age;
	String gender;
	public PDetails(String name,String age,String gender) {
	this.name=name;
	this.age=age;
	this.gender=gender;
	}
	
}
