package L1;

public class Draft {
public static void main(String[] args) {
	Integer i1=10;
	Integer i2=10;
	int a=5;
	int b=5;
	System.out.println(i1.equals(i2));
	System.out.println(a==b);
	System.out.println(i1==b);String str="Zoho";String str1="";
	for(int i=0;i<str.length();i++){
		char temp;
		if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
//			temp=str.charAt(i);
//			temp+=32;
			str1+=(char)(str.charAt(i)+32);
		}
		else{
			str1+=str.charAt(i);
			continue;
		}
	}
	System.out.println(str1);
}
}
