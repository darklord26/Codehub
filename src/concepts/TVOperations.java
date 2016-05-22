package concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TVOperations {

	public static void main(String[] args) {
		TV one = new TV(55, "Sony");
		TV two = new TV(45, "Samsung");
		TV three = new TV(70, "Philips");

		List<TV> list = new ArrayList<>();
		list.add(one);
		list.add(two);
		list.add(three);

		Collections.sort(list, SizeCompare);
		for (TV t : list) {
			System.out.println(t.brand);
		}
	}

	public static Comparator<TV> SizeCompare = new Comparator<TV>() {
		@Override
		public int compare(TV one, TV two) {

			if (one.getSize() < two.getSize()) {
				return 1;
			}
			return -1;
		}
	};
}
