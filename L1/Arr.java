package L1;

public class Arr {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		for(int i=0;i<5;i++) {
			System.out.println(a[i++]);
		}
		
		char a1[]= {'A','S','I','S','H'};
		int i=4;
		do {
			System.out.println(a1[i]);
			i--;
		}while(i>0);
		
		int a2[]= {'a','b','c','d','e'};
		for(int j=0;j<5;j++)
			System.out.println((char)a2[j]);

	}

}
