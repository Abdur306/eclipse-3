package Level3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		List<List<String>> list=new ArrayList<>();
		List<List<Integer>> list1=new ArrayList<>();
		int n=5;
		n=scan.nextInt();
		for(int i=0;i<n;i++) {
			list.add(new ArrayList(1));
		}
		list.get(0).add("car");
		list.get(1).add("truck");
		list.get(2).add("bike");
		list.get(3).add("lorry");
		list.get(4).add("cycle");
		
		list.get(0).add("12");
		list.get(0).add("55");
		list.get(0).add("44");
		list.get(0).add("34");
		
		list.get(0).set(1, null);
		list.get(0).set(1, null);
		System.out.println(list);
	}
}
