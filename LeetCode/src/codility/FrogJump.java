package codility;

/**
 * help a frog jump to a point Y or greater
 * from the point X
 * with steps of D (direction) length
 * 
 * Return the number of steps to take to reach or cross Y
 * 
 * @author rishiraj
 * 20211117
 */
public class FrogJump {
	public static void main(String[] args) {
		int x = 10;
		int y = 85;
		int direction = 30;
		System.out.println(jump(x, y, direction));
	}

	static int jump(int x, int y, int d) {

		int steps;
		int z = y-x;
		int quo = z/d;
		int rem = z%d;
		if(rem != 0) quo+=1;
		return quo;
	}
}
