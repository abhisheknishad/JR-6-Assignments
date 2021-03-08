package streamapi;

import java.util.function.UnaryOperator;

public class FactorialEx5 {

	public static void main(String[] args) {
		UnaryOperator<Integer>operator=num->{
			int fact=1;
			for(int i=1;i<=num;i++) {
				fact=fact*i;
			}
			return fact;
		};
		int result=operator.apply(5);
		System.out.println("result="+result);
	}

}
