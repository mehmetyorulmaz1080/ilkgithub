import java.util.*;

public class Sets {
public static void main(String[] args) {
	
	ArrayList<String> lists = new ArrayList<String>();
	
	lists.add("kalem");
	lists.add("masa");
	lists.add("bilgiayar");
	lists.add("defter");
	lists.add(3,"dolap");
	lists.add("kalem");
	lists.add("masa");
	
	//System.out.println(lists);
	//System.out.println(lists.size());
	//lists.get(0);
	//treeset hashset
	
	Set<String> sets = new TreeSet<String>();
	
	sets.add("kalem");
	sets.add("masa");
	sets.add("bilgiayar");
	sets.add("defter");
	sets.add("dolap");
	sets.add("kalem");
	sets.add("masa");
	
	System.out.println(sets);
	System.out.println(sets.size());
	System.out.println(sets.contains("dolap"));
	
	sets.clear();
	System.out.println(sets);
	sets.addAll(lists);
	
	System.out.println(sets);
	System.out.println(lists.get(2));
	
  }
}
