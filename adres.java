package classOgreniyorum;

public class adres {
	public static void main(String[] args) {
		adres1 adr = new adres1 ();
		ogrenci ogr = new ogrenci();
		ogr.adi   =  "onur";
		ogr.soyadi=  "s�nmez";
		adr.cadde = "kavac�k";
		adr.blok  = "yedi";
		adr.no    = "iki";
		adr.sehir = "istanbul";
		adr.ulke  = "T�rkiye";
		ogr.oAdres = adr; 

		System.out.println(ogr.adi);		  // ��rencinin ad�n� yans�tma
		System.out.println(ogr.oAdres.sehir); // ��rencinin �ehrini yans�tma
		System.out.println(ogr.oAdres.ulke);  // ��rencinin �lkesini yans�tma
		
}
}