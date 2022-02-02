package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		//Quando adicionamos <String> estamos informando que o conteudo dentro do 
		//set e Hashset ser� uma String
		
		//Set<String> listaAprovados = new HashSet<>();//N�o respeita a ordem de inser��o quando mostra no console ou para o usuario ir� mnostrar os dados de forma aleatoria
		SortedSet<String> listaAprovados = new TreeSet<>();//Respeita a ordem de inser��o e mostra conforme os dados s�o inseridos
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		//SortedSet<String> listaAprovados = new TreeSet<>();//Respeita a ordem de inser��o e mostra conforme os dados s�o inseridos
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
