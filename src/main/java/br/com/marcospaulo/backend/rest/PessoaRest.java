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

import br.com.marcospaulo.backend.dao.PessoaDao;
import br.com.marcospaulo.backend.model.Pessoa;

/**
 * @author Marcos Paulo Paixão
 *
 */
@RestController
@RequestMapping("/pessoas")
public class PessoaRest {

	/* Atributos */
	@Autowired
	private PessoaDao dao;

	/* Métodos */
	/**
	 * @return
	 */
	@GetMapping
	public List<Pessoa> get() {
		return dao.findAll();
	}

	/**
	 * @param id
	 * @return
	 */
	@GetMapping("{id}")
	public Pessoa getById(@PathVariable("id") long id) {
		return dao.findById(id);
	}

	/**
	 * @param pessoa
	 */
	@PostMapping
	public void post(@RequestBody Pessoa pessoa) {
		dao.save(pessoa);
	}

	/**
	 * @param pessoa
	 */
	@PutMapping
	public void put(@RequestBody Pessoa pessoa) {
		dao.save(pessoa);
	}

	/**
	 * @param id
	 */
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") long id) {
		dao.deleteById(id);
	}
}
