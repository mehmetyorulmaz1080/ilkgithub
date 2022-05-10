package classOgreniyorum;

public class adres {
	public static void main(String[] args) {
		adres1 adr = new adres1 ();
		ogrenci ogr = new ogrenci();
		ogr.adi   =  "onur";
		ogr.soyadi=  "sönmez";
		adr.cadde = "kavacýk";
		adr.blok  = "yedi";
		adr.no    = "iki";
		adr.sehir = "istanbul";
		adr.ulke  = "Türkiye";
		ogr.oAdres = adr; 

		System.out.println(ogr.adi);		  // öðrencinin adýný yansýtma
		System.out.println(ogr.oAdres.sehir); // öðrencinin þehrini yansýtma
		System.out.println(ogr.oAdres.ulke);  // öðrencinin ülkesini yansýtma
		
}
}