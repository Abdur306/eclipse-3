package Level3;

import java.util.ArrayList;
import java.util.Scanner;

public class BankingApp {

	public static void main(String[] args) {
		met();
	}
	public static void met() {
		Scanner s=new Scanner(System.in);
		System.out.println("1.Abu Bank || 2.Iob Bank || 3.Exist ");
		int a=s.nextInt();
		switch(a) {
		case 1:
			AbuBank ab=AbuBank.createObject();
			ab.aburedirect();
			break;
		case 2:
			IobBank ib=IobBank.creatObject();
			ib.iobredirect();;
			break;
		case 3:
			System.out.println("Visit Again !");
			break;
		   
		}
	}
}
abstract class Bank1{
	public abstract void Signup();
	public abstract void Signin();
	public abstract void CheckBalance(int index);
	public abstract void Transfer(int index);
	public abstract void Deposit(int index);
	public abstract void TransHistory(int index);
	 int initail=1000;
	int count=1;
}
class AbuBank extends Bank1{
	
	static Scanner s1=new Scanner(System.in);
	ArrayList<Details2> abulist=new ArrayList<>();
	ArrayList<Details3> history=new ArrayList<>();
	private static AbuBank obj;
	int a=0;
	private AbuBank() {
		// TODO Auto-generated constructor stub
	}
	public static AbuBank createObject() {
		if(obj==null)
			obj=new AbuBank();
		return obj;
	}
	
	static int no=1001;
	String str1="Abu";
	
	
	
	@Override
	public void Signup() {	
	System.out.println("Enter Name");
	String name=s1.next();
	System.out.println("Enter Password");
	String password=s1.next();
	System.out.println("Enter Phone");
	String phone=s1.next();
	String AccNum=String.valueOf(str1+no++);
	int iniAmt=initail;
	System.out.println("Account created Successfully\n");
	System.out.println("Name:"+name+"  Acc.num:"+AccNum+"  Balance:"+iniAmt);
	System.out.println();
    history.add(new Details3(iniAmt, AccNum, iniAmt));
	abulist.add(new Details2(name, password, phone, AccNum, iniAmt));
	for(int i=0;i<abulist.size();i++) {
		System.out.println(abulist.get(i));
	}
	aburedirect();
	}
	
	@Override
	public void Signin() {
		if(count!=3) {
		boolean res=true;
		System.out.println();
		System.out.println("Abu..........Login Page..........Bank");
		System.out.println();
		System.out.println("Enter the Name");
	String uname=s1.next();
	System.out.println("Enter the Password");
	String upass=s1.next();
	for(int i=0;i<abulist.size();i++) {
	if((uname.equals(abulist.get(i).name)) && upass.equals(abulist.get(i).password)){
		res=false;
		a=i;
	System.out.println("Login successfull");
	ActiveAcc(a);
	}
	}
	if(res) {
		System.out.println("No Records forund");
		Signin();
	    }
		}else {
			
				System.out.println(".........System Alert........");
				System.out.println("would you like to continue ??");
				System.out.println("    1.Signin || 2.Mainmenu   ");
				int con=s1.nextInt();
				if(con==1) 
					Signin();
				else if(con==2) 
					aburedirect();
		}
	}
		
		public void ActiveAcc(int i) {
		System.out.println(" 1.Deposit || 2.Transfer || 3.checkBalance || 4.TransHistory || 5.Logout");
		int in=s1.nextInt();
		switch(in) {
		case 1:
			Deposit(i);
			break;
		case 2:
	         Transfer(i);
	         break;
		case 3:
			 CheckBalance(i);
			 break;
		case 4:
			 TransHistory(i);
			 break;
		case 5:
			aburedirect();
			break;
		
		}
	}
	
