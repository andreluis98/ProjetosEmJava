package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		//Quando adicionamos <String> estamos informando que o conteudo dentro do 
		//set e Hashset será uma String
		
		//Set<String> listaAprovados = new HashSet<>();//Não respeita a ordem de inserção quando mostra no console ou para o usuario irá mnostrar os dados de forma aleatoria
		SortedSet<String> listaAprovados = new TreeSet<>();//Respeita a ordem de inserção e mostra conforme os dados são inseridos
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		//SortedSet<String> listaAprovados = new TreeSet<>();//Respeita a ordem de inserção e mostra conforme os dados são inseridos
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		for(int n: nums) {
			System.out.println(nums);
		}

	}

}
