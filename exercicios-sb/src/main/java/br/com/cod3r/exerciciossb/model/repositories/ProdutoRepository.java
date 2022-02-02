package br.com.cod3r.exerciciossb.model.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import br.com.cod3r.exerciciossb.model.entities.Produto;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer>{
	//metodo para realizar pesquisa por nome
	public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);
	//IgnoreCase está sendo utilizado para ignorar letras maiusculas ou minusculas
	
	
	@Query("SELECT p FROM Produto p WHERE p.nome LIKE %:nome%" )
	public Iterable<Produto> searchByNameLike(@Param("nome") String nome);
}