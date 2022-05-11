
public class pointMain2 {
	
public static void main(String[] args) {
	
	Point2 pnt = new Point2();
	pnt.x =3;
	pnt.y =4;
	/*
	pnt.translate(2,-4);
	System.out.println("("+pnt.x+","+pnt.y+")");
	pnt.translate(2, -2);
	System.out.println("("+pnt.x+","+pnt.y+")");
	*/
	
	System.out.println("("+pnt.x+","+pnt.y+")");
	System.out.println("distance from orijn ="+pnt.distanceFromOrijin());
  }
}
