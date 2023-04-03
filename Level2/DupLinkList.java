package Level2;

import java.util.LinkedList;
import java.util.Scanner;

public class DupLinkList {

	public static void main(String[] args) {
	   Scanner s=new Scanner(System.in);
	   LinkedList<Integer>arr=new LinkedList<>();
	   System.out.println("Enter size");
	   int n=s.nextInt();
	   System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			arr.add(s.nextInt());
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr.get(i)==arr.get(j)) {
					arr.set(j, 0);
				}
			}
			if(arr.get(i)!=0) {
				System.out.println(arr.get(i));
			}
		}
		
		
	}
}
