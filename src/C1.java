import java.util.*;
import java.util.Map.Entry;


public class C1 {
	public static void main(String[] args) {
		TreeMap<Integer, String> l = new TreeMap<Integer, String>();
		l.put(1, "A");
		l.put(3,"b");
		l.put(2,"A");
		
for(Map.Entry m :l.entrySet()) {
		System.out.println(m.getKey() +" " + m.getValue());
		
		 }
	}

}
