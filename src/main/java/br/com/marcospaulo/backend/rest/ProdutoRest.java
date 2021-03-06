package br.com.marcospaulo.backend.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.marcospaulo.backend.dao.ProdutoDao;
import br.com.marcospaulo.backend.model.Produto;

/**
 * @author Marcos Paulo Paixão
 *
 */
@RestController
@RequestMapping("/produtos")
public class ProdutoRest {
	
	/* Atributos */
	@Autowired
	private ProdutoDao dao;

	/* Métodos */
	/**
	 * @return
	 */
	/**
	 * @return
	 */
	@GetMapping
	public List<Produto> get() {
		return dao.findAll();
	}

	/**
	 * @param id
	 * @return
	 */
	@GetMapping("{id}")
	public Produto getById(@PathVariable("id") long id) {
		return dao.findById(id);
	}

	/**
	 * @param produto
	 */
	@PostMapping
	public void post(@RequestBody Produto produto) {
		dao.save(produto);
	}

	/**
	 * @param produto
	 */
	@PutMapping
	public void put(@RequestBody Produto produto) {
		dao.save(produto);
	}

	/**
	 * @param id
	 */
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") long id) {
		dao.deleteById(id);
	}
}
