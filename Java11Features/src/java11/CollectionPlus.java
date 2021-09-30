package java11;

import java.util.ArrayList;
import java.util.Arrays;
/**
 * 
 * @author rishiraj
 * to get arrays out of lists
 */
public class CollectionPlus {

	public static void main(String[] args) {

		ArrayList<Integer> integerList = new ArrayList<>();
		integerList.add(1);
		integerList.add(2);
		System.out.println("Integer list: "+integerList);
		
		// JDK 8
		Integer[] integerArr = integerList.stream().toArray(size -> new Integer[size]);
		//System.out.println("Integer array: "+Arrays.toString(integerArr));

		ArrayList<String> sList = new ArrayList<>();
		sList.add("3");
		sList.add("4");
		System.out.println("String list: "+sList);

		// JDK 11
		integerArr = integerList.toArray(size -> new Integer[size]);
		System.out.println("Integer array: "+Arrays.toString(integerArr));
		String[] sArr = sList.toArray(size -> new String[size]);
		System.out.println("String array: "+Arrays.toString(sArr));
	}

}
