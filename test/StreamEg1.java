package test;

import java.util.ArrayList;
import java.util.List;

public class StreamEg1 {

	public static void main(String[] args) {

		List <Integer> values = new ArrayList<>();
		for (int i =0;i<=100;i++) {
			values.add(i);

		}
		
		values.parallelStream().forEach(System.out::println);

	}


}
