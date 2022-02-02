package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		//Criando uma fila
		Queue<String> fila = new LinkedList<>();
		
		//offer e add -> Adicionam  elementos na fila
		//Diferen�a � o comportamento quando a fila est� cheia

		fila.add("Ana"); //Retorna false
		fila.offer("Bia");//Lan�a uma exce��o
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		
		//peek e element -> obter o proximo elementos da fila(Sem Remover)
		//Diferen�a � o comportamento quando a fila est� vazia
		
		System.out.println(fila.peek()); //Retorna o elemento da fila, caso n�o tenha elementos na fila retorna nulo
		System.out.println(fila.element()); //Retorna o elemento da fila se n�o tiver elementos na fila retorna um erro
		
		
		//pool e remove -> obter o proximo elementos da fila e remove
		//Diferen�a � o comportamento quando a fila est� vazia
		System.out.println(fila.poll());// Retorna Null
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());// Retorna um erro (Exce��o)
		
	}

}
