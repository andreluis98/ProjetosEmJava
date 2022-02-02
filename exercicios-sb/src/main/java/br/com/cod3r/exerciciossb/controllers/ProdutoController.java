package br.com.cod3r.exerciciossb.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exerciciossb.model.entities.Produto;
import br.com.cod3r.exerciciossb.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
//	@PostMapping
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
	public @ResponseBody Produto salvarProduto(@Valid Produto produto) {
	
		
		produtoRepository.save(produto);
		return produto;
	} 
	
	//Consulta dos dados 
	
	@GetMapping
	public Iterable<Produto> obterProdutos(){
		return produtoRepository.findAll();//Retorna todos os produtos do BDA
	}
	//Obter Produto por nome
	@GetMapping(path = "/nome/{parteNome}")
	public Iterable<Produto> obterProdutosPorNome(@PathVariable String parteNome){
		//return produtoRepository.findByNomeContainingIgnoreCase(parteNome);//Retorna todos os produtos do BDA por nome 
		return produtoRepository.searchByNameLike(parteNome);
	}
	
	//Consulta por pagina paginada
	@GetMapping(path = "/pagina/{numeroPagina}/{qtdePagina}")
	public Iterable<Produto> obterProdutosPorPaginas(@PathVariable int numeroPagina, @PathVariable int qtdePagina){
		if(qtdePagina >= 5) qtdePagina = 5;
		Pageable page = PageRequest.of(numeroPagina, qtdePagina);
		return produtoRepository.findAll(page);
	}
	
	
	//Consultando produto por ID
	@GetMapping(path = "/{id}")
	public Optional<Produto> obterProdutoPorID(@PathVariable int id) {
		return produtoRepository.findById(id);
	}
	
	//Alterando Produto
//	@PutMapping
//	public Produto alterarProduto(@Valid Produto produto) {
//		produtoRepository.save(produto);
//		return produto;
//	}
	//Excluindo por ID
	
	@DeleteMapping(path="{id}")
	public void excluirProdutoPorID(@PathVariable int id) {
		produtoRepository.deleteById(id);
	}
	
}
