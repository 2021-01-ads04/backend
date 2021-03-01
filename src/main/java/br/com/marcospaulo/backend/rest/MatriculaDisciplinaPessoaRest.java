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

import br.com.marcospaulo.backend.dao.MatriculaDisciplinaPessoaDao;
import br.com.marcospaulo.backend.model.MatriculaDisciplinaPessoa;

@RestController
@RequestMapping("/matricula")
public class MatriculaDisciplinaPessoaRest {

	@Autowired
	private MatriculaDisciplinaPessoaDao matriculaDisciplinaPessoaDao;
	
	@GetMapping
	public List<MatriculaDisciplinaPessoa> get() {
		return matriculaDisciplinaPessoaDao.findAll();
	}
	
	@PostMapping
	public void post(@RequestBody MatriculaDisciplinaPessoa matriculaDisciplinaPessoa) {
		matriculaDisciplinaPessoaDao.save(matriculaDisciplinaPessoa);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		matriculaDisciplinaPessoaDao.deleteById(id);
	}
	
	@PutMapping
	public void put(@RequestBody MatriculaDisciplinaPessoa matriculaDisciplinaPessoa) {
		matriculaDisciplinaPessoaDao.save(matriculaDisciplinaPessoa);
	}
}