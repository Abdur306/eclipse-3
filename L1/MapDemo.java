package L1;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Dictionary;
import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
	Dictionary<Integer,String>name=new Hashtable<>();
	name.put(23, "abdur");
	System.out.println(name);
	Map<String,String>name1=new HashMap<>();
	name1.put("C", "apple");
	name1.put("B", "Bat");
	name1.put("A", "Apple");
	Set<Map.Entry<String,String>>set=name1.entrySet();
	Iterator<Map.Entry<String,String>>iter=set.iterator();
	while(iter.hasNext()) {
		Map.Entry<String, String>entry=iter.next();
		System.out.println(entry.getKey()+" "+entry.getValue());
	}
	name1.put(null, "String");name1.put("aras", null);
	name1.put("asas", null);
	System.out.println(name1);
	
	}

}
