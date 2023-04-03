package Level2;
import java.util.*;
public class LongSubStr {
		public static void main(String []abu){
		Scanner s=new Scanner(System.in);
		String str=s.next();
		System.out.println((Longsub(str)));
		}
		public static int Longsub(String str) {
			int res=0;
			String temp="";
			for(int i=0;i<str.length();i++) {
			for(int j=str.length()-1;j>=0;j--) {
				String pass="";
				for(int k=i;k<=j;k++) {
					pass+=str.charAt(k);
				}
				if(presornot(pass)) {
					if(pass.length()>res) {
						res=pass.length();
						temp=pass;
					}
				}
			}
			}
			System.out.println(temp);
			return res;
		}

			public static boolean presornot(String pass) {
				
			for(int i=0;i<pass.length();i++) {
				for(int j=i+1;j<pass.length();j++) {
					if(pass.charAt(i)==pass.charAt(j))
						return false;
				}
			}
			
				return true;
						}
}


