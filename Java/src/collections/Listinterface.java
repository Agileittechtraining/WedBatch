package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Listinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List l = new LinkedList();
l.add(1);
l.add(2);
l.add(3); 
l.add("A");
//l.remove(2);
System.out.println(l.size());
for(int i=0;i<l.size();i++) {
	System.out.println(l.get(i));
}
	}
}
