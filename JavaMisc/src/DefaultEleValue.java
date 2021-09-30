/**
 * 
 * @author rishiraj
 * 
 */
public class DefaultEleValue {
 public static void main(String[] args) {
	int[] intArr = new int[10];
	intArr[0] = 2;
	
	System.out.println(intArr[3]);
	for(int i : intArr) {
		System.out.println("i: "+i);
	}
}
}
