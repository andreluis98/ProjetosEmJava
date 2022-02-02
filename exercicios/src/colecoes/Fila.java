package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		//Criando uma fila
		Queue<String> fila = new LinkedList<>();
		
		//offer e add -> Adicionam  elementos na fila
		//Diferença é o comportamento quando a fila está cheia

		fila.add("Ana"); //Retorna false
		fila.offer("Bia");//Lança uma exceção
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		
		//peek e element -> obter o proximo elementos da fila(Sem Remover)
		//Diferença é o comportamento quando a fila está vazia
		
		System.out.println(fila.peek()); //Retorna o elemento da fila, caso não tenha elementos na fila retorna nulo
		System.out.println(fila.element()); //Retorna o elemento da fila se não tiver elementos na fila retorna um erro
		
		
		//pool e remove -> obter o proximo elementos da fila e remove
		//Diferença é o comportamento quando a fila está vazia
		System.out.println(fila.poll());// Retorna Null
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());// Retorna um erro (Exceção)
		
	}

}
