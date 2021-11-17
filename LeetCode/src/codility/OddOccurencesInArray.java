package codility;

import java.util.HashSet;
import java.util.Set;

/**
 * to return the non-paired element in an array. The array has an odd number of
 * elements.
 * 
 * @author rishiraj
 * 20211117
 *
 */
public class OddOccurencesInArray {
	public static void main(String[] args) {
		int[] arr = { 9, 7,1 , 3, 9, 3, 9, 7, 9 };

		System.out.println(odd(arr));
	}

	static int odd(int[] a) {
		Set<Integer> set = new HashSet<Integer>();

		for (int iv : a) {
			if (set.contains(iv)) {
				set.remove(iv);
			} else {
				set.add(iv);
			}
		}
		int op = set.stream().mapToInt(i -> i).findFirst().getAsInt();
		return op;
	}
}
