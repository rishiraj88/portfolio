
public class Z01 {
	public static void main(String[] args) {
		String s = "50552";
		s = "10101";
		s = "88";

		s = "99384893948939387489388439059345345435";
		System.out.println(solution(s));

		s = "8742043002434023040234";
		System.out.println(solution(s));

		s = "342342323432424";
		System.out.println(solution(s));

		s = "121213455";
		System.out.println(solution(s));

		s = "999999999999999994949";
		System.out.println(solution(s));

		s = "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111191111111";

		System.out.println(solution(s));
	}

	static int solution(String S) {
		int maxOut = 0;

		for (int i = 0; i < S.length() - 1; i++) {
			int newNum = Integer.parseInt(S, i, i + 2, 10);
			System.out.print(newNum + " ");
			if (newNum > maxOut)
				maxOut = newNum;

		}
		System.out.println();
		return maxOut;
	}
}
