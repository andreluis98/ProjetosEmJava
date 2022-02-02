package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "unchecked", "rawtypes"})
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		//Adcionando elementos .add
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho é " + conjunto.size());

		//Removendo elementos Retorna falso se não conseguir remover e retorna verdadeiro se cosneguir
		System.out.println(conjunto.remove('x'));
		
		//Consultando determinado objeto  dentro do programa 
		//Retorna true caso encontre se não encontrar retorna false
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		
		
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		//Unindo conjunto com nums 
		//conjunto.addAll(nums);//Uniao entre dois conjuntos
		
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
	}

}
