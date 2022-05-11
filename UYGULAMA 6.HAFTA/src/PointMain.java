import java.util.*;
public class PointMain {
	
   public static void main(String[] args) {
	
	   Set<Point> points = new HashSet<Point>();
	   Set<Integer> intss= new HashSet<Integer>();
	   
	   points.add(new Point(3, 4));
	   points.add(new Point(5, 7));
	   points.add(new Point(3, 4));
	   
	  for (Point p : points) {
		System.out.println("("+p.getX()+","+p.getY()+")");
	}
}
}
