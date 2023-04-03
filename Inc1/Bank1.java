import java.util.*;
class BankingApplication{
public static void main(String [] abu){


show();
}
public static void show(){
	Scanner s=new Scanner(System.in);
BankCustomer bc=new BankCustomer();
System.out.println("1.Initialize | 2.Add Customer | 3.view | 4. Basic Operations | 5.exit");
int n=s.nextInt();
switch( n){
	case 1:
	     bc.initialize();
		  break;
    case 2:
         bc.Add_customer();
          break;
    case 3:
         bc.Show_customer();
           break;
    
	case 4:
          
		  break;	
	
 
}	
}
}



class BankCustomer extends BankingApplication{

Scanner s=new Scanner(System.in);
//int custId[]=new int[10];
//int AccountNo[]=new int[10];
//String Name[]=new String[10];
//int Balance[]=new int[10];
//String EncryptedPwd[]=new String[10];
int customerid=11;
int accountnum=11011;
int k=0;
static int ini=0;


public void initialize(){
	int Ini_custId[]=new int[4];
    int Ini_AccountNo[]=new int[4];
    String Ini_Name[]=new String[4];
    int Ini_Balance[]=new int[4];
    String Ini_EncryptedPwd[]=new String[4];
	
	Ini_custId[0]=11;
	Ini_AccountNo[0]=11011;
	Ini_Name[0]="Kumar";
	Ini_Balance[0]=10000;
	Ini_EncryptedPwd[0]="ApipNbjm";
	
	Ini_custId[1]=22;
	Ini_AccountNo[1]=22022;
	Ini_Name[1]="Madhu";
	Ini_Balance[1]=20000;
	Ini_EncryptedPwd[1]="Cboljoh";
	
	Ini_custId[2]=33;
	Ini_AccountNo[2]=33033;
	Ini_Name[2]="Rahul";
	Ini_Balance[2]=30000;
	Ini_EncryptedPwd[2]="dbnvt";
	
	Ini_custId[3]=44;
	Ini_AccountNo[3]=44044;
	Ini_Name[3]="Robin";
	Ini_Balance[3]=40000;
	Ini_EncryptedPwd[3]="kbwb22";
	System.out.println("custId\t"+"Acc.No\t"+"Name\t"+"Balance\t"+"En_Pwd\t");
	for(int i=0;i<4;i++){
		System.out.println(Ini_custId[i]+"\t"+Ini_AccountNo[i]+"\t"+Ini_Name[i]+"\t"+Ini_Balance[i]+"\t"+Ini_EncryptedPwd[i]+"\t");
	}
	BankingApplication.show();
}

public void Add_customer(){

int New_custId[]=new int[6];
int New_AccountNo[]=new int[6];
String New_Name[]=new String[6];
int New_Balance[]=new int[6];
String New_EncryptedPwd[]=new String[6];
int customerid=11;
int accountnum=11011;
int t=5;
	New_custId[ini]=customerid*(ini+t);
	New_AccountNo[ini]=accountnum*(ini+t);
	New_Name[ini]=s.next();
	New_Balance[ini]=10000*(ini+t);
	New_EncryptedPwd[ini]=s.next();
	

System.out.println("custId\t"+"AccountNo\t"+"Name\t"+"Balance\t"+"EncryptedPwd\t");
System.out.println(New_custId[ini]+"\t"+New_AccountNo[ini]+"\t"+New_Name[ini]+"\t"+New_Balance[ini]+"\t"+New_EncryptedPwd[ini]+"\t");
	t++;
	ini++;
BankingApplication.show();
}
//}
//class NewBank extends BankingApplication{
public void Show_customer(){
	int custid[]=new int[4+5];
	
	for(int i=0;i<Name.lenghth;i++){
		System.out.println(custId[i]+AccountNo+Name[i]+Balance[i]+EncryptedPwd[i]);	
	}
	//=Ini_EncryptedPwd[4]+New_EncryptedPwd[6];
	System.out.println("custId\t"+"AccountNo\t"+"Name\t"+"Balance\t"+"EncryptedPwd\t");
	
	
}
	

	/*System.out.println("custId\t"+"AccountNo\t"+"Name\t"+"Balance\t"+"EncryptedPwd\t");
    System.out.println(custId[k]+"\t"+AccountNo[k]+"\t"+Name[k]+"\t"+Balance[k]+"\t"+EncryptedPwd[k]+"\t");*/
	
//	
	
	}
	 

		
		
	
	




