package br.com.marcospaulo.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.marcospaulo.backend.model.Produto;

/**
 * @author Marcos Paulo Paixão
 *
 */
@Repository
public interface ProdutoDao extends JpaRepository<Produto, Long>{
	
	/* Métodos */
	/**
	 * @param id
	 * @return produto
	 */
	Produto findById(long id);
}
