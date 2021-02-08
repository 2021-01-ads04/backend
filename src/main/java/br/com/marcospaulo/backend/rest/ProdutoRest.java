package br.com.marcospaulo.backend.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.marcospaulo.backend.dao.ProdutoDao;
import br.com.marcospaulo.backend.model.Produto;

@RestController
@RequestMapping("/produtos")
public class ProdutoRest {

	@Autowired
	private ProdutoDao dao;

	@GetMapping
	public List<Produto> get() {
		return dao.findAll();
	}
	
	@PostMapping
	public void post(@RequestBody Produto produto) {
		dao.save(produto);
	}

}
