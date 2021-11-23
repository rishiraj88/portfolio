import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * return the smallest positive integer that is not contained in the input array.
 * demo codility test for zalando 20211117
 * @author rishiraj
 *
 */
public class Class01 {
	public static void main(String[] args) {
		int[] a = { 1, 3, 6, 4, 1, 2 }; //5
		a = new int[]{ 1, 2,3}; //4
		a = new int[]{ -1, -3}; //1
		System.out.println(solution(a));
	}

	static int solution(int[] A) {
		int out = 1;
		Arrays.sort(A);
		Set<Integer> set = new TreeSet<Integer>();
		for (int i : A) {
			if (i > 0) {
				set.add(i);
			}
		}
		int max = set.stream().mapToInt(i -> i).max().orElse(1);
		for(int n = 1; n <= max; n++) {
			if(!set.contains(n)) {
				return out;
			}
			out++;
		}

		return out;
	}
}