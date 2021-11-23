import java.util.Arrays;

public class BreakChain {
	public static void main(String[] args) {

		int[] a = { 5, 2, 4, 6, 3, 7 };
		
//		a = new int[]{ 3,3,5,6,67,2,2,5,,63,,3,32,4,34,23,4563};
		System.out.println(solution(a));
	}

	static int solution(int[] A) {

		int[] b = A.clone();
		Arrays.sort(b);

		int min = b[0];
		int minFreq = 0;
		for (int i : b) {
			if (i == b[0])
				minFreq += 1;
			System.out.println("freq :" + minFreq);
		}
		System.out.println(Arrays.toString(b));
		int P = -1;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == b[0]) {
				P = i;
				break;
			}
		}
		System.out.println("P: " + P);
		int Q = -1;
		for (int i = P + 2; i < A.length - 1; i++) {
			if (b[1] == A[i]) {
				Q = i;
				break;
			}
		}
		System.out.println("Q: " + Q);

		min = A[P] + A[Q];

		return min;
	}
}