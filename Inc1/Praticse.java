package Inc1;

import java.util.Arrays;
import java.util.Scanner;

public class Praticse {
	
	public static void main(String [] abu){
		
	Scanner s=new Scanner(System.in);
	String str=s.next();
	str+=" "+" ";
	char []y=str.toCharArray();
	int count;
	String temp="";
	for(int i=0;i<y.length;i++)
	{
		if(y[i]>='0'&& y[i]<='9')
		{
			if(y[i+1]>='0' && y[i+1]<='9')
			{
				count=((y[i]-48)*10+(y[i+1])-48);
			}
			else{
				count=y[i]-48;
			}
			for(char j=1;j<=count;j++){
				System.out.print(temp);
				
			}
			temp="";
			count=0;
			}
	    
			else{
				temp+=y[i];
			}
	}
	}

    }
	


