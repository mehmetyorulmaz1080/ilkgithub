package hafta5;

public class compareExample {

	public static void main(String[] args) {
		Integer x = 10;
		Integer y = 42;
		Integer z = 10;

		System.out.println(x.compareTo(y)); // x'i y ile karsilastirdi
		System.out.println(x.compareTo(z)); // x'i z ile karsilastirdi
		System.out.println(y.compareTo(z)); // y'yi z ile karsilastirdi
       
		
		// compareTo --> sayi1 > sayi2 = 1 
		// compareTo --> sayi1 = sayi2 = 0
		// compareTo --> sayi1 < sayi2 = -1 
	}

}