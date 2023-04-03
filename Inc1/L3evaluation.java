package Inc1;

import java.util.Scanner;

public class L3evaluation {
static Scanner s=new Scanner(System.in);
public static void main(String[] args) {

L3evaluation l3=new L3evaluation();
L3evaluation.rotate();
}

public static void rotate() {
	//Scanner s=new Scanner(System.in);
	System.out.println("enter 1 or 2");
	
int num=s.nextInt();
do{
switch(num){
	case 1:
	System.out.println("admin login");
	AdminLogin.adLog();
	break;
	case 2:
	System.out.println("Account login");
	AccountLogin.signup();
	break;
	case 3:
	System.out.println("press 1 or 2");
}
}while(num!=3);
}
}


class AdminLogin{
	public static void adLog(){
	Scanner s=new Scanner(System.in);
	System.out.println("enter username name");
	String u_name=s.next();
	System.out.println("enter password name");
	String p_pass=s.next();
	String username= "abdur";
	String password="Abu!123";
	if(u_name.equals(username)&&p_pass.equals(password)){
	System.out.println("Admin logged in successfully");	
	L3evaluation.rotate();
	}
	else   { 
		System.out.println("re-enter password");
        AdminLogin.adLog();	
	}
	}
}
class AccountLogin{
	public static void signup(){
	Scanner s=new Scanner(System.in);
	System.out.println("enter username name");
	String str_uname=s.next();
	System.out.println("enter password name");
	String str_pass=s.next();
	for(int i=0;i<str_pass.length();++i){
	if(str_pass.charAt(i)>6){
		System.out.println(" login successfully");
		signin(str_uname,str_pass);
	}
	else{
		System.out.println("re-enter password");
		AccountLogin.signup();	
	}
	}
	}
	public static void signin( String uname,String pass){	
		Scanner s=new Scanner(System.in);
		System.out.println("enter username name");
		String str2=s.next();
		System.out.println("enter password name");
		String str3=s.next();
		if(str2.equals(uname)&& str3.equals(pass)){
			System.out.println("Account sign in successfully");
		}
		else
		{
		System.out.println("re-enter password");
        AccountLogin.signin(uname,pass);
	}	
	}
    }
class Banking{
	static Scanner s1=new Scanner(System.in);
	static int id[]=new int[1];
	static int card[]=new int[1];
	static int pin[]=new int[1];
	static int balance[]= {5000};
	static int gcd[]= {500};
	
	 static void gift_Card(){
		//System.out.println("account id details");
		for(int i=1;i<=1;++i)
			id[i]=i;
		  int j=0;
		for(int i=1;i<=1;++i) {
			card[i]=(9999+j*2);
			pin[i]=(999+j*2);
			j++;
		}
		}
	 static void top_up() {
		 for(int i=1;i<=1;i++) {
			 
		 }
		 int amt=s1.nextInt();
		 for(int i=1;i<=3;++i) {
			 gcd[i]=500+amt;
		 }
	 }
	}
	

 

	


