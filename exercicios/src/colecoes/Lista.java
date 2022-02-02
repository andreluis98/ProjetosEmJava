package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		//Obter elemento da lista atravé do indice
		System.out.println(lista.get(3));
		
		//Remover o elemento através do indice
		lista.remove(1);
		//Removendo através de objeto especifico
		System.out.println(lista.remove(new Usuario ("Manu")));
		
		//Verificar se contem aquele objeto no programa
		System.out.println("" + lista.contains(new Usuario("Lia")));
		
		//Mostrar elementos da lista
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
	}

}
