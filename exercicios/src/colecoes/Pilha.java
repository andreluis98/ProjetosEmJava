package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {

		Deque<String> livros = new ArrayDeque<String>();
		livros.add("O Pequeno Principe");
		livros.push("Dom Quixote");
		livros.add("O Hobbit");
		livros.add("");
		livros.add("");
		livros.add("");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());


		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.pop());
		System.out.println(livros.remove());
	
	}

}
