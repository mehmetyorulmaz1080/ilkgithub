import java.security.DomainCombiner;
import java.util.Scanner;

public class FONKS�YONLARA_G�R�� {
/*
 * Eri�im_Belirleyici(Opsiyonel) Ekstra_�zellikler D�n��_Tipi Fonksiyon_Ad�(Parametreler){
 * 
 *    // Buras� fonksiyon blo�u
 *    // Fonksiyonun yapaca�� i�lemler burada olacak
 *    }
 * 
 * 
 */
	/*
	public static void selamlama() {
		System.out.println("herkese merhaba");
		System.out.println("umar�m iyisinizdir");
	}
	public static void main(String[] args) {
		selamlama(); // fonksiyon �a�r�s�
		selamlama();
		selamlama();
		selamlama();
		selamlama();
	}
	*/
	
	public static void fakt�riyel() {
		Scanner scanner = new Scanner(System.in);
			
		System.out.println("say�:");
		
		int say� = scanner.nextInt();
		int fakt�riyel =1;
		
		while (say�>0) {
		
			fakt�riyel *= say�;
			say� --;
		}
		System.out.println("fakt�riyel:"+fakt�riyel);
	}
	
	public static void main(String[] args) {

		fakt�riyel();
		fakt�riyel();
		
		fakt�riyel();
	}
	}

