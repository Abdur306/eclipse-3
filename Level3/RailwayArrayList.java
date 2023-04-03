package Level3;

import java.util.ArrayList;
import java.util.Scanner;

public class RailwayArrayList {

	public static void main(String[] args) {

			UserRail sr=new UserRail();
		sr.Re_direct();

		}
		}
		class UserRail{
			 int pnr=99,s_no=1;
			 static int lower=2,middle=2,upper=2,rac=2,w_L=2,C_berth=(lower+middle+upper)+1;
			
			int seats=lower+middle+upper+rac+w_L;
				static Scanner s2=new Scanner(System.in);
				static ArrayList<Details>arr=new ArrayList<>();
				
		public void Availabilites(){
			System.out.println("Lower\t Middle\t Upper\t Rac\t W.List\t");
			System.out.println(lower+"\t"+middle+"\t"+upper+"\t"+rac+"\t"+w_L+"\t");
			
			MainMenu();

		}
		public void Re_direct(){
			System.out.println("1.Admin || 2.user || 3.Exist ");
			int in=s2.nextInt();
			switch(in){
				
		      case 1:
		    	Admin2 ll=new Admin2();
		          	ll.Login();
		            break;			
			   case 2:
			        MainMenu();
					break;
				case 3:
				     break;
			}
		}
		public void MainMenu(){
			System.out.println("1.Availabilites || 2.Bookings || 3.Cancel || 4.MainMenu ");
			int mm=s2.nextInt();
			switch(mm){
			   case 1:
		      	   Availabilites();
				   break;
				case 2:
				     Book();
					 break;
				case 3:
				    Cancel();
					break;
				case 4:
				Re_direct();
				break;
			}
			
		 }
		public void Book(){
			System.out.println("How many Tickets Book");
			int tck=s2.nextInt();
			if(tck<=seats){
			for(int i=1;i<=tck;i++){
				if(w_L==0){
					System.out.println("No-Tickets");
					break;
				}
				System.out.println("Enter Name");
				String Name=s2.next();
				System.out.println("Enter Age");
				int Age=s2.nextInt();
				System.out.println("Enter Gender");
				String Gender=s2.next();
				System.out.println("Enter L | M | U");
				String seat=s2.next();
				String Berth=berth(seat,Age);
				int Pnr=pnr;
				int  Seatno=s_no++;
				if(Berth.equals(rac)|| Berth.equals(w_L))
				arr.add(new Details(Name,Age,Gender,Pnr));
			    else
				arr.add(new Details(Name,Age,Gender,Pnr,Seatno,Berth));
				System.out.println("Ticket Booked Successfully !");
				System.out.println("Name\tAge\tGender\tPnr\tBerth\tSeatno\t ");
				System.out.println(Name+"\t"+Age+"\t"+Gender+"\t"+Pnr+"\t"+Berth+"\t"+Seatno+"\t");
			}pnr++;
			 }
			else{
				System.out.println("No-Tickets");
			    MainMenu();
			}
			MainMenu();
		  }
			public String berth(String seat,int age){
				String str="";
				if(age>=60 )
			{
					if(lower>0){
					lower--;
					return str+="L";
				}
				else if(middle>0){
					middle--;
					return str+="M";
				}
				else if(upper>0){
					upper--;
					return str+="U";
				}
				else if(rac>0){
					rac--;
					return str+="Rac";
				}
				
				else if(w_L>0){
					w_L--;
					return str+="WL";
				}
			}
				if(age<=5)
				{
					
					return "No-berth";
				}
				
				if(seat.equals("L"))
			{
					
					if(lower>0){
					lower--;
					return str+="L";
				}
				else if(middle>0){
					middle--;
					return str+="M";
				}
				else if(upper>0){
					upper--;
					return str+="U";
				}
				else if(rac>0){
					rac--;
					return str+="Rac";
				}
				else if(w_L>0){
					w_L--;
					return str+="WL";
				}
			        
			}
				else if(seat.equals("M"))
			{
				  if(middle>0){
					middle--;
					return str+="M";
				}
				else if(upper>0){
					upper--;
					return str+="U";
				}
				else if(rac>0){
					rac--;
					return str+="Rac";
				}
				else if(w_L>0){
					w_L--;
					return str+="WL";
				}
			
			}
				else if(seat.equals("U"))
			{
			        if(upper>0){
					upper--;
					return str+="U";
				}
				else if(rac>0){
					rac--;
					return str+="Rac";
				}
				else if(w_L>0){
					w_L--;
					return str+="WL";
				}		
			}
				else if(lower==0 && middle==0 && upper==0 && rac>0)
				{
					rac--;
					return str+="rac";
				}
				else if(lower==0 && middle==0 && upper==0 && rac==0)
				{
					w_L--;
					return str+="WL";	
				}
			return str;
			}

			

		public void Cancel(){
			System.out.println("Enter Seat.No to Cancel");
			int C_sno=s2.nextInt();
			for(int i=1;i<=arr.size();i++){
				if(arr.get(i)!=null && arr.get(i).Seatno==C_sno){
					if(arr.get(C_berth)!=null){
						System.out.println("Ticket No "+ C_sno+" Cancelled Successfully !");
						arr.get(i).Name=arr.get(C_berth).Name;
						arr.get(i).Age=arr.get(C_berth).Age;
						arr.get(i).Gender=arr.get(C_berth).Gender;
						Swapp(C_berth);
						w_L++;
						
					}
					else{
					arr.get(i).Name=null;
		            arr.get(i).Age=0;
		            arr.get(i).Gender=" ";
		            arr.get(i).Pnr=0;
		            if(arr.get(i).Berth.equals("L"))
		              lower++;				
					else if(arr.get(i).Berth.equals("M"))
		              middle++;				
					if(arr.get(i).Berth.equals("U"))
		              upper++;				
					}
					
				}
			}
			
		 }
		 public void Swapp(int j){
			 if(j==arr.size()-1 || arr.get(j)==null){
				 MainMenu();
			 }
			 arr.get(j).Name=arr.get(j+1).Name;
			 arr.get(j).Age=arr.get(j+1).Age;
			 arr.get(j).Gender=arr.get(j+1).Gender;
			 Swapp(j++);
			 
			 
			}
			
			
			
		}
		class Details{
			String Name;
			int Age;
			String Gender;
			int Pnr;
			int Seatno;
			String Berth;
			public Details(	String Name,int Age,String Gender,int Pnr,int Seatno,String Berth){
				this.Name=Name;
				this.Age=Age;
				this.Gender=Gender;
				this.Pnr=Pnr;
				this.Seatno=Seatno;
				this.Berth=Berth;
			}
				public Details(	String Name,int Age,String Gender,int Pnr){
				this.Name=Name;
				this.Age=Age;
				this.Gender=Gender;
				this.Pnr=Pnr;
			}
			public String toString(){
				
				return Name+"\t"+Age+"\t"+Gender+"\t"+Pnr+"\t"+Seatno+"\t"+Berth+"\t";
			}
			
			
			
			
			
			
		}

		class Admin2 extends UserRail{
			static Scanner s3=new Scanner(System.in);
			
			public void Login(){
				String usName="Abdur";
				String usPass="Abu@306";
				System.out.println("Enter UserName");
				String uname=s3.next();
				System.out.println("Enter Password");
				String upass=s3.next();
				if(uname.equals(usName) && upass.equals(usPass))
					System.out.println("Login succesfully");
				show();
			}
			public void show(){
				System.out.println("1.View || 2.MainMenu");
				int sss=s3.nextInt();
				switch(sss){
				case 1:
				    view();
					break;
				case 2:
				   MainMenu();
				    break;
				}
			}
			public void view(){
				
			System.out.println("Name\t Age\t Gender\t Pnr\t Seatno\t Berth\t");
			for(int i=0;i<arr.size();i++)
			System.out.println(arr.get(i));
			
			Re_direct();
			}
			
			
		}