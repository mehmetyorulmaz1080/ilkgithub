package hafta5;

import java.util.ArrayList;

public class starAdd {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		words.add("kalem");// tek tek ekleme yapt�k
		words.add("bilgisayar");
		words.add("bartin");
		words.add("kitapc�k");

		System.out.println("donguden once: " + words);
		System.out.println("uzunluk: " + words.size());

		

		for (int index = 0; index < words.size(); index += 2)
			words.add(index, "*"); //ko�ula g�re * ekleme ger�ekle�tirdik

		System.out.println("donguden sonra: " + words);
		System.out.println("uzunluk: " + words.size());

		

		for (int index = 0; index < words.size(); index++)
			words.remove(index); // ko�ula g�re * sildik

		System.out.println("ikinci donguden sonra: " + words);
		System.out.println("ikinci donguden sonra uzunluk: " + words.size());

		for (int index = words.size() - 2; index >= 0; index -= 2)
			words.remove(index);

		System.out.println("ucuncu donguden sonra: " + words);
		System.out.println("ucuncu donguden sonra uzunluk: " + words.size());
		
	}

}
