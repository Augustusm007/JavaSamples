package collections;

import java.util.Comparator;

public class Comimpl implements Comparator <Integer>
{

	public int compare(Integer o1, Integer o2) {
		if (o1%100 < o2%100) {
			return 1;
				}
		return 0;
	}

}
