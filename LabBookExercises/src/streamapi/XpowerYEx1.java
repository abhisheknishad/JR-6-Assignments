package streamapi;
import java.lang.Math;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class XpowerYEx1 {

	public static void main(String args[]) {
	BinaryOperator<Integer>binaryOperator=(a,b)->{
		int result = 1;
		for(int i=1;i<=b;i++) {
			result=result*a;
		}
		return result;
	};
	System.out.println("result="+binaryOperator.apply(2, 3));
	}
}
