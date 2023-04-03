package Inc1;


import java.util.Scanner;

public class LiftModule {
	int arr[]=new int[5];
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		
		LiftModule lm=new LiftModule();
		lm.display_lift();
		lm.assign_lift();
	}
		 void display_lift() {
		System.out.println(" lift :L1\tL2\tL3\tL4\tL5\t ");
		System.out.print("floor : ");
		for(int i=0;i<arr.length;++i ) {
	    System.out.print(arr[i]+ " \t");		
		}
		}
		 void assign_lift() {
			 System.out.print("\n enter the initial flr\n");
			 int initial=s.nextInt();
			 System.out.print("enter the destination flr\n");
			 int destination=s.nextInt();
		   if(initial <=10 && destination <=10) {
			for(int i=0;i<arr.length;++i) {
				if(arr[i]==0) {
					arr[i]=destination;
				    break;	
				  }
			    }
			System.out.println(" lift :L1\tL2\tL3\tL4\tL5\t ");
			System.out.print("floor :");
			for(int i=0;i<arr.length;++i) 
				System.out.print(arr[i]+" \t");
			System.out.print(" \n Assign once again = 1 || Quit = 2 \n");    
			int n=s.nextInt();
			switch(n) {
			case 1:
				assign_lift();
				break;
			case 2:
				break;
			
			}
		   }
		   
		   else {
			   System.out.println("|----------|");
			   System.out.println("|Re-enter!!| floor within 10 floors");
			   System.out.println("|----------|");
			   assign_lift();
		   }
			
		 }
	}


