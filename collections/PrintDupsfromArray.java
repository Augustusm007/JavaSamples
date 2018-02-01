package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.lang.String;

public class PrintDupsfromArray {

	public static void main(String[] args) {

		ArrayList<String> A = new ArrayList<>();

		A.add("Aryan");
		A.add("Brenden");
		A.add("Cherry");
		A.add("Cherry");

		Set<String> s = new HashSet<>(); // hash set accepts only unique values

		for (String i : A) {
			if (s.add(i) == false) // if entry added to Hashset successfully it
									// returns boolean
									// value true else false
			{

				System.out.println(i);
			}

		}
	}
}
