package uygulama4;

import java.util.ArrayList;

public class arraylar {

	public static void main(String[] args) {
		
		ArrayList <Integer> numaralar = new ArrayList <>();
		for(int i =1; i<=10; i++)
			numaralar.add(i*10);
		System.out.println("say�lar"+numaralar);
		for(int i =0; i<numaralar.size(); i++) { // [say�lar[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
			numaralar.remove(i);				 //say�lar[20, 30, 40, 50, 60, 70, 80, 90, 100]]
			i--;  								//...
			System.out.println("say�lar"+numaralar);			
			
			
			
		}
		
	}

}
