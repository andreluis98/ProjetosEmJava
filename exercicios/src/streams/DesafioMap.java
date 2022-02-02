package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1 , 2, 3, 4, 5, 6, 7, 8, 9); 
		/*
		 *1. Conveter Numero  para String Binaria... => "110";
		 *2. Reverter a String... "110" => "011";
		 *3. Converter de volta para inteiro "011" = > 3
		 * 
		 * 
		*/
		
		//Converter String Binaria para string normal
		UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();
		//Converter de String para Inteiro
		Function<String, Integer> BinarioParaInt = 
				s -> Integer.parseInt(s, 2);
		
		nums.stream()
		.map(Integer::toBinaryString)//Converte numero inteiro para String no formato binario
		.map(inverter)
		.map(BinarioParaInt)
		.forEach(System.out::println);
	}

}
