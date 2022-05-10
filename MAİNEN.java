
public class MAÝNEN {
public static void main(String[] args) {
		ARABAEN araba1 = new ARABAEN();
		araba1.setColor("siyah");
		araba1.setModel("camaro");
		araba1.setEngine(6.0);
		araba1.setDoors(4);
		
		
		
		System.out.println("arabanýn rengi "+araba1.getColor());
		System.out.println("arabanýn modeli "+araba1.getModel());
		System.out.println("arabanýn rengi "+araba1.getEngine());
		System.out.println("arabanýn kapý sayýsý "+araba1.getDoors());
		araba1.start();
		araba1.stop();
}
}
