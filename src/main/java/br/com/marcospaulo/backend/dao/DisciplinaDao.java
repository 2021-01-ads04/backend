package br.com.marcospaulo.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.marcospaulo.backend.model.Disciplina;

public interface DisciplinaDao extends JpaRepository<Disciplina, Long> {

}