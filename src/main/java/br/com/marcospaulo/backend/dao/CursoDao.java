package br.com.marcospaulo.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.marcospaulo.backend.model.Curso;

public interface CursoDao extends JpaRepository<Curso, Long> {

}