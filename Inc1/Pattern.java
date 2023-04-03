package Inc1;

import java.util.Scanner;
import java.util.regex.Matcher;

public class Pattern {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();int limit=0;
	int size=n,l=0,r=n-1;
	int a[][]=new int[n][n];
	while(limit<n){
	for(int i=l;i<=r;i++){
	for(int j=l;j<=r;j++){
	if(i==l||i==r||j==l||j==r){
	a[i][j]=n-3;
	}
	}
	}
	l++;r--;n--;limit++;
	}
	for(int i=0;i<size;++i){
	for(int j=0;j<size;++j){
	System.out.print(a[i][j]);
	}
	System.out.println();
	}
}

public static Pattern compile(String regex) {
	// TODO Auto-generated method stub
	return null;
}

public Matcher matcher(String password) {
	// TODO Auto-generated method stub
	return null;
}
}
