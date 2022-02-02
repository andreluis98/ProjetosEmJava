package lambdas;

public class CalculoTeste2 {
		public static void main(String[] args) {
			
			//Criando função lambda
			Calculo soma = (x, y) -> {	return x + y;};
			System.out.println(soma.executar(2, 3));
			Calculo multiplicar = (x, y) ->  x * y;
			System.out.println(multiplicar.executar(2, 3));
		}
}
