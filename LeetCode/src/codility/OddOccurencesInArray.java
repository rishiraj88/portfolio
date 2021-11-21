package codility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

/**
 * to return the non-paired element in an array. The array has an odd number of
 * elements.
 * 
 * @author rishiraj 
 * created 20211117
 * updated 20211121
 */
public class OddOccurencesInArray {
	public static void main(String[] args) {
		int[] arr = { 9, 7, 1, 3, 9, 3, 9, 7, 9, 1, 2, 2, 3 };

		System.out.println(odd(arr));
	}

	static int odd(int[] a) {

		int op = Stream.of(a)
				.flatMapToInt(ia -> Arrays.stream(ia))
				.reduce((e1, e2) -> e1 ^ e2).orElse(0);
		return op;
	}

	@Deprecated
	static int odd_archived(int[] a) {
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