	@Override
	public void Transfer(int index) {
		System.out.println();
		IobBank io=IobBank.creatObject();
		System.out.println("Enter AccountNo");
		String tAccNo=s1.next();
		if(tAccNo.substring(0, 3).equals(str1)) {
			for(int i=0;i<abulist.size();i++) {
				if(tAccNo.equals(abulist.get(i).AccNum)) {
					System.out.println("Enter amt");
					int tamt=s1.nextInt();
					System.out.println(" Amt Transfered Successfully ");
//					abulist.get(i).iniamt+=tamt;
//					 abulist.get(index).iniamt-=tamt;
		            abulist.get(index).setIniamt1(abulist.get(index).iniamt-tamt);
		            abulist.get(i).setIniamt(abulist.get(i).iniamt+tamt);
		            history.add(new Details3(tamt,abulist.get(index).AccNum,abulist.get(index).iniamt));
		            history.add(new Details3(tamt, abulist.get(i).AccNum,abulist.get(i).iniamt));
					
				}
			}
		}
		else if(tAccNo.substring(0, 3).equals(io.str11)) {
			for(int i=0;i<io.ioblist.size();i++) {
				if(tAccNo.equals(io.ioblist.get(i).AccNum)) {
					System.out.println("Enter amt");
					int tamt=s1.nextInt();
					System.out.println(" Amt Transfered Successfully ");
//					io.ioblist.get(i).iniamt+=tamt;
//					 io.ioblist.get(index).iniamt-=tamt;
		            abulist.get(index).setIniamt1(io.ioblist.get(index).iniamt-tamt);
		            io.ioblist.get(i).setIniamt(io.ioblist.get(i).iniamt+tamt);
		            history.add(new Details3(tamt,io.ioblist.get(index).AccNum,io.ioblist.get(index).iniamt));
		            io.historyiob.add(new Details3(tamt, io.ioblist.get(i).AccNum,io.ioblist.get(i).iniamt));
					
				}
		}
		}
		else {
			System.out.println("Incorrect Account Number ");
			
		}
	ActiveAcc(a);
	}
	@Override
	public void CheckBalance(int index) {
		System.out.println("Name  : "+abulist.get(index).name+" AccoNo : "+abulist.get(index).AccNum);
		System.out.println("Current Balance : "+abulist.get(index).iniamt);
		
		ActiveAcc(a);
	}
     	
	@Override
	public void TransHistory(int index) {
		System.out.println("Transactions\t A.No\tBalance\t");
		for(int i=0;i<history.size();i++) {
			if(abulist.get(index).AccNum.equals(history.get(i).type))
			System.out.println(history.get(i));
		}
		
		ActiveAcc(a);
	}
	@Override
	public void Deposit(int index) {
		System.out.println("Enter amt to  deposit");
		int damt=s1.nextInt();
		System.out.println("Amt Deposited");
		int dbal=abulist.get(index).iniamt+damt;
		abulist.get(index).setIniamt(dbal);
		history.add(new Details3(damt,abulist.get(index).AccNum, dbal));
		//System.out.println(abulist.get(index));
		
		ActiveAcc(a);
	}
	public void aburedirect() {
		System.out.println("Abu......  1.Create Account || 2.Login || 3.Back  ......Bank");
		int dir=s1.nextInt();
		if(dir==1) {
			Signup();
		}
		else if(dir==2) {
			Signin();
		}
		else if(dir==3) {
			BankingApp.met();
		}
		else {
			System.out.println("1-3 number were allowed");
			aburedirect();
		}
	}
	
	
}
class IobBank extends Bank1{
	
	static Scanner s1=new Scanner(System.in);
	ArrayList<Details2> ioblist=new ArrayList<>();
	ArrayList<Details3> historyiob=new ArrayList<>();
	private static IobBank obj;
	int p=0;
	private IobBank() {
		// TODO Auto-generated constructor stub
	}
	public static IobBank creatObject() {
		if(obj==null)
			obj=new IobBank();
		return obj;
	}
	
	static int num=10001;
	String str11="Iob";
	
	
	
	
	
	@Override
	public void Signup() {
		
		System.out.println("Enter Name");
		String name=s1.next();
		System.out.println("Enter Password");
		String password=s1.next();
		System.out.println("Enter Phone");
		String phone=s1.next();
		String AccNum=String.valueOf(str11+num++);
		int iniAmt=initail;
		System.out.println("Account created Successfully\n");
		System.out.println("Name:"+name+"  Acc.num:"+AccNum+"  Balance:"+iniAmt);
		System.out.println();
	    historyiob.add(new Details3(iniAmt, AccNum, iniAmt));
		ioblist.add(new Details2(name, password, phone, AccNum, iniAmt));
		for(int i=0;i<ioblist.size();i++) {
			System.out.println(ioblist.get(i));
		}
		iobredirect();
		
	}
	
