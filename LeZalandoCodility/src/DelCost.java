
public class DelCost {
	public static void main(String[] args) {
		String s = "abccbd";
		int[] c = { 0, 1, 2, 3, 4, 5 };

//		s = "aabbcc"; 		c = new int[] { 1, 2, 1, 2, 1, 2 };

//		s = "aaaa"; 		c = new int[] { 3, 4, 5, 6 };

//		s = "aba"; 		c = new int[] { 10, 5, 10, 5, 10 };

		System.out.println(solution(s, c));
	}
	
	static int solution(String S, int[] C) {
		int minCost = 0;
		
		int[][] costMap = new int[100000][];
		for(int i =0;i < S.length();i++) {
			for(int j = 0;j<10000;j++) {
				if(C[i] == C[i+j])
					costMap[i][0] = C[i+j];
				else break;
			}
		}
		
		
		
		return minCost ;
	}

/*	static int solution(String S, int[] C) {
		int gMin = 0;
		int max = 0;
		
		int grandTotal = 0;
		for(int i : C) {
			grandTotal += i;System.out.println("grandTotal: " +grandTotal);
			 
		}
		
		int totalMax = 0;

		for (int i = 0; i < S.length() - 1; i++) {
			max = C[i];
			if (S.charAt(i) == S.charAt(i + 1)) {
				if (C[i + 1] >= C[i]) {
					max = C[i + 1];
					C[i] = 0; 
					totalMax += max;
				} else {
					C[i + 1] = 0;
				}
			} else {totalMax += C[i];}
		}
		
		//if(S.charAt(S.length()-1)!= S.charAt(S.length()-2)) totalMax += C[S.length()-1];

		System.out.println("grandTotal: " +grandTotal);
		System.out.println("totalMax: " +totalMax);
		gMin = grandTotal - totalMax;
		
		
		return gMin;
	}*/
}