package hafta7;
import java.util.Stack;
import java.util.*;
public class QueueExample {

	public static void main(String[] args) {
		String data[]={"java","php","python","C"};
		Queue <String> q = new LinkedList <String>();
		for (String word:data) {
			q.add(word);	
		}
		System.out.println("queue"+q );
		System.out.println("Ýlk eleman-> "+q.peek() );
		System.out.println("kuyruk dolu mu ? "+q.isEmpty() );
		System.out.println("kuyruk"+q );
		System.out.println("Ýlk elemaný sil -> "+q.remove() );
		System.out.println("kuyruk"+q );
	}

}
