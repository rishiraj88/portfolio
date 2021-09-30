package java11;

import java.util.Optional;
/**
 * 
 * @author rishiraj
 * to demonstrate Optional.isEmpty() 
 */
public class OptionalIsEmpty {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Optional o = Optional.of(" ");
		o = Optional.empty();
		
		//JDK 11
		System.out.println("is empty?: "+o.isEmpty());
		
	}
}
