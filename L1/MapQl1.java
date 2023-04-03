package L1;

import java.util.HashMap;
import java.util.Set;

public class MapQl1 {

	public static void main(String[] args) {
		charNum("JavaJ2Ee");
	}

static void charNum(String input) {
	HashMap<Character,Integer>charMap=new HashMap<Character,Integer>();
	char[]strArr=input.toCharArray();
	for(char c:strArr) {
		if(charMap.containsKey(c)) {
			charMap.put(c, charMap.get(c)+1);
		}
		else {
			charMap.put(c,1);
		}
	}
	Set<Character>charstr=charMap.keySet();
	for(Character ch:charstr) {
		 if(charMap.get(ch)>1) {
			 System.out.println(ch+":"+charMap.get(ch));
		 }
	}
}
}