import java.util.ArrayList;
import java.util.Iterator;

public class KisiMain {
    public static void main(String[] args) {
		
    	ArrayList<Kiþi> bireyler = new ArrayList<>();
    	
    	bireyler.add(new Kiþi("Mehmet", 24));
    	bireyler.add(new Kiþi("Ali", 30));
    	bireyler.add(new Kiþi("hayri", 40));
    	
    	bireyler.forEach(birey ->{
    		System.out.println("isim:"+birey.getIsim()+", yas:"+birey.getYas());
    	});
    	System.out.println();
    	for (Kiþi birey:bireyler) {
    		System.out.println("isim:"+birey.getIsim()+", yas:"+birey.getYas());
		}
    	
    }
	
}
