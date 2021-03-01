package br.com.marcospaulo.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.marcospaulo.backend.model.Turma;

public interface TurmaDao extends JpaRepository<Turma, Long> {

}