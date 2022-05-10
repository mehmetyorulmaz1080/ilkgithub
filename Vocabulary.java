import java.io.*;
import java.util.*;

public class Vocabulary {
	
    public static void main(String[] args) throws FileNotFoundException {
	
    	Scanner input = new Scanner(new File("test.txt"));
    	
    	ArrayList<String> list = new ArrayList<String>();
    	
    	list = getwords(input);
    	System.out.println(list);
   }
    
    public static ArrayList<String> getwords(Scanner input){
    	
    	ArrayList<String> words = new ArrayList<String>();
    	
    	System.out.println(input.hasNext());
    	
    	while (input.hasNext()) {
    		words.add(input.next().toLowerCase());
    		/*
			String next = input.next().toLowerCase();
			if (!words.contains(next)) {
				words.add(next);*/
			}
		
    	return words;
    }
}
