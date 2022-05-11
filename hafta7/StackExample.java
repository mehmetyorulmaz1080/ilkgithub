package hafta7;

import java.util.Stack;
import java.util.*;
public class StackExample {

	public static void main(String[] args) {
		String data[]={"java","php","python","C"};
Stack <String> s = new Stack <String>();
for (String word:data) {
	s.push(word);	
}
System.out.println("Stack"+s );
System.out.println("en son eleman-> "+s.peek() );
System.out.println("en son elemaný döndür ardýndan sil-> "+s.pop() );
System.out.println("Stack"+s );


	}

}
