package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {

		Collection<Integer> values = new ArrayList();
		//List <Integer> values = new ArrayList();
		
		values.add(1);
		values.add(2);
		values.add(3);
		// values.add("MMk");
		// values.add("9.9");

		for (int X : values) {
			System.out.println(X);

		}

	}

}
