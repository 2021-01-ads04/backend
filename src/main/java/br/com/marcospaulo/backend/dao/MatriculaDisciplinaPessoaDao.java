package br.com.marcospaulo.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.marcospaulo.backend.model.MatriculaDisciplinaPessoa;

public interface MatriculaDisciplinaPessoaDao extends JpaRepository<MatriculaDisciplinaPessoa, Long> {

}