package hafta5;

import java.util.ArrayList;

public class fruits {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("elma");
		list.add("muz");
		list.add("portakal");

		System.out.println("listeyi yazdiralim: " + list);
        
		for(String fruit: list) {
			System.out.println(fruit);
			//cýktý  listeyi yazdiralim: [elma, muz, portakal]
			//elma
			//muz
			//portakal
			
			
		}
	}
}
