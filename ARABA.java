
public class ARABA {
private String color;
private String model;
private double engine;
private int doors;

public  void setColor(String color) {
	this.color = color;
}
public String getColor() {
	return this.color;
	
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public double getEngine() {
	return engine;
}
public void setEngine(double engine) {
	this.engine = engine;
}
public int getDoors() {
	return doors;
}
public void setDoors(int doors) {
	this.doors = doors;
}
public void start() {
	System.out.println("araba �al��t�");
}
public void stop() {
	System.out.println("araba durdu");
}
}
