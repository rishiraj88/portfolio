package codility;

import java.util.Arrays;

/**
 * to rotate the elements in input array by k steps right
 * @author rishiraj
 * 20211117
 */
public class ShiftRotateArray {

	public static void main(String[] args) {
		int[] arr = new int[] {0,1,2,3,4,5,6,7,8};
		int k = 2;
		solution(arr, k);
	}
	
	static void solution(int[] a, int k) {
		int[] brr = new int[a.length];
		for(int i : a) {
			brr[ (a.length + i+k)%a.length ] = a[i];
		}
		System.out.println(Arrays.toString(brr));
	}
}
