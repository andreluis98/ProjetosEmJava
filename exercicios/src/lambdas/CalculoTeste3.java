package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
		public static void main(String[] args) {
			
			//Criando fun??o lambda
			BinaryOperator<Double> soma = (x, y) -> {	return x + y;};
			System.out.println(soma.apply(2.0, 3.0));
			
			BinaryOperator<Integer> soma2 = (x, y) -> {	return x + y;};
			System.out.println(soma2.apply(2, 3));
			
			BinaryOperator<Double> calc = (x, y) ->  x * y;
			System.out.println(calc.apply(2.0, 3.0));
			
			BinaryOperator<Integer> calc2 = (x, y) ->  x * y;
			System.out.println(calc2.apply(2, 3));
		}
}