	@Override
	public void Signin() {
		if(count!=3) {
		boolean res=true;
		System.out.println();
		System.out.println("Iob..........Login Page..........Bank");
		System.out.println();
		System.out.println("Enter the Name");
	String uname=s1.next();
	System.out.println("Enter the Password");
	String upass=s1.next();
	for(int i=0;i<ioblist.size();i++) {
	if((uname.equals(ioblist.get(i).name)) && upass.equals(ioblist.get(i).password)){
		res=false;
	System.out.println("Login successfull");
	p=i;
	ActiveAcc1(p);
		}
	}
	if(res) {
		System.out.println("No Records forund");
		count++;
		Signin();
	}
		}else {
			System.out.println(".........System Alert........");
			System.out.println("would you like to continue ??");
			System.out.println("    1.Signin || 2.Mainmenu   ");
			int con=s1.nextInt();
			if(con==1) {
				Signin();
			}
			else if(con==2) {
				iobredirect();
			}
		}
		
	}
	public void ActiveAcc1(int i) {
	System.out.println(" 1.Deposit || 2.Transfer || 3.checkBalance || 4.TransHistory || 5.Logout");
	int in=s1.nextInt();
	switch(in) {
	case 1:
		Deposit(i);
		break;
	case 2:
         Transfer(i);
         break;
	case 3:
		 CheckBalance(i);
		 break;
	case 4:
		 TransHistory(i);
		 break;
	case 5:
		iobredirect();
		break;
	
	}
	}
	@Override
	public void Deposit(int index) {
	
		System.out.println("Enter amt to  deposit");
		int damt=s1.nextInt();
		System.out.println("Amt Deposited");
		int dbal=ioblist.get(index).iniamt+damt;
		ioblist.get(index).setIniamt(dbal);
		historyiob.add(new Details3(damt,ioblist.get(index).AccNum, dbal));
		//System.out.println(ioblist.get(index));
		
		ActiveAcc1(p);
		
	}
	@Override
	public void CheckBalance(int index) {
		System.out.println("Name  : "+ioblist.get(index).name+" AccoNo : "+ioblist.get(index).AccNum);
		System.out.println("Current Balance : "+ioblist.get(index).iniamt);
		
		ActiveAcc1(p);
		
	}
	@Override
	public void TransHistory(int index) {
		
		System.out.println("Transactions\t A.No\tBalance\t");
		for(int i=0;i<historyiob.size();i++) {
			if(ioblist.get(index).AccNum.equals(historyiob.get(i).type))
			System.out.println(historyiob.get(i));
		}
		
		ActiveAcc1(p);

		
	}
	@Override
	public void Transfer(int index) {
		
		System.out.println("Enter AccountNo");
		String tAccNo=s1.next();
		if(tAccNo.substring(0, 3).equals("Iob")) {
			for(int i=0;i<ioblist.size();i++) {
				if(tAccNo.equals(ioblist.get(i).AccNum)) {
					System.out.println("Enter amt");
					int tamt=s1.nextInt();
					System.out.println(" Amt Transfered Successfully ");
//					ioblist.get(i).iniamt+=tamt;
//					 ioblist.get(index).iniamt-=tamt;
		            ioblist.get(index).setIniamt1(ioblist.get(index).iniamt-tamt);
		            ioblist.get(i).setIniamt(ioblist.get(i).iniamt+tamt);
		            historyiob.add(new Details3(tamt,ioblist.get(index).AccNum,ioblist.get(index).iniamt));
		            historyiob.add(new Details3(tamt, ioblist.get(i).AccNum,ioblist.get(i).iniamt));
					
				}
			}
		}
		else if(tAccNo.substring(0, 3).equals("Abu")) {
			AbuBank aa=AbuBank.createObject();
			for(int i=0;i<aa.abulist.size();i++) {
				if(tAccNo.equals(aa.abulist.get(i).AccNum)) {
					System.out.println("Enter amt");
					int tamt=s1.nextInt();
					System.out.println(" Amt Transfered Successfully ");
//					aa.abulist.get(i).iniamt+=tamt;
//					 aa.abulist.get(index).iniamt-=tamt;
		            ioblist.get(index).setIniamt1(aa.abulist.get(index).iniamt-tamt);
		            aa.abulist.get(i).setIniamt(aa.abulist.get(i).iniamt+tamt);
		            historyiob.add(new Details3(tamt,aa.abulist.get(index).AccNum,aa.abulist.get(index).iniamt));
		            aa.history.add(new Details3(tamt, aa.abulist.get(i).AccNum,aa.abulist.get(i).iniamt));
					
				}
		}
		}
		else {
			System.out.println("Incorrect Account Number ");
			
		}
	ActiveAcc1(p);
		
	}
	public void iobredirect() {
		System.out.println("Iob.....1.Create Account || 2.Login || 3.Back......Bank ");
		int dir=s1.nextInt();
		if(dir==1) {
			Signup();
		}
		else if(dir==2) {
			Signin();
		}
		else if(dir==3) {
			BankingApp.met();
		}
		else {
			System.out.println("1-3 number were allowed");
			iobredirect();
		}
	}
	
}
class Details3{
	int amt;
	String type;
	int bal;
	public Details3(int amt,String type,int bal) {
	this.amt=amt;
	this.type=type;
	this.bal=bal;
	}
	@Override
	public String toString() {
	
		return amt+"\t\t"+type+"\t"+bal+"\t";
	}
}
class Details2{
	String name;
	String password;
	String phone;
	String AccNum;
	int iniamt;
	public Details2(String name,String password,String phone,String AccNum,int iniamt) {
	this.name=name;
	this.password=password;
	this.phone=phone;
	this.AccNum=AccNum;
	this.iniamt=iniamt;
	}

	public void setIniamt(int iniamt) {
		this.iniamt = iniamt;
	}
	public void setIniamt1(int iniamt) {
		this.iniamt = iniamt;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		
		
		
		return name+"\t"+password+"\t"+phone+"\t"+AccNum+"\t"+iniamt+"\t";
	}
}