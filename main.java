
public class main {
public static void main(String[] args) {
	ARABA araba1 = new ARABA();
	araba1.setColor("siyah");
	araba1.setModel("camaro");
	araba1.setEngine(6.0);
	araba1.setDoors(2);
	
	
	
	System.out.println("araban�n rengi "+araba1.getColor());
	System.out.println("araban�n modeli "+araba1.getModel());
	System.out.println("araban�n motoru "+araba1.getEngine());
	System.out.println("araban�n kap� say�s� "+araba1.getDoors());
	araba1.start();
	araba1.stop();
}
}
