package Inc1;

import java.util.Arrays;
import java.util.Scanner;

class Alpha{
public static void main(String [] abu){
	
Scanner s=new Scanner(System.in);/*
String str=s.next();
char []y=str.toCharArray();
int count;
String temp="";
for(int i=0;i<y.length;i++)
{
	if(y[i]>=0 && y[i]<=9)
	{
		if(y[i+1]>=0 && y[i+1]<=9)
		{
			count=y[i]*10+y[i+1];
		}
		else{
			count=y[i];
		}
		for(int j=0;j<count;j++){
			System.out.print(temp);
			
		}
		temp="";
		count=0;
		}
    
		else{
			temp+=y[i];
		}
}*/
String str="abdur";
char []y=str.toCharArray();
boolean b[]=new boolean[y.length];
for(int i=0;i<y.length;i++) {
	if(y[i]>='a' && y[i]<='z') {
		b[i]=true;
	}
}
System.out.println(Arrays.toString(b));

 }
}
