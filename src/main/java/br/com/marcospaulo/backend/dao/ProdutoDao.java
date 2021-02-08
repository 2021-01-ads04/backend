package br.com.marcospaulo.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.marcospaulo.backend.model.Produto;

@Repository
public interface ProdutoDao extends JpaRepository<Produto, Long>{

}
