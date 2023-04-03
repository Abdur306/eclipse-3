package Inc1;

import java.util.*;

public class AlternateSwapp {

	public static void main(String[] args) {
		int temp;
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();
		for (int i = 0; i < n-1; ++i) {
			for (int j = 0; j < n - i - 1; ++j) {
				if (a[j] < a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp; 
				}
			}
		}
		// System.out.println(Arrays.toString(a));

		for (int i = 0; i < n; i =i+2) {
			temp = a[n - 1];
			for (int j = n - 1; j > i; j--) {
				a[j] = a[j - 1];
			}
			a[i] = temp;
		}
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
}
