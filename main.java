
public class main {
public static void main(String[] args) {
	ARABA araba1 = new ARABA();
	araba1.setColor("siyah");
	araba1.setModel("camaro");
	araba1.setEngine(6.0);
	araba1.setDoors(2);
	
	
	
	System.out.println("arabanýn rengi "+araba1.getColor());
	System.out.println("arabanýn modeli "+araba1.getModel());
	System.out.println("arabanýn motoru "+araba1.getEngine());
	System.out.println("arabanýn kapý sayýsý "+araba1.getDoors());
	araba1.start();
	araba1.stop();
}
}
