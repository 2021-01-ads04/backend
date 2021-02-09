package br.com.marcospaulo.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.marcospaulo.backend.model.Pessoa;

/**
 * @author Marcos Paulo Paixão
 *
 */
@Repository
public interface PessoaDao extends JpaRepository<Pessoa, Long> {

	/* Métodos */
	/**
	 * @param id
	 * @return pessoa
	 */
	Pessoa findById(long id);
}
