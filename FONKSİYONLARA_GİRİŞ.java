import java.security.DomainCombiner;
import java.util.Scanner;

public class FONKSÝYONLARA_GÝRÝÞ {
/*
 * Eriþim_Belirleyici(Opsiyonel) Ekstra_Özellikler Dönüþ_Tipi Fonksiyon_Adý(Parametreler){
 * 
 *    // Burasý fonksiyon bloðu
 *    // Fonksiyonun yapacaðý iþlemler burada olacak
 *    }
 * 
 * 
 */
	/*
	public static void selamlama() {
		System.out.println("herkese merhaba");
		System.out.println("umarým iyisinizdir");
	}
	public static void main(String[] args) {
		selamlama(); // fonksiyon çaðrýsý
		selamlama();
		selamlama();
		selamlama();
		selamlama();
	}
	*/
	
	public static void faktöriyel() {
		Scanner scanner = new Scanner(System.in);
			
		System.out.println("sayý:");
		
		int sayý = scanner.nextInt();
		int faktöriyel =1;
		
		while (sayý>0) {
		
			faktöriyel *= sayý;
			sayý --;
		}
		System.out.println("faktöriyel:"+faktöriyel);
	}
	
	public static void main(String[] args) {

		faktöriyel();
		faktöriyel();
		
		faktöriyel();
	}
	}

