package CollectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListIterationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names=new ArrayList<String>();
		//add elements to arrayList
		
		names.add("java");
		names.add("micheal");
		names.add("Andy");
		names.add("jim");
		names.add("robert");
		

		System.out.println(names);
		// Iterator INTERface for traversing
		Iterator<String> itr = names.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		System.out.println(names.get(1));

		System.out.println();
		names.add(3, "Raj"); // adding element in specified index
		names.remove(0); // delete first element
		names.set(1, "Java"); // replace existing element
		System.out.println(names);

		System.out.println();

		ArrayList<Double> marks = new ArrayList<Double>();
		marks.add(999.45);
		marks.add(500.20);
		marks.add(768.25);
		marks.add(871.90);
		marks.add(450.45);

		System.out.println();

		for (Double i : marks) {
			System.out.println(i);
		}
		System.out.println();

		Collections.sort(marks);

		

		System.out.println(marks);
	}



}
