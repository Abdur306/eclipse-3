package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
    Map<Integer,String> arr=new HashMap<Integer,String>();
   arr.put(2, "Abdur");
   arr.put(1,"jameel");
   arr.put(2, "suthish");
   System.out.println(arr);
   arr.entrySet();
   Set<Map.Entry<Integer, String>>sm=arr.entrySet();
   List al=new ArrayList(sm);
    System.out.println(al);
	}
}
