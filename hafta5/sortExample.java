package hafta5;

import java.util.ArrayList;
import java.util.Collections;

public class sortExample {
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		words.add("onur");// tek tek ekleme yapt�k
		words.add("samand�ra");
		words.add("s�nmez");
		words.add("veri yap�lar�");
		words.add("futbol");
		words.add("formula1");
		words.add("sever");
		words.add("kodlama");
		

		System.out.println("siralamadan once: " + words);
		System.out.println(words.get(2)); //2.indis eleman� getir

		Collections.sort(words); // ALFABETiK 
		System.out.println("siralanmis hali: " + words);

	}
}
