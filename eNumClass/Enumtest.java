package eNumClass;

enum EN {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

public class Enumtest {
	public static void main(String arg[]) {

		EN days[] = EN.values();
		for (EN i : days) {
			System.out.println(i);
		}
	}
}