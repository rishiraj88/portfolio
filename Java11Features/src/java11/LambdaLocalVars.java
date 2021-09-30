package java11;

/*
<!-- https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305 -->
<dependency>
    <groupId>com.google.code.findbugs</groupId>
    <artifactId>jsr305</artifactId>
    <version>3.0.2</version>
</dependency>
*/
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
/**
 * 
 * @author rishiraj
 *	to demonstrate var for lambda functions
 */
public class LambdaLocalVars {
	public static void main(String[] args) {

		var x = 1;
		var y = 2;
		
		//JDK 11 var for annotations
		FuncInter funcObj = (@Nonnull var a,@Nullable var b) -> System.out.println(a + b);
		funcObj.op(x, y);
	}
}

interface FuncInter {
	void op(int a, int b);
}
