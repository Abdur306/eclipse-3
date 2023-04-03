package Inc1;                          /* sum of pair 5=(2,4)*/
import java.util.Scanner;
class Pair {
public static void main(String[] args) {

Scanner s=new Scanner(System.in);
System.out.println("enter the n:");
int n=s.nextInt();

System.out.println("enter the array");
int num =0;
int a[]= new int[n];
for(int i=0;i<n;++i) {
a[i]=s.nextInt();
}
System.out.println("enter the sum:");
int sum=s.nextInt();

for(int i=0;i<n;++i) {
for(int j=i+1;j<n;j++) {
for(int k=j+1;k<n;k++) { 
	if(a[i]+a[j]+a[k]==sum) {
	System.out.println(a[i]+"&" +a[j]+"&"+a[k]);
	break;
}
}
}
}
}
}

