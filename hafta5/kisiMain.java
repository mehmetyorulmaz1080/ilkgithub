package hafta5;

import java.util.ArrayList;

public class kisiMain {
	public static void main(String[] args) {
		ArrayList<kisi> bireyler = new ArrayList<>();
        
		bireyler.add(new kisi("Ahmet", 24));
		bireyler.add(new kisi("Kaya", 30));
		bireyler.add(new kisi("Hayri", 40));
       
	
		System.out.println();
		for(kisi birey: bireyler) {
			System.out.println("�sim: " + birey.getIsim()+ "  ,yas : " + birey.getYas());
				/*��kt� �sim: Ahmet  ,yas : 24
				�sim: Kaya  ,yas : 30
				�sim: Hayri  ,yas : 40 */
		}
	}
}
