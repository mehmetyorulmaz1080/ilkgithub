import java.util.ArrayList;
import java.util.Iterator;

public class KisiMain {
    public static void main(String[] args) {
		
    	ArrayList<Ki�i> bireyler = new ArrayList<>();
    	
    	bireyler.add(new Ki�i("Mehmet", 24));
    	bireyler.add(new Ki�i("Ali", 30));
    	bireyler.add(new Ki�i("hayri", 40));
    	
    	bireyler.forEach(birey ->{
    		System.out.println("isim:"+birey.getIsim()+", yas:"+birey.getYas());
    	});
    	System.out.println();
    	for (Ki�i birey:bireyler) {
    		System.out.println("isim:"+birey.getIsim()+", yas:"+birey.getYas());
		}
    	
    }
	
}
