import java.util.ArrayList;

public class Fruits {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("elma");
		list.add("muz");
		list.add("portakal");
		
		System.out.println(list);
		
		for(String fruit:list)
			System.out.println(fruit);
	}
}
